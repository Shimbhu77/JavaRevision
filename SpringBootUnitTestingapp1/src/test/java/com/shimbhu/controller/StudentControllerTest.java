package com.shimbhu.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shimbhu.model.Student;
import com.shimbhu.service.StudentService;

@WebMvcTest(controllers = StudentController.class)

public class StudentControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private StudentService studentService;

	private Student requestStudent;
	private Student responseStudent;

	@BeforeEach
	public void init() {

		requestStudent = new Student();
		requestStudent.setName("Ram");
		requestStudent.setAddress("delhi");
		requestStudent.setMarks(80);

		responseStudent = new Student();
		responseStudent.setRoll(10);
		responseStudent.setName("Ram");
		responseStudent.setAddress("delhi");
		responseStudent.setMarks(80);

	}

	@Test
	@DisplayName("Student can be created")
	public void testRegisterStudentHandler_whenValidDetailsProvided_returnRegisteredStudent() throws Exception {
		// Arrange
		Mockito.when(studentService.addStudent(any(Student.class))).thenReturn(responseStudent);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/students")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(new ObjectMapper().writeValueAsString(requestStudent));
		
		// Act
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
		String responseBodyAsString = mvcResult.getResponse().getContentAsString();

		Student createdStudent = new ObjectMapper().readValue(responseBodyAsString, Student.class);
		
		// Assert
		assertEquals(responseStudent.getName(), createdStudent.getName(), "returned created Student Name is incorrect");
		assertNotNull(createdStudent.getRoll(), "created Customer id should not be empty");
	}

	@Test
	@DisplayName("name size should be min 3 and max 20 charecters")
	void testCreateCustomer_whenFirstNameIsOnlyOneCharecter_returns400StatusCode() throws Exception {
		
		// Arrange
		Mockito.when(studentService.addStudent(any(Student.class))).thenReturn(responseStudent);
		requestStudent.setName("S"); // lets provide invalid Name
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/students")
				.contentType(MediaType.APPLICATION_JSON_VALUE).accept(MediaType.APPLICATION_JSON_VALUE)
				.content(new ObjectMapper().writeValueAsString(requestStudent));
		
		// Act
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
		
		// Assert
		assertEquals(HttpStatus.BAD_REQUEST.value(), mvcResult.getResponse().getStatus(),
				"Http Status code is not set to 400");
	}

}

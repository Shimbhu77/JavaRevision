package com.shimbhu.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//import org.apache.tomcat.util.http.fileupload.IOUtils;

public class TensorFlowUtil {

	static byte[] readAllBytes(String path) throws IOException {
        try (InputStream inputStream = new FileInputStream(path)) {
            return IOUtils.toByteArray(inputStream);
        }
    }
}

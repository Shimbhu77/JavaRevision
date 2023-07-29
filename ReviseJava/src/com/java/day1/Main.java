package com.java.day1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> unsortedMap = new HashMap<>();
        unsortedMap.put(3, "Three");
        unsortedMap.put(1, "One");
        unsortedMap.put(2, "Two");
        
        List<Map.Entry<Integer, String>> sortedList = new ArrayList<>(unsortedMap.entrySet());

        // Sorting the list based on keys
        Collections.sort(sortedList, Map.Entry.comparingByKey());

        // Printing the sorted entries
        for (Map.Entry<Integer, String> entry : sortedList) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

package org.example;


import java.util.Random;

public class RendezesiAlgoritmusok {
    
    private static Integer[] generateTestArray(int sizeOfArray) {
        Integer[] testArray = new Integer[sizeOfArray];
        Random rnd = new Random();
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = rnd.nextInt(0,1000);
        }
        return testArray;
    }
    
    private static void bubbleSorting(Integer[] input) {
        for (int i = input.length; i > 1; i--) {
            for (int j = 0; j < i-1; j++) {
                Integer current = input[j];
                Integer next = input[j+1];
                
                if (current > next) {
                    input[j] = next;
                    input[j + 1] = current;
                }
            }
        }
    }
    
    public static Integer[] getGenerateTestArray(int sizeOfArray) {
        return generateTestArray(sizeOfArray);
    }
    
    public static void getBubbleSorting(Integer[] input) {
        bubbleSorting(input);
    }
    
    
    
    
    
    
}

package org.example;

import org.example.Reservoir.Reservoir;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fizz Buzz!");
        FizzBuzz.getFizzBuzz();
        System.out.println("---");
        
        System.out.println("Bubble sorting");
        Integer[] testArray = RendezesiAlgoritmusok.getGenerateTestArray(100);
        RendezesiAlgoritmusok.getBubbleSorting(testArray);
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }
        System.out.println("---");
        
        System.out.println("Details of a number");
        Szamolo.getDetailsOfNumber(78);
        System.out.println("---");
        
        System.out.println("Fibonacci Number");
        System.out.println(Fibonacci.getFibonacci(15));
        System.out.println("---");
        
        Reservoir land1 = new Reservoir(10,10);
        land1.printDetails();
        
    
    
    
    
    
    
    }
}
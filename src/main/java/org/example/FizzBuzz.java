package org.example;

public class FizzBuzz {
//    Írj Java programot, ami kiírja 1-től 100-ig az összes egész számot a standard kimenetre, mindegyiket külön sorba!
//    Ha a szám osztható 3-mal, akkor írja mellé, hogy Fizz!
//    Ha a szám osztható 5-tel, akkor írja mellé, hogy Buzz!
//    Ha a szám osztható 3-mal is és 5-tel is (vagyis a szám osztható 15-tel), akkor írja mellé, hogy Fizz Buzz!

    private static void fizzBuzz(){
        Integer[] printArray = new Integer[100];
        
        for (int i = 0; i < printArray.length; i++) {
            printArray[i] = i + 1;
        }
        
        for (int i = 0; i < printArray.length; i++) {
            Integer victim = printArray[i];
            if (victim % 3 == 0 && victim % 5 == 0){
                System.out.println(victim + " Fizz Buzz!");
            } else if (victim % 3 == 0) {
                System.out.println(victim + " Fizz!");
            } else if (victim % 5 == 0) {
                System.out.println(victim + " Buzz!");
            }
            else {
                System.out.println(victim);
            }
        }
    }
    
    public static void getFizzBuzz(){
        fizzBuzz();
    }
}



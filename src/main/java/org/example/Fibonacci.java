package org.example;

public class Fibonacci {
//    Írj Java programot, ami tartalmaz egy getFibonacciNumber nevű metódust, aminek a visszatérési értékének típusa long, a bemeneti paramétere int típusú és a bemeneteként kapott számadik Fibonacci számot adja vissza eredményül!
//    Kérdezd le a 0., az 1., a 9., a 45. és a 80. Fibonacci számot ennek a metódusnak a meghívásával úgy, hogy átadod neki a 0, 1, 9, 45 és 80 számokat.
//    A metódus eredményét a standard kimenetre írd ki!
//    A 0. Fibonacci szám 0.
//    Az 1. Fibonacci szám 1.
//    A 2. Fibonacci szám 1.
//    A 3. Fibonacci szám 2.
    
    private static Integer fibonacci(Integer input) {
        Integer[] fibonacciNumbers = new Integer[100];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;
        for (int i = 2; i < fibonacciNumbers.length; i++) {
            Integer a = fibonacciNumbers[i-2];
            Integer b = fibonacciNumbers[i-1];
            
            fibonacciNumbers[i] = a + b;
        }
        Integer result = fibonacciNumbers[input];
        return result;
        //System.out.println("The )" + input + ". element in Fibonacci sequence is " + result + ".");
    }
    
    public static Integer getFibonacci(Integer input) {
        return fibonacci(input);
    }
    
    
}

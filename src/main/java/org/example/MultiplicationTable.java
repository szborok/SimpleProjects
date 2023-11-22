package org.example;

import java.util.Scanner;

public class MultiplicationTable {
//    Írj Java programot, ami bekér a felhasználótól két egész számot!
//    A 10-e szorzótáblának csak a megadott számú sorait és oszlopait írj ki a standard kimenetre!
//    Használj tabulátort (\t) a szorzótábla celláinak táblázatba rendezéséhez!
//    Példa:
//    Ha a felhasználó a 3 és a 8 számokat adta meg, akkor csak a 3. és 8. sor és a 3. és 8. oszlop jelenjen meg!

    public static void rowAndColumnOfMultiplyTableOf10() {
        System.out.println("Choose a number between 1 and 10.");
        Integer input1 = userInput();
        System.out.println("Choose a number again between 1 and 10.");
        Integer input2 = userInput();
        
        // Kiírjuk a szorzótáblát a megadott sorok és oszlopok alapján
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                // Csak a megadott sorok és oszlopok kerülnek kiírásra
                if (i == input1 || j == input2) {
                    System.out.print(i * j + "\t");
                } else {
                    // Ha nem tartozik a kiválasztott sorhoz vagy oszlophoz, üres hely kerül be
                    System.out.print("\t");
                }
            }
            System.out.println(); // Új sor a következő sorhoz
        }
    }
    
    private static Integer userInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }







}

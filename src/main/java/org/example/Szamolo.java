package org.example;

public class Szamolo {
//    Készíts egy programot, melyben definiálsz egy int típusú változót, ennek adj meg tetszőleges értéket. Döntsd el róla a következő állításokat és minden esetben írja ki a program a felhasználónak teljes mondattal, hogy igaz-e a változó értékére az adott állítás.
//    A szám decimálisan ábrázolva 2 jegyű
//    Az érték 40 százaléka nagyobb vagy egyenlő mint 12
//    A szám osztható 5-tel

    private static void detailsOfNumber(Integer input) {
        System.out.println("A valasztott szam: " + input);
        
        System.out.print("A szám decimálisan ábrázolva 2 jegyű: ");
        System.out.println();
        
        
        System.out.print("Az érték 40 százaléka nagyobb vagy egyenlő mint 12: ");
        if ((input / 100 * 40) >= 12) {
            System.out.println("Igaz");
        }
        else {
            System.out.println("Hamis");
        }
        
        System.out.print("A szám osztható 5-tel: ");
        if (input % 5 == 0) {
            System.out.println("Igaz");
        }
        else {
            System.out.println("Hamis");
        }
    }
    
    public static void getDetailsOfNumber(Integer input) {
        detailsOfNumber(input);
    }
    
    
    
}

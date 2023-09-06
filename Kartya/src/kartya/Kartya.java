
package kartya;

import java.util.Scanner;

public class Kartya {

    public static void main(String[] args) {
        Kirak();
        Melyik();
        Kever();
        EzVolt();
    }
    private static void Kirak() {
       int[] tomb = new int[21];
       for (int i = 0; i < 21; i++) {
            tomb[i] = i + 1;
            
        }
    }

    private static void Melyik() {
        Scanner beker = new Scanner(System.in);
        int szam;
        System.out.println("Irj egy számot!: ");
        szam = beker.nextInt();
    }

    private static void Kever() {
    }

    private static void EzVolt() {
        
    }
    
}

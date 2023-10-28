package org.example;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem, adja meg a felhasználónevét: ");
        String username = scanner.nextLine();


        boolean exit = false;
        while (!exit) {
            System.out.println("\n** Alapmenü **");
            System.out.println("1. Pályaszerkesztés");
            System.out.println("2. Fájlból beolvasás");
            System.out.println("3. Adatbázisból betöltés");
            System.out.println("4. Adatbázisba mentés");
            System.out.println("5. Játék");
            System.out.println("6. Kilépés");

            System.out.print("Kérem, válasszon egy menüpontot: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    System.out.println("Pályaszerkesztés funkció kiválasztva.");
                    System.out.println();
                    break;
                case 2:

                    System.out.println("Fájlból beolvasás funkció kiválasztva.");

                    break;
                case 3:

                    System.out.println("Adatbázisból betöltés funkció kiválasztva.");

                    break;
                case 4:

                    System.out.println("Adatbázisba mentés funkció kiválasztva.");

                    break;
                case 5:

                    System.out.println("Játék funkció kiválasztva.");

                    break;
                case 6:

                    System.out.println("Kilépés a programból.");
                    exit = true;
                    break;
                default:
                    System.out.println("Érvénytelen választás. Kérem, válasszon ismét.");
                    break;
            }
        }
    }
}



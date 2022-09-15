import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Database database = new Database();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til SuperHelt Databasen 2022!");
        System.out.println("----------------------");

        int menuvalg;

        do {
            System.out.println("1. Opret superhelt: ");
            System.out.println("3. Søg i databasen");
            System.out.println("5. Se listen af superhelte: ");
            System.out.println("9. Afslut: ");
            menuvalg = scanner.nextInt();
            scanner.nextLine();

            if (menuvalg == 1) {
                System.out.println("Indtast nye superhelts navn: ");
                String navn = scanner.nextLine();
                System.out.println("Indtasat Superheltens rigtige navn: ");
                String rigtigNavn = scanner.nextLine();
                System.out.println("Indtast Superheltens superkræfter: ");
                String superkræft = scanner.nextLine();
                System.out.println("Indtast Superheltens powerlevel: ");
                double powerlevel = scanner.nextDouble();
                System.out.println("Indtast Superheltens opdagelses år: ");
                int opdagelsesÅr = scanner.nextInt();
                System.out.println("Superhelt er nu oprettet\n");
                database.createSuperhero(navn, rigtigNavn, superkræft, powerlevel, opdagelsesÅr);
            }

            if (menuvalg == 3) {
                System.out.println("Søg efter helt: ");
                String søgning = scanner.nextLine();
                Superhero fundet = database.searchForSuperhero(søgning);
                System.out.println("Superhelt navn: " + fundet.getSuperheltnavn());
                System.out.println("Superhelts rigtige navn: " + fundet.getRigtigenavn());
                System.out.println("Superkræft: " + fundet.getSuperkræft());
                System.out.println("Powerevel: " + fundet.getPowerlevel());
                System.out.println("Opdagelsesår: " + fundet.getOpdagelsesår());
                System.out.println(" ");

            }

            if (menuvalg == 5) {
                for (Superhero superhero : database.getSuperheroes()) {
                    String søgning = scanner.nextLine();
                    System.out.println("Superhelt navn: " + superhero.getSuperheltnavn());
                    System.out.println("Superhelts rigtige navn: " + superhero.getRigtigenavn());
                    System.out.println("Superkræft: " + superhero.getSuperkræft());
                    System.out.println("Powerevel: " + superhero.getPowerlevel());
                    System.out.println("Opdagelsesår: " + superhero.getOpdagelsesår());
                    System.out.println(" ");

                }
            } else if (menuvalg == 9) ;

        } while (menuvalg != 9);
        System.out.println("Programmet afsluttes");
    }
}


        /*Superhero superhelt1 = new Superhero("Spiderman", "Peter Parker", "spider abilities", "stærk", 2000);
        Superhero superhelt2 = new Superhero("Dr. Strange", "Stephen Strange", "magi", "meget stærk", 1980);
        Superhero superhelt3 = new Superhero("Captain America", "Steve Rogers", "superhuman", "meget stærk", 1945);
        Superhero superhelt4 = new Superhero("Batman", "Bruce Wayne", "flagermusmand", "stærk", 1990);
        Superhero superhelt5 = new Superhero("Deadpool", "Wade Wilson", "immortal", "meget stærk", 1999);

        Superhero[] superheroes = new Superhero[]{superhelt1, superhelt2, superhelt3, superhelt4, superhelt5};*/

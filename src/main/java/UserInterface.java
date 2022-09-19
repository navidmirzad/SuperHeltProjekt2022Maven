import java.util.Scanner;

public class UserInterface {

    Database database = new Database();
    Scanner scanner = new Scanner(System.in);

    private void startProgram() {
        System.out.println("Velkommen til SuperHelt Databasen 2022!");
        System.out.println("----------------------");

    }

    private void menuvalg() {

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
                System.out.println("Rediger data og tryk Enter. Hvis data ikke skal redigeres tryk kun Enter");
                System.out.println("Skriv '0' for at ændre > powerlevel & opdagelsesår: \n");
                System.out.println("Superhelt navn: " + fundet.getSuperheltNavn());
                String newName = scanner.nextLine();
                if (!newName.isEmpty())
                    fundet.setSuperheltNavn(newName);

                System.out.println("Superhelts rigtige navn: " + fundet.getRigtigenavn());
                String newRealName = scanner.nextLine();
                if (!newRealName.isEmpty())
                    fundet.setRigtigeNavn(newRealName);

                System.out.println("Superkræft: " + fundet.getSuperkræft());
                String newSuperpower = scanner.nextLine();
                if (!newSuperpower.isEmpty())
                    fundet.setSuperkræft(newSuperpower);


                System.out.println("Powerevel: " + fundet.getPowerlevel());
                // TODO: Make powerlevel editable
                /*double newPowerlevel = scanner.nextDouble();
                if (newPowerlevel == 0)
                    fundet.setPowerlevel(newPowerlevel);*/

                    System.out.println("Opdagelsesår: " + fundet.getOpdagelsesår());
                    // TODO: Make discovery year editable
                    /*int newDiscoveryYear = scanner.nextInt();
                    if (newDiscoveryYear == 0)
                        fundet.setPowerlevel(newDiscoveryYear);*/
            }

            if (menuvalg == 5) {
                for (Superhero superhero : database.getSuperheroes()) {
                    String søgning = scanner.nextLine();
                    System.out.println("Superhelt navn: " + superhero.getSuperheltNavn());
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

    public void start() {
        startProgram();
        menuvalg();
    }


}

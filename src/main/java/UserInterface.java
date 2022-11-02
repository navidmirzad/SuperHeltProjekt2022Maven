import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

    Controller controller = new Controller();
    Scanner scanner = new Scanner(System.in);
    int menuvalg;


    private void startProgram() {
        System.out.println("Velkommen til SuperHelt Databasen 2022!");
        System.out.println("----------------------");

        // NB: Midlertidig testdata - husk at fjerne
      //  controller.createTestData();

    }

    private void menuvalg() throws FileNotFoundException {

        do {
            System.out.println("1. Opret superhelt: ");
            System.out.println("2. Søg i databasen");
            System.out.println("3. Se listen af superhelte: ");
            System.out.println("4. Slet fra liste af superhelte: ");
            System.out.println("5. Gem data: (NOT IMPLEMENTED)");
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
                //   System.out.println("Indtast Superheltens powerlevel: ");
                double powerlevel = 0;
                int opdagelsesÅr = 0;

                boolean error = false;
                do {
                    error = false;
                    try {
                        System.out.println("Indtast Superheltens powerlevel: ");
                        powerlevel = scanner.nextDouble();
                    } catch (InputMismatchException ime) {
                        System.out.println("Indtast en numerisk værdi: ");
                        error = true;
                        scanner.nextLine();
                    }
                } while (error);

                do {
                    error = false;
                    try {
                        System.out.println("Indtast Superheltens opdagelsesår: ");
                        opdagelsesÅr = scanner.nextInt();
                    } catch (InputMismatchException ime) {
                        System.out.println("Indtast en numerisk værdi: ");
                        error = true;
                        scanner.nextLine();
                    }
                } while (error);

                System.out.println("Superhelt er nu oprettet\n");
                controller.createSuperhero(navn, rigtigNavn, superkræft, powerlevel, opdagelsesÅr);
            }
            if (menuvalg == 2) {

                Superhero fundet = null;
                boolean error = false;
                do {
                    error = false;
                    System.out.println("Søg efter helt: ");
                    String searchTerm = scanner.nextLine();
                    fundet = controller.searchForSuperhero(searchTerm);
                    if (fundet != null) {
                        System.out.println("Fundet superhelt:  ");

                    } else {
                        System.out.println("Kunne ikke finde superhelt: ");
                        error = true;
                    }

                } while (error);
                System.out.println("Rediger data og tryk Enter. Hvis data ikke skal redigeres tryk kun Enter");
                System.out.println("Hvis dataen ikke skal redigeres for powerlevel & opdagelsesår: Tryk 0 for at skip: \n");
                System.out.println("Superhelt navn: " + fundet.getSuperHeroName());
                String newName = scanner.nextLine();
                if (!newName.isEmpty())
                    fundet.setSuperHeroName(newName);

                System.out.println("Superhelts rigtige navn: " + fundet.getRealName());
                String newRealName = scanner.nextLine();
                if (!newRealName.isEmpty())
                    fundet.setRealName(newRealName);

                System.out.println("Superkræft: " + fundet.getSuperpower());
                String newSuperpower = scanner.nextLine();
                if (!newSuperpower.isEmpty())
                    fundet.setSuperpower(newSuperpower);

                System.out.println("Powerlevel: " + fundet.getPowerlevel());
                double newPowerlevel = scanner.nextDouble();
                if (newPowerlevel != 0)
                    fundet.setPowerlevel(newPowerlevel);
                else
                    fundet.setPowerlevel(fundet.getPowerlevel());

                System.out.println("Opdagelsesår: " + fundet.getDiscoveryYear());
                int newDiscoveryYear = scanner.nextInt();
                if (newDiscoveryYear != 0)
                    fundet.setDiscoveryYear(newDiscoveryYear);
                else
                    fundet.setDiscoveryYear(fundet.getDiscoveryYear());
            }
            if (menuvalg == 3) {
                for (Superhero superhero : controller.getSuperheroes()) {
                    System.out.println("Superhelt navn: " + superhero.getSuperHeroName());
                    System.out.println("Superhelts rigtige navn: " + superhero.getRealName());
                    System.out.println("Superkræft: " + superhero.getSuperpower());
                    System.out.println("Powerevel: " + superhero.getPowerlevel());
                    System.out.println("Opdagelsesår: " + superhero.getDiscoveryYear());
                    System.out.println(" ");
                }
            }
            if (menuvalg == 4) {
                System.out.println("Slet en superhelt! ");
                Superhero fundet = null;
                boolean error = false;
                do {
                    error = false;
                    System.out.println("Søg efter helt: ");
                    String søgning = scanner.nextLine();
                    fundet = controller.searchForSuperhero(søgning);
                    if (fundet != null) {
                        System.out.println("Fundet superhelt:  ");
                    } else {
                        System.out.println("Kunne ikke finde superhelt: ");
                        error = true;
                    }

                } while (error);
                controller.deleteSuperhero(fundet);
                System.out.println("Superhelt er nu slettet! \n");
            }
            if (menuvalg == 5) {
            controller.saveData();
                System.out.println("Your data has now been saved: ");
            }
            else if (menuvalg == 9) ;

        }
        while (menuvalg != 9);
        System.out.println("Programmet afsluttes");
    }

    // methods
    public void start() {
        startProgram();
        try {
            menuvalg();
        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong with saving the file...");;
        }

    }
}

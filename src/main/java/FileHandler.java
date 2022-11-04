import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    public void saveData(ArrayList<Superhero> superheroes) throws FileNotFoundException {
        PrintStream output = new PrintStream(new File("data/superheroes.csv"));

        for (Superhero hero : superheroes) {
            output.print(hero.getSuperHeroName());
            output.print(";");
            output.print(hero.getRealName());
            output.print(";");
            output.print(hero.getSuperPower());
            output.print(";");
            output.print(hero.getDiscoveryYear());
            output.print(";");
           //TODO: implementer isHuman metode output.print(hero.getIsHuman());
            output.print(";");
            output.print(hero.getPowerLevel());
            output.println();

        }
        output.close();
    }

    public void loadData(ArrayList<Superhero> superheroes) throws FileNotFoundException {

        Scanner scanList = new Scanner(new File("data/superheroes.csv"));
        superheroes.clear();

        while (scanList.hasNextLine()) {
            String scan = scanList.nextLine();
            Superhero superhero = splitLines(scan);
            superheroes.add(superhero);
        }
    }


    private Superhero splitLines(String scan) {
        String[] split = scan.split(";");
        Superhero superhero = new Superhero();

        superhero.setSuperHeroName(split[0]);
        superhero.setRealName(split[ 1 ]);
        superhero.setSuperPower((split[ 2 ]));

        superhero.setDiscoveryYear(Integer.parseInt(split[ 3 ]));

        // 4 = isHuman

        superhero.setPowerLevel(Double.parseDouble(split[ 5 ]));

        return superhero;
    }


}

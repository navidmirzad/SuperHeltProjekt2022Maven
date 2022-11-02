import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class FileHandler {

    public void saveData(ArrayList<Superhero> superheroes) throws FileNotFoundException {
        PrintStream output = new PrintStream(new File("data/superheroes.csv"));

        for (Superhero hero : superheroes) {
            output.print(hero.getSuperHeroName());
            output.print(";");
            output.print(hero.getRealName());
            output.print(";");
            output.print(hero.getSuperpower());
            output.print(";");
            output.print(hero.getDiscoveryYear());
            output.print(";");
           //TODO: implementer isHuman metode output.print(hero.getIsHuman());
            output.print(";");
            output.print(hero.getPowerlevel());
            output.println();

            output.close();
        }
    }

}

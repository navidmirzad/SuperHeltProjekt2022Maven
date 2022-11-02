import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Controller {

    private Database database = new Database();

    public ArrayList<Superhero> superheroes() {
       return database.getSuperheroes();
    }

   /* public void createTestData() {
        database.createTestData();
    }*/ // hardcoded testdata method

    public void createSuperhero(String name, String realName, String superpower, double powerlevel, int discoveryYear) {
        database.createSuperhero(name, realName, superpower, powerlevel, discoveryYear);
    }

    public ArrayList<Superhero> getSuperheroes() {
        return database.getSuperheroes();
    }

    public Superhero searchForSuperhero(String searchTerm) {
        return database.searchForSuperhero(searchTerm);
    }

    public boolean deleteSuperhero(Superhero superhero) {
        return database.deleteSuperhero(superhero);
    }

    public void saveData() throws FileNotFoundException {
        FileHandler fileHandler = new FileHandler();

        fileHandler.saveData(database.getSuperheroes());

    }
}

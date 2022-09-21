import java.lang.reflect.Array;
import java.util.ArrayList;

public class Database {

    private ArrayList<Superhero> superheroes = new ArrayList<>();

    public void createTestData() {
        createSuperhero("Spiderman", "Peter Parker", "spider abilities", 2400, 2000);
        createSuperhero("Dr. Strange", "Stephen Strange", "magi", 7000, 1980);
        createSuperhero("Captain America", "Steve Rogers", "superhuman", 3500, 1945);
        createSuperhero("Batman", "Bruce Wayne", "flagermusmand", 1400, 1990);
        createSuperhero("Deadpool", "Wade Wilson", "immortal", 8500, 1999);
    }

    public void createSuperhero(String superheltnavn, String rigtigenavn,
                                String superkræft, double powerlevel, int opdagelsesår) {

        Superhero superhero = new Superhero(superheltnavn, rigtigenavn, superkræft, powerlevel, opdagelsesår);
        superheroes.add(superhero);
    }

    public ArrayList<Superhero> getSuperheroes() {
        return superheroes;
    }

    public Superhero searchForSuperhero(String searchTerm) {
        for (Superhero s : getSuperheroes()) {
            if (s.getSuperheltNavn().contains(searchTerm)) {
                return s;
            }
            if (s.getSuperheltNavn().equals(searchTerm)) {
                return s;
            }
        }
        return null;
    }



    public boolean deleteSuperhero(Superhero superhero) {
        boolean success = true;
        superheroes.remove(superhero);
        return success;
    }
}
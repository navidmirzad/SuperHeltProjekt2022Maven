import java.io.File;
import java.util.ArrayList;

public class Database {

    private ArrayList<Superhero> superheroes = new ArrayList<>();

    public void createSuperhero(String superheltnavn, String rigtigenavn,
                                String superkræft, double powerlevel, int opdagelsesår) {

        Superhero superhero = new Superhero(superheltnavn, rigtigenavn, superkræft, powerlevel, opdagelsesår);
        superheroes.add(superhero);
    }

    public ArrayList<Superhero> getSuperheroes() {
        return superheroes;
    }

    public Superhero searchForSuperhero(String searchTerm) {
        for (Superhero superhero : getSuperheroes()) {
            if (superhero.getSuperHeroName().toLowerCase().contains(searchTerm)) {
                return superhero;
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
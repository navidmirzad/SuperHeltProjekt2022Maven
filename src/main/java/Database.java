import java.util.ArrayList;

public class Database {

    private ArrayList<Superhero> superheroes = new ArrayList<>();

    public void createSuperhero() {
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
            if (s.getSuperheltnavn().contains(searchTerm)) {
                System.out.println("Fundet superhelt:  ");
                return s;
            }
        }
        System.out.println("Kunne ikke finde superhelt: ");
        return null;
    }
}
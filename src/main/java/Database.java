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
            if (s.getSuperheltnavn().equals(searchTerm));
            System.out.println("Fundet: ");
            return s;
        }
            return null;
        }

    }
    /*searchTerm.equals(searchTerm);
        searchTerm.equalsIgnoreCase(searchTerm);
        searchTerm.contains(searchTerm);
        searchTerm.isEmpty();*/
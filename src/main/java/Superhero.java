public class Superhero {

    public Superhero[] superheroes;

    private String superheltnavn;
    private String rigtigenavn;
    private String superkræft;
    private double powerlevel;
    private int opdagelsesår;

    public Superhero(String superheltnavn, String rigtigenavn, String superkræft, double powerlevel, int opdagelsesår) {

        this.superheltnavn = superheltnavn;
        this.rigtigenavn = rigtigenavn;
        this.superkræft = superkræft;
        this.powerlevel = powerlevel;
        this.opdagelsesår = opdagelsesår;

    }

    public String getSuperheltnavn() {
        return superheltnavn;
    }

    public String getRigtigenavn() {
        return rigtigenavn;
    }

    public String getSuperkræft() {
        return superkræft;
    }

    public double getPowerlevel() {
        return powerlevel;
    }

    public int getOpdagelsesår() {
        return opdagelsesår;
    }

}



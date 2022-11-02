public class Superhero { //class name

    // array
    public Superhero[] superheroes;

    // attributes
    private String superHeroName;
    private String realName;
    private String superpower;
    private double powerlevel;
    private int discoveryYear;


    // constructor
    public Superhero(String superHeroName, String realName, String superpower, double powerlevel, int discoveryYear)  {

        this.superHeroName = superHeroName;
        this.realName = realName;
        this.superpower = superpower;
        this.powerlevel = powerlevel;
        this.discoveryYear = discoveryYear;

    }

    public String getSuperHeroName() {
        return superHeroName;
    }

    public void setSuperHeroName(String superheltnavn) {
        this.superHeroName = superheltnavn;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String rigtigenavn) {
        this.realName = rigtigenavn;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public double getPowerlevel() {
        return powerlevel;
    }

    public void setPowerlevel(double powerlevel) {
        this.powerlevel = powerlevel;
    }

    public int getDiscoveryYear() {
        return discoveryYear;
    }

    public void setDiscoveryYear(int discoveryYear) {
        this.discoveryYear = discoveryYear;
    }

    public String toString() {
        return "Superheltens navn: " + superHeroName +
                "Rigtige navn: " + realName +
                "Superkræft : " + superpower +
                "Powerlevel : " + powerlevel +
                "Opdagelsesår: " + discoveryYear;
    }

}



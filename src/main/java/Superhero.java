public class Superhero { //class name

    // array
   // public Superhero[] superheroes;

    // attributes
    private String superHeroName;
    private String realName;
    private String superPower;
    private double powerLevel;
    private int discoveryYear;


    // constructor
    public Superhero(String superHeroName, String realName, String superPower, double powerLevel, int discoveryYear)  {

        this.superHeroName = superHeroName;
        this.realName = realName;
        this.superPower = superPower;
        this.powerLevel = powerLevel;
        this.discoveryYear = discoveryYear;

    }

    public Superhero() {

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

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public double getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(double powerLevel) {
        this.powerLevel = powerLevel;
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
                "Superkræft : " + superPower +
                "Powerlevel : " + powerLevel +
                "Opdagelsesår: " + discoveryYear;
    }

}



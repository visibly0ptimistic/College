/*
    Victor Ejiasi

    CSCI 2302-001

    Java version:  18

    Purpose: Planet class that represents a planet with a name and galaxy.

    Input: hard coded the values are declared in the code

    Output: outputs the details of the Being object.

    Other associated files: SpiderMan.java, GreenGoblin.java, and ejiasiv_InheritanceAndPolymorphismProgram.java

    Sample Run: Planet [Planet Name: Earth, Galaxy: Milky Way]
*/


public class Planet {
    private String nameOfPlanet;
    private String nameOfGalaxy;

    public Planet(String nameOfPlanet, String nameOfGalaxy) {
        this.nameOfPlanet = nameOfPlanet;
        this.nameOfGalaxy = nameOfGalaxy;
    }

    public String getNameOfPlanet() {
        return nameOfPlanet;
    }

    public String getNameOfGalaxy() {
        return nameOfGalaxy;
    }

    @Override
    public String toString() {
        return "Planet [Planet Name: " + nameOfPlanet + ", Galaxy: " + nameOfGalaxy + "]";
    }
}

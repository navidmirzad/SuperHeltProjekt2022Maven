import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    private Database database;

    @BeforeEach
    void prepareTest() {
        database = new Database();
        database.createTestData();
    }

    @Test
    void createSuperhero() {
        //arrange
        Database database = new Database();
        //act
        database.createSuperhero("Batman", "Bruce Wayne", "Rig", 1400, 1945);
        ArrayList<Superhero> results = database.getSuperheroes();

        int actualSize = results.size();
        int expectedSize = 1;

        //assert
        assertEquals(expectedSize, actualSize);
    }

    @Test
    void deleteSuperhero() {
    }

    @Test
    void searchForOneResult() {
    }

    @Test
    void searchForMultipleResults() {
    }

    @Test
    void getSuperheroes() {
    }

    @Test
    void searchForSuperhero() {
    }
}
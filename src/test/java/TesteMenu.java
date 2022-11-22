import org.example.tower_defense.model.Menu.Menu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteMenu {
    Menu m;
    @BeforeEach
    void setup(){
        m = new Menu();
    }
    @Test
    void nextDifficulty() {
        m.nextDifficulty();
        assertEquals(1,m.getCurrentDificulty());
    }
    @Test
    void previousDifficulty(){
        m.previousDifficulty();
        assertEquals(2,m.getCurrentDificulty());
    }
}

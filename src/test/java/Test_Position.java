import org.example.tower_defense.GUI.GUI;
import org.example.tower_defense.model.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_Position {
    Position p;
    @BeforeEach
    void setup(){
        p = new Position(10, 10);
    }
    @Test
    void getDown() {
        assertEquals(11,p.getDown().getY());
    }
    @Test
    void getUp() {
        assertEquals(9,p.getUp().getY());
    }
    @Test
    void getRight() {
        assertEquals(11,p.getRight().getX());
    }
    @Test
    void getLeft() {
        assertEquals(9,p.getLeft().getX());
    }
}

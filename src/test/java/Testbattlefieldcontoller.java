import org.example.Game;
import org.example.tower_defense.controller.game.BallonsController;
import org.example.tower_defense.model.Element.Ballon;
import org.example.tower_defense.model.Element.Path;
import org.example.tower_defense.model.Element.Position;
import org.example.tower_defense.model.battlefield.BattleField;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testbattlefieldcontoller {
    private BallonsController controller;
    List<Ballon> ballons = new ArrayList<Ballon>();
    List<Path> paths= new ArrayList<Path>();
    private Game game;
    private BattleField battlefield;
    @BeforeEach
    void setUp() {
        battlefield = new BattleField(10, 10);
    }
    @Test
    void TesteIsemptyBallons(){
        paths.add(new Path(5,5));
        battlefield.setPaths(paths);
        assertEquals(true, battlefield.isEmpty_to_move_ballon(new Position(5,5)));
    }
    @Test
    void TesteIsemptyBallons1(){
        paths.add(new Path(5,5));
        paths.add(new Path(5,6));
        battlefield.setPaths(paths);
        assertEquals(true, battlefield.isEmpty_to_move_ballon(new Position(5,6)));
    }
    @Test
    void TesteIsemptyBallons2(){
        paths.add(new Path(5,5));
        paths.add(new Path(5,6));
        battlefield.setPaths(paths);
        assertEquals(false, battlefield.isEmpty_to_move_ballon(new Position(5,7)));
    }


}

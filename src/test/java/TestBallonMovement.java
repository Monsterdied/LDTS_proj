import com.googlecode.lanterna.graphics.TextGraphics;
import org.example.Game;
import org.example.tower_defense.GUI.GUI;
import org.example.tower_defense.controller.game.BallonsController;
import org.example.tower_defense.controller.game.PlacerController;
import org.example.tower_defense.model.Element.Ballon;
import org.example.tower_defense.model.Element.Path;
import org.example.tower_defense.model.Element.Position;
import org.example.tower_defense.model.battlefield.BattleField;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBallonMovement {
    private BallonsController controller;
    List<Ballon> ballons = new ArrayList<Ballon>();
    List<Path> paths= new ArrayList<Path>();
    private Game game;
    private BattleField battlefield;
    @BeforeEach
    void setUp() {
        battlefield = new BattleField(10, 10);
        ballons = new ArrayList<Ballon>();
        paths = new ArrayList<Path>();
    }
    @Test
    void moveBallonsUpUP() throws IOException{
        ballons.add(new Ballon(5, 5,5));
        battlefield.setBallons(ballons);
        paths.add(new Path(5,5));
        paths.add(new Path(6,5));
        battlefield.setPaths(paths);
        controller = new BallonsController(battlefield);
        controller.step(game, GUI.ACTION.NONE, 700);
        assertEquals(6,battlefield.getBallons().get(0).getPosition().getX());
        assertEquals(5, battlefield.getBallons().get(0).getPosition().getY());

    }
    @Test
    void moveBallons() throws IOException{
        Ballon ballon = new Ballon(5, 10,15);
        controller = new BallonsController(battlefield);
        assertEquals(9,ballon.getPosition().getLeft().getX());
        assertEquals(15, ballon.getPosition().getY());
    }
    @Test
    void moveBallons1() throws IOException{
        Ballon ballon = new Ballon(5, 12,13);
        controller = new BallonsController(battlefield);
        controller.moveBallonLeft(ballon);
        assertEquals(11,ballon.getPosition().getX());
        assertEquals(13, ballon.getPosition().getY());
    }

    @Test
    void moveBallonsDown() throws IOException{
        ballons.add(new Ballon(5, 5,5));
        battlefield.setBallons(ballons);
        paths.add(new Path(5,5));
        paths.add(new Path(5,6));
        battlefield.setPaths(paths);
        controller = new BallonsController(battlefield);
        controller.step(game, GUI.ACTION.NONE, 700);
        assertEquals(5,battlefield.getBallons().get(0).getPosition().getX());
        assertEquals(6, battlefield.getBallons().get(0).getPosition().getY());
    }
    @Test
    void moveBallonsRigth() throws IOException{
        ballons.add(new Ballon(5, 5,5));
        battlefield.setBallons(ballons);
        paths.add(new Path(5,5));
        paths.add(new Path(6,5));
        battlefield.setPaths(paths);
        controller = new BallonsController(battlefield);
        controller.step(game, GUI.ACTION.NONE, 700);
        assertEquals(6,battlefield.getBallons().get(0).getPosition().getX());
        assertEquals(5, battlefield.getBallons().get(0).getPosition().getY());
    }
    @Test
    void moveBallonsUp() throws IOException{
        ballons.add(new Ballon(5, 5,5));
        battlefield.setBallons(ballons);
        paths.add(new Path(5,5));
        paths.add(new Path(6,5));
        battlefield.setPaths(paths);
        controller = new BallonsController(battlefield);
        controller.step(game, GUI.ACTION.NONE, 700);
        assertEquals(6,battlefield.getBallons().get(0).getPosition().getX());
        assertEquals(5, battlefield.getBallons().get(0).getPosition().getY());
    }


}

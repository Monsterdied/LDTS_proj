package org.example.tower_defense.controller.game;

import org.example.Game;
import org.example.tower_defense.GUI.GUI;
import org.example.tower_defense.controller.Controller;
import org.example.tower_defense.model.Element.Ballon;
import org.example.tower_defense.model.battlefield.BattleField;

import java.io.IOException;

public class BallonsController extends GameController{
    private long lastMovement;

    public BallonsController(BattleField battlefield) {
        super(battlefield);
    }
    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (time - lastMovement > 500) {
            for (Ballon monster : getModel().getBallons())
                //implementar move ballons
            this.lastMovement = time;
        }
    }
}

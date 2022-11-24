package org.example.tower_defense.controller.game;

import org.example.Game;
import org.example.tower_defense.model.battlefield.BattleField;
import org.example.tower_defense.GUI.GUI;

import java.io.IOException;

public class BattleFieldController extends GameController{
    private final BallonsController balloncontroller;
    private final TurretsController turretcontroller;
    private final PlacerController placercontroller;
    public BattleFieldController(BattleField battlefield) {super(battlefield);
    this.balloncontroller = new BallonsController(battlefield);
    this.turretcontroller=new TurretsController(battlefield);
    this.placercontroller = new PlacerController(battlefield);
    }




    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (action == GUI.ACTION.QUIT || getModel().getHp_base() == 0){
            /*game.setState(new MenuState(new Menu()));*/
            game.setState(null);
        }else {
            placercontroller.step(game, action, time);
            turretcontroller.step(game, action, time);
            balloncontroller.step(game, action, time);
        }
    }
}

package org.example.tower_defense.controller.game;

import org.example.Game;
import org.example.tower_defense.GUI.GUI;
import org.example.tower_defense.model.Element.Position;
import org.example.tower_defense.model.battlefield.BattleField;

import java.io.IOException;

public class PlacerController extends GameController{
    public PlacerController(BattleField battlefield) {
        super(battlefield);
    }

    public void movePlacerLeft() {
        moveplacer(getModel().getPlacer().getPosition().getLeft());
    }

    public void movePlacerRight() {
        moveplacer(getModel().getPlacer().getPosition().getRight());
    }

    public void movePlacerUp() {moveplacer(getModel().getPlacer().getPosition().getUp());}

    public void movePlacerDown() {
        moveplacer(getModel().getPlacer().getPosition().getDown());
    }

    private void moveplacer(Position position) {
        if (getModel().isEmpty_to_move_placer(position)) {
            getModel().getPlacer().setPosition(position);
        }
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        if (action == GUI.ACTION.UP) movePlacerUp();
        if (action == GUI.ACTION.RIGHT) movePlacerRight();
        if (action == GUI.ACTION.DOWN) movePlacerDown();
        if (action == GUI.ACTION.LEFT) movePlacerLeft();
    }
}

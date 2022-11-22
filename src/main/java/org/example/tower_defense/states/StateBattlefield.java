package org.example.tower_defense.states;

import org.example.tower_defense.model.battlefield.BattleField;
import org.example.tower_defense.controller.Controller;
import org.example.tower_defense.controller.game.BattleFieldController;
import org.example.tower_defense.viewer.Viewer;
import org.example.tower_defense.viewer.game.GameViewer;

public class StateBattlefield extends State<BattleField> {
    public StateBattlefield(BattleField battleField) {
        super(battleField);
    }

    @Override
    protected Viewer<BattleField> getViewer() {
        return new GameViewer(getModel());
    }

    @Override
    protected Controller<BattleField> getController() {
        return new BattleFieldController(getModel());
    }
}
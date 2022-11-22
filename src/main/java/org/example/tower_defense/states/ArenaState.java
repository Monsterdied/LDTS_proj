package org.example.tower_defense.states;

import org.example.tower_defense.Element.BattleField;

public class ArenaState extends State<BattleField> {
    public ArenaState(BattleField battleField) {
        super(battleField);
    }

    @Override
    protected Viewer<Arena> getViewer() {
        return new GameViewer(getModel());
    }

    @Override
    protected Controller<Arena> getController() {
        return new ArenaController(getModel());
    }
}
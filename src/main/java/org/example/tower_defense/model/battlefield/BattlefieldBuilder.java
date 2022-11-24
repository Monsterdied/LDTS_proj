package org.example.tower_defense.model.battlefield;


import org.example.tower_defense.model.Element.*;

import java.util.List;

public abstract class BattlefieldBuilder {
    public BattleField createBattleField() {
        BattleField battlefield = new BattleField(getWidth(), getHeight());

        battlefield.setPaths(createPath());
        battlefield.setPlacer(createPlacer());
        battlefield.setFlag(createFlag());
        battlefield.setSpawn(createSpawn());
        battlefield.setWalls(createWalls());
        return battlefield;
    }

    protected abstract int getWidth();

    protected abstract int getHeight();

    protected abstract List<Path> createPath();

    protected abstract List<Wall> createWalls();

    protected abstract Flag createFlag();

    protected abstract Spawn createSpawn();


    protected abstract Placer createPlacer();
}

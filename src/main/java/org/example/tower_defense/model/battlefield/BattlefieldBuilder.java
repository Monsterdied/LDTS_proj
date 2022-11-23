package org.example.tower_defense.model.battlefield;


import org.example.tower_defense.model.Element.Path;
import org.example.tower_defense.model.Element.Placer;

import java.util.List;

public abstract class BattlefieldBuilder {
    public BattleField createBattleField() {
        BattleField battlefield = new BattleField(getWidth(), getHeight());

        battlefield.setPaths(createPath());
        battlefield.setPlacer(createPlacer());

        return battlefield;
    }

    protected abstract int getWidth();

    protected abstract int getHeight();

    protected abstract List<Path> createPath();


    protected abstract Placer createPlacer();
}

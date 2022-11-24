package org.example.tower_defense.viewer.game;

import org.example.tower_defense.GUI.GUI;
import org.example.tower_defense.model.Element.Element;
import org.example.tower_defense.model.Element.Path;
import org.example.tower_defense.model.Element.Spawn;

public class SpawnViewer implements ElementViewer<Spawn>{
    @Override
    public void draw(Spawn spawn, GUI gui) {
        gui.drawPath(spawn.getPosition());
    }
}

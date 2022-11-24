package org.example.tower_defense.viewer.game;

import org.example.tower_defense.GUI.GUI;
import org.example.tower_defense.model.Element.Wall;

public class WallViewer implements ElementViewer<Wall>{
    @Override
    public void draw(Wall wall, GUI gui) {
        gui.drawPath(wall.getPosition());
    }
}

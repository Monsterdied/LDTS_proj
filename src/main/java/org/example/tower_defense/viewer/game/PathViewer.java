package org.example.tower_defense.viewer.game;

import org.example.tower_defense.GUI.GUI;
import org.example.tower_defense.model.Element.Path;

public class PathViewer implements ElementViewer<Path> {
    @Override
    public void draw(Path path, GUI gui) {
        gui.drawPath(path.getPosition());
    }
}
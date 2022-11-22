package org.example.tower_defense.viewer.arena;

import org.example.tower_defense.Element.Path;
import org.example.tower_defense.GUI.GUI;

public class PathViewer implements ElementViewer<Path> {
    @Override
    public void draw(Path path, GUI gui) {
        gui.drawTurret(path.getPosition());
    }
}
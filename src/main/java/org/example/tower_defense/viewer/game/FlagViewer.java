package org.example.tower_defense.viewer.game;

import org.example.tower_defense.GUI.GUI;
import org.example.tower_defense.model.Element.Flag;

public class FlagViewer implements ElementViewer<Flag>{
    @Override
    public void draw(Flag flag, GUI gui) {
        gui.drawPath(flag.getPosition());
    }
}

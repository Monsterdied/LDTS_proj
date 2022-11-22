package org.example.tower_defense.viewer.game;

import org.example.tower_defense.GUI.GUI;
import org.example.tower_defense.model.Element.Ballon;

public class BallonViewer implements ElementViewer<Ballon> {
    @Override
    public void draw(Ballon element, GUI gui) {
        gui.drawBallon(element.getPosition());
    }

}

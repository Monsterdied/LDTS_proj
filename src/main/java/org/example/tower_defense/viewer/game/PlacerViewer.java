package org.example.tower_defense.viewer.game;

import org.example.tower_defense.GUI.GUI;
import org.example.tower_defense.model.Element.Path;
import org.example.tower_defense.model.Element.Placer;


public class PlacerViewer implements ElementViewer<Placer> {
    @Override
    public void draw(Placer element, GUI gui) {
        gui.drawPlacer(element.getPosition());
    }
}

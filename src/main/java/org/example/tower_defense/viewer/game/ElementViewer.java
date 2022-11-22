package org.example.tower_defense.viewer.game;

import org.example.tower_defense.model.Element.Element;
import org.example.tower_defense.GUI.GUI;

public interface ElementViewer<T extends Element> {
    void draw(T element, GUI gui);
}

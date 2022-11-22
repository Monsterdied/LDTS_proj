package org.example.tower_defense.viewer.arena;

import org.example.tower_defense.Element.Element;
import org.example.tower_defense.GUI.GUI;

public interface ElementViewer<T extends Element> {
    void draw(T element, GUI gui);
}

package org.example.tower_defense.viewer.game;

import org.example.tower_defense.GUI.GUI;
import org.example.tower_defense.model.Element.Element;
import org.example.tower_defense.model.Element.Position;
import org.example.tower_defense.model.battlefield.BattleField;
import org.example.tower_defense.viewer.Viewer;

import java.util.List;

public class GameViewer extends Viewer<BattleField> {
    public GameViewer(BattleField model) {
        super(model);
    }

    @Override
    public void drawElements(GUI gui) {
        if(getModel().getTurrets().size()!=0) drawElements(gui, getModel().getTurrets(), new TurretViewer());
        if(getModel().getPaths().size()!=0) drawElements(gui, getModel().getPaths(), new PathViewer());
        if(getModel().getBallons().size()!=0) drawElements(gui, getModel().getBallons(), new BallonViewer());
        if(getModel().getPlacer()!=null) drawElement(gui, getModel().getPlacer(), new PlacerViewer());

        gui.drawText(new Position(0, 0), "Energy: " + getModel().getHp_base(), "#FFD700");
    }
    private <T extends Element> void drawElements(GUI gui, List<T> elements, ElementViewer<T> viewer) {
        for (T element : elements)
            drawElement(gui, element, viewer);
    }

    private <T extends Element> void drawElement(GUI gui, T element, ElementViewer<T> viewer) {
        viewer.draw(element, gui);
    }
}
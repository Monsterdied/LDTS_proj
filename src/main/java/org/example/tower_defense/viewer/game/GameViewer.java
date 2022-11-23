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
        if(getModel().getTurrets()!=null) drawElements(gui, getModel().getTurrets(), new TurretViewer());
        if(getModel().getPaths()!=null) drawElements(gui, getModel().getPaths(), new PathViewer());
        if(getModel().getBallons()!=null) drawElements(gui, getModel().getBallons(), new BallonViewer());
        if(getModel().getPlacer()!=null) drawElement(gui, getModel().getPlacer(), new PlacerViewer());

        gui.drawText(new Position(0, 0), "Hp:" + getModel().getHp_base(), "#FF0000");
        gui.drawText(new Position(8, 0), "Money:" + getModel().getHp_base()+"$", "#889b73");
        gui.drawText(new Position(20, 6), "Turret 1:", "#8080FF");
        gui.drawText(new Position(29, 6), "300$", "#889b73");

    }
    private <T extends Element> void drawElements(GUI gui, List<T> elements, ElementViewer<T> viewer) {
        for (T element : elements)
            drawElement(gui, element, viewer);
    }

    private <T extends Element> void drawElement(GUI gui, T element, ElementViewer<T> viewer) {
        viewer.draw(element, gui);
    }
}

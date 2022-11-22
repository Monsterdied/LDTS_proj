package org.example.tower_defense.states;

import org.example.tower_defense.controller.Controller;
import org.example.tower_defense.controller.menu.MenuController;
import org.example.tower_defense.model.Menu.Menu;
import org.example.tower_defense.viewer.Viewer;
import org.example.tower_defense.viewer.menu.MenuViewer;

public class MenuState extends State<Menu> {
    public MenuState(Menu model) {
        super(model);
    }
    @Override
    protected Viewer<Menu> getViewer() {
        return new MenuViewer(getModel());
    }

    @Override
    protected Controller<Menu> getController() {
        return new MenuController(getModel());
    }
}

import org.example.tower_defense.GUI.GUI;
import org.example.tower_defense.model.Menu.Menu;
import org.example.tower_defense.viewer.menu.MenuViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;

public class Test_MenuViewer {
    private GUI gui;
    private MenuViewer viewer;
    private Menu menu;

    @BeforeEach
    void setUp() {
        menu = new Menu();
        gui = Mockito.mock(GUI.class);
        viewer = new MenuViewer(menu);
    }
    @Test
    void refreshAndClear() throws IOException {
        viewer.draw(gui);
        Mockito.verify(gui, Mockito.times(1)).clear();
        Mockito.verify(gui, Mockito.times(1)).refresh();
    }
}

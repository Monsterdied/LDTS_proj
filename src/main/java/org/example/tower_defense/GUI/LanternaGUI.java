package org.example.tower_defense.GUI;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.swing.AWTTerminalFontConfiguration;
import org.example.tower_defense.Element.Position;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;


public class LanternaGUI implements GUI {
        private final Screen screen;

        public LanternaGUI(Screen screen) {
            this.screen = screen;
        }
        public LanternaGUI(int width, int height) throws IOException, FontFormatException, URISyntaxException {
            AWTTerminalFontConfiguration fontConfig = loadSquareFont();
            Terminal terminal = createTerminal(width, height, fontConfig);
            this.screen = createScreen(terminal);
        }

        private Screen createScreen(Terminal terminal) throws IOException {
            final Screen screen;
            screen = new TerminalScreen(terminal);

            screen.setCursorPosition(null);
            screen.startScreen();
            screen.doResizeIfNecessary();
            return screen;
        }

        private Terminal createTerminal(int width, int height, AWTTerminalFontConfiguration fontConfig) throws IOException {
            TerminalSize terminalSize = new TerminalSize(width, height + 1);
            DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory()
                    .setInitialTerminalSize(terminalSize);
            terminalFactory.setForceAWTOverSwing(true);
            terminalFactory.setTerminalEmulatorFontConfiguration(fontConfig);
            Terminal terminal = terminalFactory.createTerminal();
            return terminal;
        }

        private AWTTerminalFontConfiguration loadSquareFont() throws URISyntaxException, FontFormatException, IOException {
            URL resource = getClass().getClassLoader().getResource("fonts/square.ttf");
            File fontFile = new File(resource.toURI());
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);

            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);

            Font loadedFont = font.deriveFont(Font.PLAIN, 25);
            AWTTerminalFontConfiguration fontConfig = AWTTerminalFontConfiguration.newInstance(loadedFont);
            return fontConfig;
        }

        public ACTION getNextAction() throws IOException {
            KeyStroke keyStroke = screen.pollInput();
            System.out.println(keyStroke);
            if (keyStroke == null) return ACTION.NONE;

            if (keyStroke.getKeyType() == KeyType.EOF) return ACTION.QUIT;
            if (keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'q') return ACTION.QUIT;

            if (keyStroke.getKeyType() == KeyType.ArrowUp) return ACTION.UP;
            if (keyStroke.getKeyType() == KeyType.ArrowRight) return ACTION.RIGHT;
            if (keyStroke.getKeyType() == KeyType.ArrowDown) return ACTION.DOWN;
            if (keyStroke.getKeyType() == KeyType.ArrowLeft) return ACTION.LEFT;
            if (keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == '1') return ACTION.TECLA1;
            if (keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == '2') return ACTION.TECLA2;
            if (keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == '3') return ACTION.TECLA3;
            if (keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == '4') return ACTION.TECLA4;
            if (keyStroke.getKeyType() == KeyType.Enter) return ACTION.SELECT;

            return ACTION.NONE;
        }

    @Override
    public void drawPlacer(Position position) {

    }

    @Override
    public void drawPath(Position position) {

    }

    @Override
    public void drawEnemy(Position position) {

    }

    @Override
    public void drawText(Position position, String text, String color) {

    }

    @Override
    public void clear() {

    }

    @Override
    public void refresh() throws IOException {

    }

    @Override
    public void close() throws IOException {

    }
}


package org.example.tower_defense.GUI;

import org.example.tower_defense.Element.Position;

import java.io.IOException;

public interface GUI {
    ACTION getNextAction() throws IOException;

    void drawHero(Position position);

    void drawWall(Position position);

    void drawMonster(Position position);

    void drawText(Position position, String text, String color);

    void clear();

    void refresh() throws IOException;

    void close() throws IOException;

    enum ACTION {UP, RIGHT, DOWN, LEFT, NONE, QUIT,TECLA1,TECLA2,TECLA3,TECLA4, SELECT}
}
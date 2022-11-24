package org.example.tower_defense.model.battlefield;
import org.example.tower_defense.model.Element.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LoaderBattlefieldBuilder extends BattlefieldBuilder {
    private final int level;
    private final List<String> lines;

    public LoaderBattlefieldBuilder(int level) throws IOException {
        this.level = level;
/*
        URL resource = LoaderBattlefieldBuilder.class.getResource("/levels/level" + level + ".lvl");
        BufferedReader br = new BufferedReader(new FileReader(resource.getFile()));
        lines = readLines(br);*/
        lines=new ArrayList<>();
        lines.add("####################");
        lines.add("#                  #");
        lines.add("#                  #");
        lines.add("#                  #");
        lines.add("#           H      #");
        lines.add("#                  #");
        lines.add("#                  #");
        lines.add("#                  #");
        lines.add("#   %%%%%%         #");
        lines.add("#   %    %         #");
        lines.add("#   %    %         #");
        lines.add("#   %    %    %%%%F#");//F flag onde os balons morrem S spawn dos balões e % path se quiserem saber pq e que a flag as walls i o path sao iguais eu depois troco isso esta no viewer
        lines.add("#S%%%    %    %    #");
        lines.add("#        %    %    #");
        lines.add("#        %    %    #");
        lines.add("#        %    %    #");
        lines.add("#        %%%%%%    #");
        lines.add("#                  #");
        lines.add("#                  #");
        lines.add("####################");


    }

    private List<String> readLines(BufferedReader br) throws IOException {
        List<String> lines = new ArrayList<>();
        for (String line; (line = br.readLine()) != null; )
            lines.add(line);
        return lines;
    }

    @Override
    protected int getWidth() {
        int width = 0;
        for (String line : lines)
            width = Math.max(width, line.length());
        return width;
    }

    @Override
    protected int getHeight() {
        return lines.size();
    }

    @Override
    protected List<Path> createPath() {
        List<Path> paths = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '%') paths.add(new Path(x, y));
        }
        return paths;
    }
    @Override
    protected List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '#') walls.add(new Wall(x, y));
        }
        return walls;
    }


    @Override
    protected Placer createPlacer() {
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'H') return new Placer(x, y);
        }
        return null;
    }
    @Override
    protected Spawn createSpawn() {
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'S') return new Spawn(x, y);
        }
        return null;
    }
    @Override
    protected Flag createFlag() {
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'F') return new Flag(x, y);
        }
        return null;
    }
}
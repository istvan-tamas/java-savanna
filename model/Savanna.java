package model;

import interfaces.Util;

import java.util.Random;

public class Savanna extends AbstractSavanna implements Util {
    public Savanna(int size) {
        super(size);
        init();
    }


    @Override
    public void init() {
        Random rand = new Random();
        Object[] assets = {'.','G'};

        for (int x = 0; x < savanna.length; x++){
            for(int y = 0; y < savanna[x].length; y++){
                int rnd = rand.nextInt(2);
                savanna[x][y] = assets[rnd];
            }
        }
    }

    @Override
    public void printMap() {

    }
}

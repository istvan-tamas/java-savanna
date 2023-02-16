package model;

public class Herbivore extends AbstractAnimal {
    private int x;
    private int y;

    public Herbivore(int life, boolean is_hungry, String type, int startX, int startY) {
        super(life, is_hungry, type);
        setX(startX);
        setY(startY);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

package model;

public abstract class AbstractAnimal {

    public Object[] animal = new Object[3];

    public AbstractAnimal(int life, boolean is_hungry, String type) {
        this.animal[0] = life;
        this.animal[1] = is_hungry;
        this.animal[2] = type;
    }

    public Object[] getAnimal() {
        return animal;
    }

    public void setAnimal(Object[] animal) {
        this.animal = animal;
    }

}

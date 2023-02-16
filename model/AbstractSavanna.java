package model;

public abstract class AbstractSavanna {
    public Object[][] savanna;

    public AbstractSavanna(int size) {
        this.savanna = new Object[size][size];
    }

    public Object[][] getSavanna() {
        return savanna;
    }

    public void setSavanna(Object[][] savanna) {
        this.savanna = savanna;
    }
}

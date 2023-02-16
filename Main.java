import model.Herbivore;
import model.Savanna;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        Savanna savanna = new Savanna(1);
        Herbivore animal = new Herbivore(100,true,"Cow",10,13);

        System.out.println(savanna.getSavanna().length);
        System.out.println(animal.getAnimal()[0]);
        System.out.println(animal.getAnimal()[1]);
        System.out.println(animal.getAnimal()[2]);
        System.out.println(animal.getX());
        System.out.println(animal.getY());
    }
}

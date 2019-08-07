package animalKingdom;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        ArrayList<Animal> mammals = new ArrayList<Animal>();

        mammals.add(panda);
        mammals.add(zebra);
        mammals.add(koala);
        mammals.add(sloth);
        mammals.add(armadillo);
        mammals.add(raccoon);
        mammals.add(bigfoot);
    }
}
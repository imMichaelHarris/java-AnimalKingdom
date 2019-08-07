package animalKingdom;

public abstract class Animal {
    private static int id;
    private String name;
    private int year;

    //constructor every animal will have this
    public void Animal(){
        energy = 0;
    }

    public void eat(){
        energy++;
    }
    public void eat(int quanity){
        energy += quanity;
    }
}
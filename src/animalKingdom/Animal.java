package animalKingdom;

public abstract class Animal {
    private static int maxId;
    private int id;
    private int energy;
    private String name;
    private int year;

    //constructor every animal will have this
    public Animal(){

        energy = 0;
    }
    //this constructor taks a parameter so we creating a new object 
    //the animal will have a engery level already
    public Animal(int energy){
        this.energy = energy;
    }

    //abstract methods all animals can do this be it will vary
    public abstract void move();
    public abstract void breath();
    public abstract void reproduce();

    public void eat(){
        energy++;
    }
    public void eat(int quanity){
        energy += quanity;
    }
}
package animalKingdom;

public abstract class Animal {
    private static int maxId;
    private int id;
    private int energy;
    //had these as private gave error, when switched when switched eror went away
    protected String name;
    protected int year;

    //constructor every animal will have this
    public Animal(String name, int year){
        maxId++;
        id = maxId;
        energy = 0;
        this.name = name;
        this.year = year;
    }
    //this constructor taks a parameter so we creating a new object 
    //the animal will have a engery level already
    public Animal(String name, int year, int energy){
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;
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
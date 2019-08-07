package animalKingdom;

public abstract class Animal {
    private static int id;
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
    public abstract move();
    public abstract breath();
    public abstract reproduce();
      
    public void eat(){
        energy++;
    }
    public void eat(int quanity){
        energy += quanity;
    }
}
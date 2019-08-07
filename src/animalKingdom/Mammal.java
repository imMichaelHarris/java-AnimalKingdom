package animalKingdom;

public class Mammal extends Animal{

    public Mammal(String name, int year){
        super(name, year);
        this.name = name;
        this.year = year;
    }

    @Override
    public String move(){
        return "walk";
    }

    @Override
    public String breath(){
        return "lungs";
    }

    @Override
    public String reproduce(){
        return "live";
    }

}
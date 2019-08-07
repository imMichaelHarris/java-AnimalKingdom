package animalKingdom;

public class Bird extends Animal{
    public Bird(String name, int year){
        super(name, year);
        this.name = name;
        this.year = year;
    }

    @Override
    public String move(){
        return "fly";
    }

    @Override
    public String breath(){
        return "lungs";
    }

    @Override
    public String reproduce(){
        return "eggs";
    }
}
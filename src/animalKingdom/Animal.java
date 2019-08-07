package animalKingdom;

public abstract class Animal {
    private static int maxId = 0;
    private int id;
    //had these as private gave error, when switched when switched eror went away
    protected String name;
    protected int year;

    //constructor every animal will have this

    public Animal(String name, int year){
        id = maxId++;
        this.name = name;
        this.year = year;
    }


    //abstract methods all animals can do this be it will vary
    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();
    public int getYear(){
        return year;
    }
    public String getName(){
        return name;
    }


}
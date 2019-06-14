package animals;

public class Animal {
    String name;
    String phylum;
    String kingdom;
    int numberPresent;
    String habitat;

    public Animal(String phylum,String kingdom,int numberPresent, String habitat){
        this.phylum = phylum;
        this.kingdom = kingdom;
        this.numberPresent = numberPresent;
        this.habitat = habitat;

    }

    public void animalInfo() {
        System.out.println("Giving you B.S.");
    }
    public void eating(){
        System.out.println("Munch Munch My Dude !!!");
    }
    public void speak(){
        System.out.println("I am Slightly tired");
    }
}

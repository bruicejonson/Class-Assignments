package animals;
public class Lions extends Animal {
    String name = "Lion's";
    public Lions(String phylum, String kingdom, int numberPresent, String habitat) {
        super(phylum, kingdom, numberPresent, habitat);
    }
    public void animalInfo(){
        System.out.println("Name: "+ name + "\n"+
                "Kingdom: "  +kingdom + "\n"+
                "Phylum: "+ phylum + "\n" +
                "Inhabits: "+ habitat+"\n" +
                "We currently have: "+ numberPresent + " " + name + " in our zoo." );
    }
    @Override
    public void eating(){
        System.out.println(name + " are munching on well....one of our elephants.");
    }
    @Override
    public void speak(){
        System.out.println(name + " made a noise.");
    }
}

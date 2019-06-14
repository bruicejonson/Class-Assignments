package animals;
public class Toucans extends Animal {
    String name = "Toucan's";
    public Toucans(String phylum, String kingdom, int numberPresent, String habitat) {
        super(phylum, kingdom, numberPresent, habitat);
    }

    @Override
    public void animalInfo(){
        System.out.println("Name: "+ name + "\n"+
                "Kingdom: "  +kingdom + "\n"+
                "Phylum: "+ phylum + "\n" +
                "Inhabits: "+ habitat+"\n" +
                "We currently have: "+ numberPresent + " " + name + " in our zoo." );
    }
    @Override
    public void eating(){
        System.out.println(name + " are munching on some fruit.");
    }
    @Override
    public void speak(){
        System.out.println(name + " made a noise.");
    }
}

package animals;

public class Orangutans extends Animal{
    String name = "Orangutan's";
    public Orangutans(String phylum, String kingdom, int numberPresent, String habitat) {
        super(phylum, kingdom,numberPresent, habitat);
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

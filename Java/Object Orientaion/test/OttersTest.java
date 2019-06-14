import animals.Otters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class OttersTest {
    PipedInputStream is = new PipedInputStream();
    PipedOutputStream os = new PipedOutputStream(is);
    PrintStream ps = System.out;
    BufferedReader br = new BufferedReader(new InputStreamReader(is));

    public OttersTest() throws IOException {
    }

    @Before
    public void prepare() {
        System.setOut(new PrintStream(os));
    }
    @Test
    public void animalInfo() {
    Otters otters = new Otters("Chordata","Animalia",3,"Coastal Waters");
    otters.animalInfo();
    assertPrinted("Name: "+ "Otter's"+ "\n"+
            "Kingdom: "  +"Animalia" + "\n"+
            "Phylum: "+ "Chordata" + "\n" +
            "Inhabits: "+ "Coastal Waters"+"\n" +
            "We currently have: "+ "3" + " " + "Otter's" + " in our zoo.");
    }
    private void assertPrinted(String expected) {
        try {
            for(int i = 0;i< expected.split("\n").length;i++)
                assertEquals(expected.split("\n")[i], br.readLine());
        } catch(Exception e) {

        }
    }
    @Test
    public void eating() {
        Otters otters = new Otters("Chordata","Animalia",3,"Coastal Waters");
        otters.eating();
        assertPrinted("Otter's" + " are munching on some carp.");
    }

    @Test
    public void speak() {
        Otters otters = new Otters("Chordata","Animalia",3,"Coastal Waters");
        otters.speak();
        assertPrinted("Otter's" + " made a noise.");
    }
    @After
    public void restoreOut() {
        System.setOut(ps);
    }
}
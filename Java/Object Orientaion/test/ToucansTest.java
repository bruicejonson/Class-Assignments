import animals.Toucans;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class ToucansTest {
    PipedInputStream is = new PipedInputStream();
    PipedOutputStream os = new PipedOutputStream(is);
    PrintStream ps = System.out;
    BufferedReader br = new BufferedReader(new InputStreamReader(is));

    public ToucansTest() throws IOException {
    }

    @Before
    public void prepare() {
        System.setOut(new PrintStream(os));
    }

    @Test
    public void animalInfo() {
        Toucans toucan = new Toucans("Chordata","Animalia",4,"Trees");
        toucan.animalInfo();
        assertPrinted("Name: "+ "Toucan's" + "\n"+
                "Kingdom: "  +"Animalia" + "\n"+
                "Phylum: "+ "Chordata" + "\n" +
                "Inhabits: "+ "Trees"+"\n" +
                "We currently have: "+ "4" + " " + "Toucan's" + " in our zoo." );
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
        Toucans toucan = new Toucans("Chordata","Animalia",4,"Trees");
        toucan.eating();
        assertPrinted("Toucan's" + " are munching on some fruit.");
    }

    @Test
    public void speak() {
        Toucans toucan = new Toucans("Chordata","Animalia",4,"Trees");
        toucan.speak();
        assertPrinted("Toucan's" + " made a noise.");
    }
    @After
    public void restoreOut() {
        System.setOut(ps);
    }
}
import org.junit.Test;

import static org.junit.Assert.*;

public class mainTest {

    @Test
    public void main() {

    }

    @Test
    public void add() {

        assertEquals( 9 , main.add(5,4));
    }

    @Test
    public void subtract() {
        assertEquals(11, main.subtract(20,9));
    }

    @Test
    public void multiply() {
        assertEquals(36, main.multiply(6,6));
    }

    @Test
    public void divide() {
        assertEquals(5,main.divide(25,5), 0);
    }
}
import static org.junit.Assert.*;

public class SquareTest {

    @org.junit.Test
    public void squareDigits() {
        assertEquals(811181, new Square().squareDigits(9119));
    }
}
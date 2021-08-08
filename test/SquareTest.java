import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquareTest {
    private int side;
    private Square square;

    @Before
    public void setup() {
        side = 10;
        square = new Square(side);
    }

    @Test
    public void testComputeArea() {
        Assert.assertEquals(side * side, square.computeArea());
    }

    @Test
    public void testSideGetter() {
        Assert.assertEquals(side, square.getSide());
    }

    @Test
    public void testSideSetter() {
        int newSide = 13;
        square.setSide(newSide);
        Assert.assertEquals(newSide, square.getSide());
    }

    @Test
    public void testComputeAreaAfterModification() {
        int newSide = 13;
        square.setSide(newSide);
        Assert.assertEquals(newSide * newSide, square.computeArea());
    }
}

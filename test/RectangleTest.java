import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void testComputeArea() {
        Rectangle rectangle = new Rectangle(5, 6);
        Assert.assertEquals(30, rectangle.computeArea());
    }
}

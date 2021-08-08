import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest {
    private int height;
    private int width;
    private Rectangle rectangle;

    @Before
    public void setup() {
        height = 5;
        width = 6;
        rectangle = new Rectangle(height, width);
    }

    @Test
    public void testComputeArea() {
        Assert.assertEquals(width * height, rectangle.computeArea());
    }

    @Test
    public void testHeightGetter() {
        Assert.assertEquals(height, rectangle.getHeight());
    }

    @Test
    public void testWidthGetter() {
        Assert.assertEquals(width, rectangle.getWidth());
    }

    @Test
    public void testHeightSetter() {
        int newHeight = 13;
        rectangle.setHeight(newHeight);
        Assert.assertEquals(newHeight, rectangle.getHeight());
    }

    @Test
    public void testWidthSetter() {
        int newWidth = 17;
        rectangle.setWidth(newWidth);
        Assert.assertEquals(newWidth, rectangle.getWidth());
    }

    @Test
    public void testComputeAreaAfterModification() {
        int newHeight = 10;
        int newWidth = 20;
        rectangle.setHeight(newHeight);
        rectangle.setWidth(newWidth);
        Assert.assertEquals(newHeight * newWidth, rectangle.computeArea());
    }
}

import org.junit.Assert;
import org.junit.Test;

public class LocationTest {


    private Location location;

    @Test
    public void forward() {

        Direction direction = Direction.NORTH;
        location = new Location(1, 3);

        Location now = location.forward(direction);

        Assert.assertEquals(now.getX(), 1);
        Assert.assertEquals(now.getY(), 4);
    }
}
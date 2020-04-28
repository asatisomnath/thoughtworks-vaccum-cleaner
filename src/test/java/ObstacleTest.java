import junit.framework.TestCase;
import org.junit.Test;

public class ObstacleTest extends TestCase {

    private Obstacle obstacle;

    @Test
    public void testIsAHit() {
        obstacle = new Obstacle(3,5,3,5);

        int x = 3;
        int y = 5;

        assertEquals(obstacle.isAHit(3,5), true);


    }

    @Test
    public void testIsAHitInRange() {
        obstacle = new Obstacle(1,6,3,6);

        int x = 2;
        int y = 6;

        assertEquals(obstacle.isAHit(x,y), true);


    }
}
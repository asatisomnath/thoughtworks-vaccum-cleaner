import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class RoomTest extends TestCase {

    @Test
    public void testIsMovePossible() {

        Location location = new Location(5, 5);

        Direction direction = Direction.NORTH;
        Instruction instruction = Instruction.MOVE;

        VaccumCleaner vaccumCleaner =  new VaccumCleaner(location, direction);

        Size size = new Size(6, 6);
        Room room = new Room(size, vaccumCleaner);

        boolean isMovePossible = room.isForwardPossible();

        Assert.assertFalse(isMovePossible);
    }

    @Test
    public void testIsForwardPossibleAgainstObstaclesSizeOne() {

        Location location = new Location(2, 5);
        Direction direction = Direction.EAST;
        Instruction instruction = Instruction.MOVE;

        VaccumCleaner vaccumCleaner =  new VaccumCleaner(location, direction);

        Obstacle obstacle = new Obstacle(3, 5, 3,5);

        Size size = new Size(6, 6);
        Room room = new Room(size, vaccumCleaner);

        room.append(obstacle);

        Assert.assertFalse(room.isForwardPossible());


    }

    @Test
    public void testIsForwardPossibleAgainstObstacles() {

        Location location = new Location(2, 5);
        Direction direction = Direction.NORTH;
        Instruction instruction = Instruction.MOVE;

        VaccumCleaner vaccumCleaner =  new VaccumCleaner(location, direction);

        Point start = new Point(1,6);
        Point end = new Point(2,6);

        Obstacle obstacle = new Obstacle(1,6,2,6);

        Size size = new Size(8, 8);
        Room room = new Room(size, vaccumCleaner);

        room.append(obstacle);

        Assert.assertFalse(room.isForwardPossible());

    }

}
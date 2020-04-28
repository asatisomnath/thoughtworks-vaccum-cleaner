import org.junit.Assert;
import org.junit.Test;

public class DirectionTest {
    private Direction direction;
    @Test
    public void turnFromNorth() {
        direction = Direction.NORTH;

        Direction now = direction.turn(Instruction.LEFT);
        Assert.assertEquals(now, Direction.WEST);

        now = direction.turn(Instruction.RIGHT);
        Assert.assertEquals(now, Direction.EAST);

    }

    @Test
    public void turnFromEast() {
        direction = Direction.EAST;

        Direction now = direction.turn(Instruction.LEFT);
        Assert.assertEquals(now, Direction.NORTH);

        now = direction.turn(Instruction.RIGHT);
        Assert.assertEquals(now, Direction.SOUTH);

    }

    @Test
    public void turnFromWest() {
        direction = Direction.WEST;

        Direction now = direction.turn(Instruction.LEFT);
        Assert.assertEquals(now, Direction.SOUTH);

        now = direction.turn(Instruction.RIGHT);
        Assert.assertEquals(now, Direction.NORTH);

    }

    @Test
    public void turnFromSouth() {
        direction = Direction.SOUTH;

        Direction now = direction.turn(Instruction.LEFT);
        Assert.assertEquals(now, Direction.EAST);

        now = direction.turn(Instruction.RIGHT);
        Assert.assertEquals(now, Direction.WEST);

    }

    @Test
    public void frowardToEast() {
        direction = Direction.EAST;

        Forward nextCoordinatesDiff = direction.forward();

        Assert.assertEquals(nextCoordinatesDiff.getxDiff(), 1);
        Assert.assertEquals(nextCoordinatesDiff.getyDiff(), 0);


    }

    @Test
    public void frowardToWest() {
        direction = Direction.WEST;

        Forward nextCoordinatesDiff = direction.forward();

        Assert.assertEquals(nextCoordinatesDiff.getxDiff(), -1);
        Assert.assertEquals(nextCoordinatesDiff.getyDiff(), 0);


    }

    @Test
    public void frowardToNorth() {
        direction = Direction.NORTH;

        Forward nextCoordinatesDiff = direction.forward();

        Assert.assertEquals(nextCoordinatesDiff.getxDiff(), 0);
        Assert.assertEquals(nextCoordinatesDiff.getyDiff(), 1);


    }

    @Test
    public void frowardToSouth() {
        direction = Direction.SOUTH;

        Forward nextCoordinatesDiff = direction.forward();

        Assert.assertEquals(nextCoordinatesDiff.getxDiff(), 0);
        Assert.assertEquals(nextCoordinatesDiff.getyDiff(), -1);


    }
}
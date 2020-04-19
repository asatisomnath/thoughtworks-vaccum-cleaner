import org.junit.Assert;
import org.junit.Test;

public class VaccumCleanerTest {

    private VaccumCleaner vaccumCleaner;

    @Test
    public void movement() {

        Size size = new Size(6, 6);
        Room room = new Room(size);

        Location location = new Location(1, 3);

        Direction direction = Direction.NORTH;

        Instruction instruction = Instruction.RIGHT;

        vaccumCleaner = new VaccumCleaner(location, direction, room);
        vaccumCleaner.movement(instruction);

        Assert.assertEquals(vaccumCleaner.getDirection(), Direction.EAST);
    }

    @Test
    public void isMovePossible(){
        Size size = new Size(6, 6);
        Room room = new Room(size);

        Location location = new Location(5, 5);

        Direction direction = Direction.NORTH;
        Instruction instruction = Instruction.MOVE;

        vaccumCleaner =  new VaccumCleaner(location, direction, room);

        vaccumCleaner.movement(instruction);
        Assert.assertFalse(vaccumCleaner.isMovePossible());
    }
}
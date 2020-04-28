import org.junit.Assert;
import org.junit.Test;

public class VaccumCleanerTest {

    private VaccumCleaner vaccumCleaner;

    @Test
    public void movement() {

        Location location = new Location(1, 3);

        Direction direction = Direction.NORTH;

        Instruction instruction = Instruction.RIGHT;

        vaccumCleaner = new VaccumCleaner(location, direction);

        Size size = new Size(6, 6);
        Room room = new Room(size, vaccumCleaner);

        vaccumCleaner.movement(instruction);

        Assert.assertEquals(vaccumCleaner.getDirection(), Direction.EAST);
    }

}
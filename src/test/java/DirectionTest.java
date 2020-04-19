import org.junit.Assert;
import org.junit.Test;

public class DirectionTest {
    private Direction direction;
    @Test
    public void turn() {
        direction = Direction.NORTH;

        Assert.assertEquals(direction.turn(Instruction.RIGHT).getDirection(), "E");
        Assert.assertEquals(direction.turn(Instruction.LEFT).getDirection(), "W");

    }
}
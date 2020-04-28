import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Constants {

    public static final Map<String, Instruction> stringInstructionHashMap;
    public static final Map<String, Direction> stringDirectionHashMap ;

    static{
        Map<String, Direction> directionMap = new HashMap<>();
        directionMap.put("E", Direction.EAST);
        directionMap.put("W", Direction.WEST);
        directionMap.put("N", Direction.NORTH);
        directionMap.put("S", Direction.SOUTH);
        stringDirectionHashMap = Collections.unmodifiableMap(directionMap);

        Map<String, Instruction> instructionMap = new HashMap<>();
        instructionMap.put("L", Instruction.LEFT);
        instructionMap.put("R", Instruction.RIGHT);
        stringInstructionHashMap = Collections.unmodifiableMap(instructionMap);
    }
}

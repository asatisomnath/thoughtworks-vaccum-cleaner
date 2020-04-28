import java.util.SortedMap;

public enum Direction {
    NORTH("N"){
        @Override
        public Direction turn(Instruction instruction) {
            if(Instruction.LEFT.equals(instruction)){
                return WEST;
            } else {
                return EAST;
            }
        }

        @Override
        public Forward forward() {
            return new Forward(0, 1);
        }
    },
    EAST("E"){
        @Override
        public Direction turn(Instruction instruction) {
            if(Instruction.LEFT.equals(instruction)){
                return NORTH;
            } else {
                return SOUTH;
            }
        }

        @Override
        public Forward forward() {
            return new Forward(1, 0);
        }
    },
    SOUTH("S"){
        @Override
        public Direction turn(Instruction instruction) {
            if(Instruction.LEFT.equals(instruction)){
                return EAST;
            } else {
                return WEST;
            }
        }

        @Override
        public Forward forward() {
            return new Forward(0, -1);
        }
    },
    WEST("W"){
        @Override
        public Direction turn(Instruction instruction) {
            if(Instruction.LEFT.equals(instruction)){
                return SOUTH;
            } else {
                return NORTH;
            }
        }

        @Override
        public Forward forward() {
            return new Forward(-1, 0);
        }
    };


    public static final Direction[] directions = values();

    public abstract Direction turn(Instruction instruction);
    public abstract Forward forward();

    private String direction;

    private Direction(String direction){
        this.direction = direction;
    }


}

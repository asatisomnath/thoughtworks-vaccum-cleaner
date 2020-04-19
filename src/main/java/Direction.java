public enum Direction {
    NORTH("N"),
    EAST("E"),
    SOUTH("S"),
    WEST("W");

    public static final Direction[] directions = values();

    private String direction;

    private Direction(String direction){
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public Direction turn(Instruction instruction){
        if(Instruction.LEFT.equals(instruction)){
            return directions[(ordinal()-1 + directions.length)% directions.length];
        } else {
            return directions[(ordinal()+1 )% directions.length];
        }
    }

}

public class VaccumCleaner {

    private Location location;
    private Direction direction;

    public VaccumCleaner(Location location, Direction direction){
        this.location = location;
        this.direction = direction;
    }

    public void movement(Instruction instruction){

        if(Instruction.MOVE.equals(instruction)){
            location = location.forward(direction);
        } else {
                direction = direction.turn(instruction);
        }
    }


    public String toString(){

        StringBuilder sb = new StringBuilder();

        sb.append("x: ");
        sb.append(location.getX());
        sb.append(" y: ");
        sb.append(location.getY());
        sb.append(" D: ");
        sb.append(direction);

        return sb.toString();
    }

    public Direction getDirection(){
        return direction;
    }

    public Location getLocation(){ return location;}

}

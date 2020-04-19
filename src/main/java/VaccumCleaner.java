public class VaccumCleaner {

    private Location location;
    private Direction direction;
    private Room room;

    public VaccumCleaner(Location location, Direction direction, Room room){
        this.location = location;
        this.direction = direction;
        this.room = room;
    }

    public void movement(Instruction instruction){

        if(Instruction.MOVE.equals(instruction)){
            if(isMovePossible()){
                location = location.forward(direction);
            }
        } else {
                direction = direction.turn(instruction);
        }
    }

    public boolean isMovePossible() {

        if(direction.getDirection().equals("W") && location.getX()==0){
            return false;
        } else if(direction.getDirection().equals("E") && location.getX()== room.getSize().getWidth()-1){
            return false;
        } else if(direction.getDirection().equals("S") && location.getY()==0){
            return false;
        } else if(direction.getDirection().equals("N") && location.getY()== room.getSize().getHeight()-1){
            return false;
        } else {
            return true;
        }
    }

    public Direction getDirection(){
        return direction;
    }

    public Location getLocation(){ return location;}

}

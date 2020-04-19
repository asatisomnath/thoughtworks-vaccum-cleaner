import java.util.List;

public class Room {

    private Size size;

    //private List<VaccumCleaner> vaccumCleanerList;

    public Room(Size size){
        this.size = size;
    }

    public Size getSize(){
        return size;
    }

//    public boolean isMovePossible(Direction direction, Location location) {
//
//        if(direction.getDirection().equals("W") && location.getX()==0){
//            return false;
//        } else if(direction.getDirection().equals("E") && location.getX()== size.getWidth()-1){
//            return false;
//        } else if(direction.getDirection().equals("S") && location.getY()==0){
//            return false;
//        } else if(direction.getDirection().equals("N") && location.getX()== size.getHeight()-1){
//            return false;
//        } else {
//            return true;
//        }
//    }
}

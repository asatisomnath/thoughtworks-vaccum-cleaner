public class Location {

    private int x;
    private int y;

    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Location forward(Direction direction){

        int xDiff = 0;
        int yDiff = 0;

        if(Direction.NORTH.equals(direction)){
            yDiff = 1;
        } else if(Direction.SOUTH.equals(direction)){
            yDiff = -1;
        } else if(Direction.EAST.equals(direction)){
            xDiff = 1;
        } else if(Direction.WEST.equals(direction)){
            xDiff = -1;
        }

        Location now = new Location(x + xDiff, y + yDiff);
        return now;
    }

//    public boolean isForwardPossible(Direction direction){
//
//    }

}

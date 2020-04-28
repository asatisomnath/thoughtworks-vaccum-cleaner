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

        Forward forward = direction.forward();

        Location now = new Location(x + forward.getxDiff(), y + forward.getyDiff());
        return now;
    }

}

public class Obstacle {

    private int startX;
    private int startY;
    private int endX;
    private int endY;

    public Obstacle(int startX, int startY, int endX, int endY){
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public boolean isAHit(int x, int y){
        if(x<=endX && x>=startX && y<=endY && y>=startY){
            return true;
        } else {
            return false;
        }
    }

}

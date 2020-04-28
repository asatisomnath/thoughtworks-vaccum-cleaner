import java.util.ArrayList;
import java.util.List;

public class Room {

    private Size size;

    private VaccumCleaner vaccumCleaner;

    private List<Obstacle> obstacles;

    public Room(Size size, VaccumCleaner vaccumCleaner){
        this.vaccumCleaner  = vaccumCleaner;
        this.obstacles = new ArrayList<>();
        this.size = size;
    }

    public void append(Obstacle obstacle){
        obstacles.add(obstacle);
    }

    public Obstacle getObstacle(int index){
        return obstacles.get(index);
    }

    public boolean isForwardPossible() {

        Direction direction = vaccumCleaner.getDirection();
        Location location = vaccumCleaner.getLocation().forward(direction);

        int x = location.getX();
        int y = location.getY();

        if(x<0 || y<0 || x>=size.getWidth() || y>=size.getHeight()){
            return false;
        }

        for(Obstacle obstacle: obstacles){

            if(obstacle.isAHit(x, y)){
                return false;
            }

        }
        return true;
    }
}

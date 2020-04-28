public class Operations {

    public static void main(String[] args){


        Location position = new Location(2, 5);
        Direction direction = Direction.EAST;
        VaccumCleaner cleaner = new VaccumCleaner(position, direction);

        Obstacle obstacle = new Obstacle(3,5,3,5);

        Size size = new Size(6, 6);
        Room room = new Room(size,cleaner);

        room.append(obstacle);

        Space[][] roomSpace = new Space[6][6];

        String[] actions = {"M", "L", "M"};

        for(int i=0;i<actions.length; i++){

            if(Constants.stringInstructionHashMap.containsKey(actions[i])){
                cleaner.movement(Constants.stringInstructionHashMap.get(actions[i]));
            } else if(room.isForwardPossible()){
                cleaner.movement(Instruction.MOVE);
            }

        }

        System.out.println(cleaner.toString());
        
    }

}

public class Operations {

    public static void main(String[] args){
        Size size = new Size(6, 6);
        Room room = new Room(size);

        Location position = new Location(3, 5);
        Direction direction = Direction.NORTH;
        VaccumCleaner cleaner = new VaccumCleaner(position, direction, room);

        String[] actions = {"M", "L", "M"};

        for(int i=0;i<actions.length; i++){

            if(actions[i].equals("L")){
                cleaner.movement(Instruction.LEFT);
            } else if(actions[i].equals("R")){
                cleaner.movement(Instruction.RIGHT);
            } else {
                cleaner.movement(Instruction.MOVE);
            }

        }

        System.out.println("x: "+ cleaner.getLocation().getX() + " y: "+ cleaner.getLocation().getY() + " D: " + cleaner.getDirection());

        
    }

}

public enum Instruction {
    LEFT("L"),
    RIGHT("R"),
    MOVE("M");

    private String instruction;

    private Instruction(String instruction){
        this.instruction = instruction;
    }

    public String getInstruction(){
        return instruction;
    }
}

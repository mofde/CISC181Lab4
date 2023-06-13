package cisc181.lab_4;
//A penguin piece represents a game piece type.
public class PiecePenguin extends PieceEggLaying {
    private int numAttacked;
    public PiecePenguin(String symbol, String color, int numEggs, int numAttacked){
        super(symbol, color, numEggs);
        this.numAttacked = numAttacked;
    }
    public PiecePenguin(String symbol){
        this(symbol,"",0,0);
    }
    //speak() makes a penguin piece say "Smile and wave boys. Smile and wave".
    public void speak(){
        System.out.println("Smile and wave boys. Smile and wave.");
    }
    //getNumAttacked() gets the current number of pieces attacked.
    public int getNumAttacked() {
        return this.numAttacked;
    }
    //validPath() makes a penguin piece slide left or right one or more spaces or it can move up or
    //down one space.
    public void validPath(){
        System.out.println("Slide - piece can move left or right (one or more spaces) and NOT up and down");
        System.out.println("Or it can move one space up or down the board");
    }
    //attack() makes a penguin piece attack with lasers and removes other piece(s) from the game.
    public void attack(int fromRow, int fromCol, int toRow, int toCol){
        this.numAttacked++;
        System.out.println("Attack with lasers – other piece removed from game.");
    }
    //recruit() makes a penguin piece recruit other pieces from the other team and add them to the
    //penguin piece's team.
    public void recruit(int fromRow, int fromCol, int toRow, int toCol){
        System.out.println("You're on my team now! – other piece removed from other team and added to this team.");
    }
    //layEgg makes a penguin piece lay eggs if the current number of eggs has not met the maximum
    //number of eggs.
    public PiecePenguin layEgg(){
        if( this.numEggs < MAX_EGGS){
            this.incrementNumEggs();
            return new PiecePenguin(this.symbol, this.color,0,0);
        }
        else{
            return null;
        }
    }
    //incrementNumEggs() sets the corresponding attribute numEggs to numEggs + 1.
    public void incrementNumEggs( ){
        this.numEggs++;
    }
    //incrementNumAttacked() sets the corresponding attribute numAttacked to numAttacked + 1.
    public void incrementNumAttacked( ){
        this.numAttacked++;
    }
}
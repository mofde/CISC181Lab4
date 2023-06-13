package cisc181.lab_4;
//A shark bait piece represents a game piece type.
public class PieceSharkBait extends Piece {
    public PieceSharkBait(String symbol, String color){
        super(symbol, color);
    }
    public PieceSharkBait(String symbol){
        this(symbol,"");
    }
    //speak() makes a shark bait pieces say "Shark bait oooh ha haa!"
    public void speak(){
        System.out.println("Shark bait oooh ha haa!");
    }
    //validPath() makes a shark bait piece move two spaces diagonally.
    public void validPath() {
        System.out.println("can move 2 spaces diagonally");
    }
    //recruit() makes a shark bait piece recruit other pieces from the other team and add them to
    //the shark bait's team.
    public void recruit(int fromRow, int fromCol, int toRow, int toCol){
        System.out.println("You're on my team now! – other piece removed from other team and added to this team.");
    }
}
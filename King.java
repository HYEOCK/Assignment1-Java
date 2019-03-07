package Lab3;

public class King extends ChessPiece {

    public King(){
        super(100);
    }

    @Override
    public void move() {
        System.out.println("one square");
    }

    @Override
    public String toString() {
        return "King : 100";
    }
}

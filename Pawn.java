package Lab3;

public class Pawn extends ChessPiece {

    public Pawn (){ // 파라미터에 int value 안넣어도 된다 왜냐하면 항상 1로 정해져 있기 때문에.
        super(1); // 여기에 벨류 값 넣어준다.
    }

    @Override
    public void move() {
        System.out.println("forward 1");
    }

    @Override
    public String toString() {
        return "Pawn : 1";
    }
}

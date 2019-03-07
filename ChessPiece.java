package Lab3;

public abstract class ChessPiece {
    // instance variable
    private int value;

    // constructor
    public ChessPiece(int value){
        this.value = value;
    }

    // getter, setter
    public int getValue() {

        return value;
    }

    public void setValue(int value) {

        this.value = value;
    }

    @Override
    public String toString() {
        return "ChessPiece" + value;
    }

    public abstract void move();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChessPiece that = (ChessPiece) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public void promote(ChessPiece newPiece){
        // It doesn't understand
        // promote
    }



}

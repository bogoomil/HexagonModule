package hu.boga.hex;

public class Hex {
    private int col, row;
    public Hex(int col, int row) {
        this.col = col;
        this.row = row;
    }

    @Override
    public String toString() {
        return "Hex{" +
                "c=" + col +
                ", r=" + row +
                '}';
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}

package hu.boga.hex;

public class UpTriangleStrategy extends AbstractMapStrategy{

    public UpTriangleStrategy(int rowNum) {
        super(rowNum);
    }

    @Override
    public int getColumnCountInRow(int row) {

        return row + 1;
    }

    @Override
    public int getFirstColumnInRow(int row) {
        return rowNum - 1 - row;
    }
}

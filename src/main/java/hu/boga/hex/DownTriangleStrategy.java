package hu.boga.hex;

public class DownTriangleStrategy extends AbstractMapStrategy{

    public DownTriangleStrategy(int rowNum) {
        super(rowNum);
    }

    @Override
    public int getColumnCountInRow(int row) {

        return rowNum - row;
    }

    @Override
    public int getFirstColumnInRow(int row) {
        return 0;
    }

}

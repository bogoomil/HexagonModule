package hu.boga.hex;

public class RhombusStrategy extends AbstractMapStrategy{

    public RhombusStrategy(int rowNum) {
        super(rowNum);
    }

    @Override
    public int getColumnCountInRow(int row) {
        return rowNum;
    }

    @Override
    public int getFirstColumnInRow(int row) {
        return 0;
    }
}

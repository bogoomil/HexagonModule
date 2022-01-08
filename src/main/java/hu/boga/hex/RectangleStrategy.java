package hu.boga.hex;


import java.util.HashMap;
import java.util.Map;

public class RectangleStrategy extends AbstractMapStrategy{

    public RectangleStrategy(int rowNum) {
        super(rowNum);
    }

    @Override
    public int getColumnCountInRow(int row) {
        return rowNum;
    }

    @Override
    public int getFirstColumnInRow(int row) {
        return Math.floorDiv(row, 2) * -1;
    }
}

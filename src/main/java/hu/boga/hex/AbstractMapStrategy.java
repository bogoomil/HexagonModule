package hu.boga.hex;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractMapStrategy {
    protected int rowNum;

    public AbstractMapStrategy(int rowNum) {
        this.rowNum = rowNum;
    }

    public abstract int getColumnCountInRow(int row);
    public abstract int getFirstColumnInRow(int row);

    public Map<Integer, Hex[]> getMapPointy() {
        Map<Integer, Hex[]> retVal = new HashMap<>();
        for (int row = 0; row < rowNum; row++){
            int colCount = this.getColumnCountInRow(row);
            Hex[] hexAry = new Hex[colCount];
            for(int col = 0; col < colCount; col++){
                Hex h = new Hex(col + getFirstColumnInRow(row), row);
                hexAry[col] = h;
            }
            retVal.put(row, hexAry);
        }

        printMap(retVal);

        return retVal;
    }

    private void printMap(Map<Integer, Hex[]> map){
        map.values().stream().forEach(h -> {
            for(int i = 0; i < h.length; i++){
                System.out.print(h[i] + ", ");
            }
            System.out.println();
        });

    }

}

package hu.boga.hex;

public class HexagonStrategy extends AbstractMapStrategy{

    public HexagonStrategy(int rowNum) {
        super(rowNum);
    }

    @Override
    public int getColumnCountInRow(int row) {
        //2*N+1 - abs(N-r)
        return 2 * getN() + 1 - Math.abs(getN() - row);
    }

    @Override
    public int getFirstColumnInRow(int row) {
        return getN() - row <= 0 ? 0 : getN() - row;
    }

    private int getN(){
        return Math.floorDiv(rowNum, 2);
    }

}

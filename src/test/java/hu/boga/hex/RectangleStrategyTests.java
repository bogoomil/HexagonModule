package hu.boga.hex;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RectangleStrategyTests {
    @Test
    void getColumnCount_row0_columnCountIs6(){
        RectangleStrategy rs = new RectangleStrategy(6);
        assertEquals(6, rs.getColumnCountInRow(0));
    }

    @Test
    void getFirstColumnInRow_row6_colIsMinus3(){
        RectangleStrategy rs = new RectangleStrategy(6);
        assertEquals(-3, rs.getFirstColumnInRow(6));
    }
    @Test
    void getFirstColumnInRow_row3_colIsMinus1(){
        RectangleStrategy rs = new RectangleStrategy(6);
        assertEquals(-1, rs.getFirstColumnInRow(3));
    }
    @Test
    void getFirstColumnInRow_row0_colIs0(){
        RectangleStrategy rs = new RectangleStrategy(6);
        assertEquals(0, rs.getFirstColumnInRow(0));
    }

    @Test
    void getMapPointy_firstRowsFirstHex_is00(){
        RectangleStrategy rs = new RectangleStrategy(6);
        Map<Integer, Hex[]> map = rs.getMapPointy();
        assertEquals(0, map.get(0)[0].getCol());
    }
    @Test
    void getMapPointy_sixthRowsFirstHex_isMinus36(){
        RectangleStrategy rs = new RectangleStrategy(7);
        Map<Integer, Hex[]> map = rs.getMapPointy();
        assertEquals(-3, map.get(6)[0].getCol());
        assertEquals(6, map.get(6)[0].getRow());
    }
    @Test
    void getMapPointy_fifthRowsSecondHex_isMinus15(){
        RectangleStrategy rs = new RectangleStrategy(7);
        Map<Integer, Hex[]> map = rs.getMapPointy();
        assertEquals(-1, map.get(5)[1].getCol());
        assertEquals(5, map.get(5)[1].getRow());
    }
    @Test
    void getMapPointy_sixthRowsSixthHex_isMinus36(){
        RectangleStrategy rs = new RectangleStrategy(7);
        Map<Integer, Hex[]> map = rs.getMapPointy();
        assertEquals(3, map.get(6)[6].getCol());
        assertEquals(6, map.get(6)[6].getRow());
    }
    @Test
    void getMapPointy_maxRow_is6(){
        RectangleStrategy rs = new RectangleStrategy(7);
        Map<Integer, Hex[]> map = rs.getMapPointy();
        int max = map.keySet().stream().max(Integer::compareTo).get();
        assertEquals(6, max);
    }
}

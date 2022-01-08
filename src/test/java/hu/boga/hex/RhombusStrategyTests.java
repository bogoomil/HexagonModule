package hu.boga.hex;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RhombusStrategyTests {
    @Test
    void getColumnCount_row0_columnCountIs6(){
        RhombusStrategy rs = new RhombusStrategy(6);
        assertEquals(6, rs.getColumnCountInRow(0));
    }

    @Test
    void getFirstColumnInRow_row6_colIsMinus3(){
        RhombusStrategy rs = new RhombusStrategy(7);
        assertEquals(0, rs.getFirstColumnInRow(6));
    }

    @Test
    void getMapPointy_firstRowsFirstHex_is00(){
        RhombusStrategy rs = new RhombusStrategy(6);
        Map<Integer, Hex[]> map = rs.getMapPointy();
        assertEquals(0, map.get(0)[0].getCol());
    }
    @Test
    void getMapPointy_sixthRowsFirstHex_is06(){
        RhombusStrategy rs = new RhombusStrategy(7);
        Map<Integer, Hex[]> map = rs.getMapPointy();
        assertEquals(0, map.get(6)[0].getCol());
        assertEquals(6, map.get(6)[0].getRow());
    }
    @Test
    void getMapPointy_fifthRowsSecondHex_is05(){
        RhombusStrategy rs = new RhombusStrategy(7);
        Map<Integer, Hex[]> map = rs.getMapPointy();
        assertEquals(1, map.get(5)[1].getCol());
        assertEquals(5, map.get(5)[1].getRow());
    }
    @Test
    void getMapPointy_maxRow_is6(){
        RhombusStrategy rs = new RhombusStrategy(7);
        Map<Integer, Hex[]> map = rs.getMapPointy();

        map.values().stream().forEach(h -> {
            for(int i = 0; i < h.length; i++){
                System.out.print(h[i] + ", ");
            }
            System.out.println();
        });

        int max = map.keySet().stream().max(Integer::compareTo).get();
        assertEquals(6, max);
    }
}

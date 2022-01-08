package hu.boga.hex;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HexagonStrategyTests {
    @Test
    void getColumnCount_row0_columnCountIs4() {
        HexagonStrategy rs = new HexagonStrategy(7);
        assertEquals(4, rs.getColumnCountInRow(0));
    }

    @Test
    void getColumnCount_row3_columnCountIs7() {
        HexagonStrategy rs = new HexagonStrategy(7);
        assertEquals(7, rs.getColumnCountInRow(3));
    }

    @Test
    void getColumnCount_row5_columnCountIs5() {
        HexagonStrategy rs = new HexagonStrategy(7);
        assertEquals(5, rs.getColumnCountInRow(5));
    }

    @Test
    void getMapPointy_firstRowsFirstHex_is30() {
        HexagonStrategy rs = new HexagonStrategy(7);
        Map<Integer, Hex[]> map = rs.getMapPointy();
        assertEquals(3, map.get(0)[0].getCol());
        assertEquals(0, map.get(0)[0].getRow());
    }
    @Test
    void getMapPointy_thirdRowsFirstHex_is03() {
        HexagonStrategy rs = new HexagonStrategy(7);
        Map<Integer, Hex[]> map = rs.getMapPointy();
        assertEquals(0, map.get(3)[0].getCol());
        assertEquals(3, map.get(3)[0].getRow());
    }

    @Test
    void getMapPointy_lastRowsLastHex_is36() {
        HexagonStrategy rs = new HexagonStrategy(7);
        Map<Integer, Hex[]> map = rs.getMapPointy();
        assertEquals(3, map.get(6)[3].getCol());
        assertEquals(6, map.get(6)[3].getRow());
    }

    @Test
    void getFirstColumnInRow_rowIs0_colIs06() {
        HexagonStrategy rs = new HexagonStrategy(7);
        assertEquals(3, rs.getFirstColumnInRow(0));
        assertEquals(2, rs.getFirstColumnInRow(1));
        assertEquals(1, rs.getFirstColumnInRow(2));
        assertEquals(0, rs.getFirstColumnInRow(3));
        assertEquals(0, rs.getFirstColumnInRow(4));
        assertEquals(0, rs.getFirstColumnInRow(5));
        assertEquals(0, rs.getFirstColumnInRow(6));
    }
}

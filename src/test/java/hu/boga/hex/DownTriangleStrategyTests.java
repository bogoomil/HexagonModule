package hu.boga.hex;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DownTriangleStrategyTests {
    @Test
    void getColumnCount_row0_columnCountIs6() {
        DownTriangleStrategy rs = new DownTriangleStrategy(7);
        assertEquals(7, rs.getColumnCountInRow(0));
    }

    @Test
    void getColumnCount_row6_columnCountIs1() {
        DownTriangleStrategy rs = new DownTriangleStrategy(7);
        assertEquals(1, rs.getColumnCountInRow(6));
    }

    @Test
    void getMapPointy_firstRowsFirstHex_is00() {
        DownTriangleStrategy rs = new DownTriangleStrategy(7);
        Map<Integer, Hex[]> map = rs.getMapPointy();
        assertEquals(0, map.get(0)[0].getCol());
        assertEquals(0, map.get(0)[0].getRow());
    }

    @Test
    void getMapPointy_lastRowsLastHex_is06() {
        DownTriangleStrategy rs = new DownTriangleStrategy(7);
        Map<Integer, Hex[]> map = rs.getMapPointy();
        assertEquals(0, map.get(6)[0].getCol());
        assertEquals(6, map.get(6)[0].getRow());
    }
}

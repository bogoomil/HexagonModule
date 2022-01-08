package hu.boga.hex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HexTests {

    @Test
    void toStringIsOk(){
        int col = 0;
        int row = 0;
        String s = "Hex{" +
                "c=" + col +
                ", r=" + row +
                '}';
        Hex h = new Hex(col,row);

        assertEquals(s, h.toString());
    }

    @Test
    void getCol_col_is0(){
        Hex h = new Hex(3,0);
        assertEquals(3, h.getCol());
    }
    @Test
    void getRow_row_is0(){
        Hex h = new Hex(0,3);
        assertEquals(3, h.getRow());
    }
}

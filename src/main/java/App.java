import hu.boga.hex.AbstractMapStrategy;
import hu.boga.hex.HexagonStrategy;
import hu.boga.hex.RectangleStrategy;

public class App {
    public static void main(String[] args){
        AbstractMapStrategy s = new HexagonStrategy(10);
        s.getMapPointy();

        s = new RectangleStrategy(10);
        s.getMapPointy();
    }
}

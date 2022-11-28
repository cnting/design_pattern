package day_54_flyweight.chess;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cnting on 2022/11/13
 */
public class ChessPieceUnitFactory {
    private static final Map<Integer, ChessPieceUnit> pieces = new HashMap<>();

    static {
        pieces.put(1, new ChessPieceUnit(1, "車", ChessPieceUnit.Color.BLACK));
        pieces.put(2, new ChessPieceUnit(2, "馬", ChessPieceUnit.Color.BLACK));
    }

    public static ChessPieceUnit getChessPiece(int chessPieceId){
        return pieces.get(chessPieceId);
    }
}

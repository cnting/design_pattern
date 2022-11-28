package day_54_flyweight.chess;

/**
 * Created by cnting on 2022/11/13
 * 棋子
 */
public class ChessPiece {
    private ChessPieceUnit chessPieceUnit;
    private int positionX;
    private int positionY;

    public ChessPiece(ChessPieceUnit unit, int positionX, int positionY) {
        this.chessPieceUnit = unit;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public ChessPieceUnit getChessPieceUnit() {
        return chessPieceUnit;
    }

    public void setChessPieceUnit(ChessPieceUnit chessPieceUnit) {
        this.chessPieceUnit = chessPieceUnit;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}

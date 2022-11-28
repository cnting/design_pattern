package day_54_flyweight.chess;

/**
 * Created by cnting on 2022/11/13
 * 棋子不变的部分，享元类，属性不可变
 */
public class ChessPieceUnit {
    private int id;
    private String text;
    private Color color;

    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }

    public static enum Color {
        RED, BLACK
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Color getColor() {
        return color;
    }
}

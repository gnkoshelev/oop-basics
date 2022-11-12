package ru.gnkoshelev.oop.basics;

/**
 * @author Gregory Koshelev
 */
public class WhiteBoard extends Board {
    static final Color COLOR = Color.WHITE_COLOR;
    private StringBuilder content = new StringBuilder();

    public WhiteBoard(Size size) {
        super(size, COLOR);
    }

    public WhiteBoard(Size size, Color color) {
        super(size, color);
    }

    public void write(String text) {
        content.append(text);
    }

    public void clean() {
        content = new StringBuilder();
    }

    public String getContent() {
        return content.toString();
    }

    @Override
    public String toString() {
        return getContent();
    }
}

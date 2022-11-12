package ru.gnkoshelev.oop.basics;

/**
 * @author Gregory Koshelev
 */
public final class AwesomeMain {
    private AwesomeMain() {
    }

    /**
     * Main method.
     *
     * @param args
     */
    public static void main(final String[] args) {
        System.out.println("Hello, world!");
        WhiteBoard board1 = new WhiteBoard(Size.XXL);
        WhiteBoard board2 = new WhiteBoard(Size.S, new Color(0,0,0));
        board1.write("public class WhiteBoard extends Board {");
        board1.write("\n");
        board1.write("static final Color COLOR = Color.WHITE_COLOR;");

        System.out.println(board1);

        board1.clean();

        System.out.println(board1);
    }
}

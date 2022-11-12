package ru.gnkoshelev.oop.basics;

/**
 * @author Gregory Koshelev
 */
public final class Color {
    public static final Color WHITE_COLOR = new Color(255, 255, 255);

    private final int r;
    private final int g;
    private final int b;

    public Color(int r, int g, int b) {
        // Check limits
        checkComponent(r);
        checkComponent(g);
        checkComponent(b);
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Color color = (Color) other;
        return r == color.r &&
                g == color.g &&
                b == color.b;
    }

    @Override
    public int hashCode() {
        return r + (g << 8) + (b << 16);
    }

    private static void checkComponent(int component) {
        if (component > 255 || component < 0) {
            throw new IllegalArgumentException("Args must be in range [0,255]");
        }
    }
}

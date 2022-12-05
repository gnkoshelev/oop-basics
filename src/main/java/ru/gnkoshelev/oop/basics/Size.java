package ru.gnkoshelev.oop.basics;

/**
 * @author Gregory Koshelev
 */
public enum Size {
    /**
     * XXL
     */
    XXL(250, 120),
    /**
     * XL
     */
    XL(200, 100),
    /**
     * L
     */
    L(180, 80),
    /**
     * M
     */
    M(150, 80),
    /**
     * S
     */
    S(15,10);

    private final int widthCm;
    private final int heightCm;

    Size(int w, int h) {
        this.widthCm = w;
        this.heightCm = h;
    }
}

package ru.gnkoshelev.oop.basics;

/**
 * @author Gregory Koshelev
 */
public enum Size {
    XXL(250, 120),
    XL(200, 100),
    L(180, 80),
    M(150, 80),
    S(15,10);

    private final int widthCm;
    private final int heightCm;

    Size(int w, int h) {
        this.widthCm = w;
        this.heightCm = h;
    }
}

package ru.gnkoshelev.oop.basics;

/**
 * @author Gregory Koshelev
 */
public class PaintableTable extends Table implements PaintableSurface {
    public PaintableTable(int height, int width, int depth, Material material, LengthUnit unit) {
        super(height, width, depth, material, unit);
    }

    @Override
    public void write(String text) {

    }
}

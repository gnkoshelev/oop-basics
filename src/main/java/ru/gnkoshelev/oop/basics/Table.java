package ru.gnkoshelev.oop.basics;

/**
 * @author Gregory Koshelev
 */
public class Table implements Surface {
    /**
     * Height of the table in millimeters.
     */
    private final int heightMm;
    /**
     * Width of the table in millimeters.
     */
    private final int widthMm;
    /**
     * Depth of the table in millimeters.
     */
    private final int depthMm;
    private final Material material;

    public Table(int height, int width, int depth, Material material, LengthUnit unit) {
        this.heightMm = unit.convert(height, LengthUnit.MILLIMETER);
        this.widthMm = unit.convert(width, LengthUnit.MILLIMETER);
        this.depthMm = unit.convert(depth, LengthUnit.MILLIMETER);
        this.material = material;
    }
}

package ru.gnkoshelev.oop.basics;

/**
 * @author Gregory Koshelev
 */
public enum LengthUnit {
    /**
     * Millimeter
     */
    MILLIMETER(LengthUnit.MILLIMETER_SCALE),
    /**
     * Centimeter
     */
    CENTIMETER(LengthUnit.CENTIMETER_SCALE),
    /**
     * Meter
     */
    METER(LengthUnit.METER_SCALE),
    /**
     * Kilometer
     */
    KILOMETER(LengthUnit.KILOMETER_SCALE);

    private final int scale;

    LengthUnit(int scale) {
        this.scale = scale;
    }

    public int convert(int amount, LengthUnit targetUnit) {
        return (amount * scale) / targetUnit.scale;
    }

    /**
     *
     */
    private static final int MILLIMETER_SCALE = 1;
    private static final int CENTIMETER_SCALE = 10;
    private static final int METER_SCALE = 1_000;
    private static final int KILOMETER_SCALE = METER_SCALE * 1_000;
}

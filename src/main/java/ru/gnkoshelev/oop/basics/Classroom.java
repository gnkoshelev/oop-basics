package ru.gnkoshelev.oop.basics;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Gregory Koshelev
 */
public class Classroom {
    private final Set<PaintableSurface> paintableSurfaces = new HashSet<>();

    public Classroom() {
    }

    public void addPaintableSurface(PaintableSurface ps) {
        if (!paintableSurfaces.add(ps)) {
            throw new IllegalArgumentException("The object has been added already");
        }
    }
}

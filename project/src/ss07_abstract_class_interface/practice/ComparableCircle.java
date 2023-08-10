package ss07_abstract_class_interface.practice;

import ss06_inheritance.practice.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
        super();
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle other) {
        if (getRadius() > other.getRadius()) {
            return 1;
        } else if (getRadius() < other.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
}

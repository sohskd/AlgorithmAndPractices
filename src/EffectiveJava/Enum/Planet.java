package EffectiveJava.Enum;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public enum Planet {

    MERCURY(3, 2),
    VENUS(4, 6);

    private final int mass;
    private final int radius;
    private final int surfaceGravity;

    Planet(int mass, int radius) {
        this.mass = mass;
        this.radius = radius;
        surfaceGravity = 2 * mass / (radius * radius);
    }

    private static final Map<String, Planet> stringToEnum
            = Stream.of(values()).collect(toMap(Object::toString, e -> e));

    public static Optional<Planet> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }

    public int getMass() {
        return mass;
    }

    public int getRadius() {
        return radius;
    }

    public int getSurfaceGravity() {
        return surfaceGravity;
    }
}

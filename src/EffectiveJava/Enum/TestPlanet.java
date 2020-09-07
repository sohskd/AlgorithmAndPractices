package EffectiveJava.Enum;

public class TestPlanet {

    public static void main(String[] args) {

        for (Planet p : Planet.values()) {
            System.out.println(p.toString());
            System.out.println(p.getMass());
            System.out.println(Planet.fromString("MERCURY").get());
        }

        for (Operation op : Operation.values()) {
            System.out.println(op.apply(1, 2));
        }


    }
}

package EffectiveJava.Enum;

public enum Operation {

    PLUS {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS {
        public double apply(double x, double y) {
            return x - y;
        }
    };

    public abstract double apply(double x, double y);

}

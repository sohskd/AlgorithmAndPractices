package EffectiveJava.Enum;

//https://stackoverflow.com/questions/5021246/conveniently-map-between-enum-and-int-string

public enum Ensemble {
    SOLO(1),
    DUET(2);

    private final int numberOfMusicians;

    Ensemble(int size) {
        this.numberOfMusicians = size;
    }

    public int getNumberOfMusicians() {
        return this.numberOfMusicians;
    }

    public static void main(String[] args) {
//        System.out.println(Ensemble.SOLO.getNumberOfMusicians());
//        System.out.println(Ensemble.values()[0]);
//        System.out.println(Ensemble.values()[1]);
        System.out.println(Ensemble.valueOf("DUET"));
//        System.out.println(Ensemble.valueOf());
    }
}

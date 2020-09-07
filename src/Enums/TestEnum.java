package Enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class TestEnum {

    public enum Status {
        WAITING(0),
        READY(1),
        SKIPPED(-1),
        COMPLETED(5);

        private static final Map<Integer, Status> lookup = new HashMap<>();

        static {
            for (Status s : EnumSet.allOf(Status.class))
                lookup.put(s.getCode(), s);
        }


        private int code;

        private Status(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }

        public static Status get(int code) {
            return lookup.get(code);
        }
    }

    public static void main(String[] args) {
        System.out.println(Status.get(4));
    }
}

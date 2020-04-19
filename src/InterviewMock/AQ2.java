package InterviewMock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AQ2 {

    public static void main(String[] args) {

        int nc = 6;
        int t = 0;
        List<Integer> o = new ArrayList<>();
        o.add(1);
        o.add(2);
        o.add(4);
        o.add(6);

        List<Integer> d = new ArrayList<>();
        d.add(3);
        d.add(3);
        d.add(3);
        d.add(4);

        System.out.println(connectedCities(nc, t, o, d));

    }

    public static List<Integer> connectedCities(int numCities, int threshold, List<Integer> originCities,
                                                List<Integer> destinationCities) {
        // Write your code here
        List<Integer> answer = new ArrayList<>();

        HashMap<Integer, Integer> track = new HashMap<>();

        int originCityToConsider;
        int destinationCityToConsider;
        int GCD;

        for (int i = 0; i < originCities.size(); i++) {
            originCityToConsider = originCities.get(i);
            destinationCityToConsider = destinationCities.get(i);
            GCD = findGCD(originCityToConsider, destinationCityToConsider);
            if (GCD > threshold)
                track.put(originCityToConsider, destinationCityToConsider);
            else {
                track.put(originCityToConsider, 0);
            }
        }

        for (int i = 0; i < originCities.size(); i++) {
            originCityToConsider = originCities.get(i);
            destinationCityToConsider = destinationCities.get(i);
            GCD = findGCD(originCityToConsider, destinationCityToConsider);
            if (GCD > threshold)
                answer.add(1);
            else {
                List<Integer> yes = new ArrayList<>();
                for (int j = i+1; j < originCities.size(); j++) {
                    if (track.get(j) != 0)
                        yes.add(j);
                }

                int out = 0;
                for (int k = 0; k < yes.size(); k++) {
                    GCD = findGCD(yes.get(k), originCityToConsider);
                    if (GCD > threshold) {
                        answer.add(1);
                        out = k;
                        break;
                    }
                }

                if (out == yes.size())
                    answer.add(0);
            }
        }

        return answer;
    }

    private static int findGCD(int number1, int number2) {
        //base case
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }
}

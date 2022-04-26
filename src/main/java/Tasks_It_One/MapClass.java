package Tasks_It_One;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapClass {
    public static void main(String[] args) {
        int[] digits = new int[]{3, 3, 4, 5, 3, 1, 1, 3, 4, 3, 3, 3};
        System.out.println(countHowManyTimes(digits));
        System.out.println(countWhichNumberOften(digits).get().getKey());
    }

    public static HashMap<Integer, Integer> countHowManyTimes(int[] digits) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (Integer number : digits) {
            Integer x = hm.get(number);

            if (x != null) {
                hm.put(number, x + 1);
            } else {
                hm.put(number, 1);
            }
        }

        return hm;
    }


    public static Optional<Map.Entry<Integer, Integer>> countWhichNumberOften(int[] digits) {
        HashMap<Integer, Integer> hm = new HashMap<>();


        for (Integer number : digits) {
            Integer x = hm.get(number);

            if (x != null) {
                hm.put(number, x + 1);
            } else {
                hm.put(number, 1);
            }
        }

        return hm.entrySet().stream()
                .max((x1, x2) -> x1.getValue().compareTo(x2.getValue()));

    }
}

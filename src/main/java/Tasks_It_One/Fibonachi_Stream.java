package Tasks_It_One;

import java.util.stream.Stream;

public class Fibonachi_Stream {
    public static void main(String[] args) {
        String str = "sdfsdfsfasdasdas";
        System.out.println(str.length());
//        fibonachiSum(5);
        System.out.println(fibonachi(7));
    }

    public static void fibonachiSum(int num) {
        int fibonacciValuesSum = Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
                .limit(num)
                .map(y -> y[0])
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(fibonacciValuesSum);
    }

    public static int fibonachi(int n) {
        return Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
                .limit(n)
                .map(y -> y[0])
                .reduce((e1, e2) -> e2).orElse(null);
    }
}

//array {0, 1, 1, 2, {3, 5}, 7}
//
//
//arr{0, 1} -> arr{1, 1}
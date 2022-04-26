package Tasks_It_One;

public class Fibonachi {
    public static void main(String[] args) {
        System.out.println(fibonachi(8));
    }

    public static int fibonachi (int x) {
        if (x == 1) {
            return 0;
        }
        if (x == 2 || x==3) {
            return 1;
        }
        return fibonachi(x - 1) + fibonachi(x-2);
    }
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
}

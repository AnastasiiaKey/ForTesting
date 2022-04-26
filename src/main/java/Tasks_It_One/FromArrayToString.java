package Tasks_It_One;

public class FromArrayToString {


    public static void main(String[] args) {
        int [] array = {1,2,3,2,3,4,5,4,3,5};
        System.out.println(getString(array));
    }

    public static String getString (int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length- 1) {
                sb.append("-");
            }
        }

        return sb.toString();
    }
}

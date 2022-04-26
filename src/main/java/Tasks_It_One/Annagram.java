package Tasks_It_One;

import java.util.Arrays;

public class Annagram {
    public static void main(String[] args) {
        System.out.println(annagram("cat", "tac"));

    }
    public static boolean annagram(String one, String two) {
        return Arrays.equals(one.chars().sorted().toArray(),(two.chars().sorted().toArray()));
    }
}

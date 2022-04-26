package Tasks_It_One;

import java.util.ArrayList;
import java.util.List;

public class Regex {
    public static void main(String[] args) {


        List<Object> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.print(convert(l));
    }

    public static String convert(List<Object> list) {
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= list.size() - 1; i++) {
                sb.append(list.get(i));
                if (i != list.size() - 1) {
                    sb.append("-");
                }
            }
            return sb.toString();
        }
        return null;
    }
}

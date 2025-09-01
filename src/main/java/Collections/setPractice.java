package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class setPractice {
    public static void main(String[] args) {
        Set<String> data = new LinkedHashSet();
        data.add("f");
        data.add("b");
        data.add("c");
        data.add("d");
        data.add("e");
        data.remove("c");
        System.out.println(data);
    }
}

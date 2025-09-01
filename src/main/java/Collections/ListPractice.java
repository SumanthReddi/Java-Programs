package Collections;

import java.util.List;
import java.util.Stack;

public class ListPractice {
    public static void main(String[] args) {
        List<String> list = new Stack();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);
        list.remove("e");
        System.out.println(list);
    }
}

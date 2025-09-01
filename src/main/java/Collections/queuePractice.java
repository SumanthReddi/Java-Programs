package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class queuePractice {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList();
        q.add("a");
        q.add("b");
        q.add("c");
        q.add("d");
        q.add("e");
        q.poll();
        System.out.println(q);
    }
}

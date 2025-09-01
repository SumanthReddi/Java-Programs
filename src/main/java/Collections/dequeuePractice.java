//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class dequeuePractice {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque();
        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");
        System.out.println(deque);
        deque.addFirst("Neeraj");
        deque.addLast("Ajeet");
        System.out.println(deque);
        deque.poll();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);
        Iterator<String> itr = deque.iterator();

        while(itr.hasNext()) {
            System.out.println((String)itr.next());
        }

    }
}

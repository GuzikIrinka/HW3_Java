
/**
 * listLinkedList
 */
import java.util.*;

public class listLinkedList {

    public static void main(String[] args) {

        long begin0 = System.currentTimeMillis();
        List<Integer> l0 = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            l0.add(Integer.MAX_VALUE);
        }
        long end0 = System.currentTimeMillis();
        System.out.println(end0 - begin0); // Time: 12992

        long begin1 = System.currentTimeMillis();
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            l1.add(Integer.MAX_VALUE);
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - begin1); // Time: 1277

        long begin2 = System.currentTimeMillis();
        List<Integer> l2 = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            l2.add(Integer.MAX_VALUE);
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - begin2); // Time: 1455
    }
}
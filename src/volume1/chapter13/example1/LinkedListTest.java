package volume1.chapter13.example1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Eric");

        List<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doung");
        b.add("Frances");
        b.add("Gloria");

        ListIterator<String> aIterator = a.listIterator();
        Iterator<String> bIterator = b.iterator();

        while (bIterator.hasNext()) {
            if (aIterator.hasNext()) {
                aIterator.next();
            }
            aIterator.add(bIterator.next());
        }
        System.out.println(a.toString());

        bIterator = b.iterator();
        while (bIterator.hasNext()) {
            bIterator.next();
            if (bIterator.hasNext()) {
                bIterator.next();
                bIterator.remove();
            }
        }
        System.out.println(b);

        a.removeAll(b);
        System.out.println(a);

    }
}

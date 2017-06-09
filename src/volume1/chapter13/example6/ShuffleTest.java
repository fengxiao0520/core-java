package volume1.chapter13.example6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 90; i++) {
            list.add(i);
        }
        int i = Collections.binarySearch(list, 122);
        System.out.println(i);
        Collections.shuffle(list);
        List<Integer> winning = list.subList(0, 9);
        Collections.sort(winning);
        System.out.println(winning);
        Collections.rotate(winning, 2);
        System.out.println(winning);

    }
}

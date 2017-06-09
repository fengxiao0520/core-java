package volume1.chapter13.example2;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) throws FileNotFoundException {
        Set<String> words = new HashSet<>();
        long totalTime = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String word = in.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;

            totalTime += callTime;
        }
        Iterator<String> iterator = words.iterator();
        for (int i = 1; i <= 20; i++) {
            System.out.println(iterator.next());
        }
        System.out.println("...");
        System.out.println(words.size() + " distinct words. " + totalTime + " milliseconds.");
    }
}

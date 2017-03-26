package volume1.chapter3.example6;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int k = scanner.nextInt();

        System.out.println("what is the highest number you can draw?");
        int n = scanner.nextInt();

        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
            System.out.println("you lotteryOdds are 1 in " + lotteryOdds + ". Good Luck!");
        }
    }
}

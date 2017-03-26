package volume1.chapter3.example7;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int k = scanner.nextInt();

        System.out.println("what is the highest number you can draw?");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int[] result = new int[k];

        for (int i = 0; i < result.length; i++) {
            int r = (int) Math.random() * n;
            result[i] = numbers[r];

            numbers[r] = numbers[n - 1];
            n--;
        }
        System.out.println(Arrays.toString(result));
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        System.out.println(Arrays.toString(result));

    }
}

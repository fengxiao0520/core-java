package volume1.chapter3.example3;

import java.util.Scanner;

public class Retirement {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you need to retire?");
        double goal = scanner.nextDouble();

        System.out.println("How much money will you contribute every year?");
        double payment = scanner.nextDouble();

        System.out.println("Interest rate in %:");
        double interestRate = scanner.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println("you can retire in " + years + " years.");
    }
}

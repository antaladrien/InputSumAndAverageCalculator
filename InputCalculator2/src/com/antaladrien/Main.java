package com.antaladrien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long avg = 0L;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers and then at the end it says \"end\"");
        while (true) {
            boolean number = scanner.hasNextInt();
            if (number) {
                count++;
                int add = scanner.nextInt();
                sum += add;
                avg = (long) Math.round((double) sum / (double) count);
            } else {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}

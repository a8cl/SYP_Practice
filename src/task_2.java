package org.example;
import java.util.Scanner;

public class task_2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите X: ");
        double X = scanner.nextDouble();
        System.out.println("Введите N: ");
        int N = scanner.nextInt();
        double result = 0;
        if ((Math.abs(X) > 1) || (N <= 0)) {
            System.out.println("|X| должен быть < 1, а N целым числом > 0");
        } else {
            for(int n = 0; n <= N; n = n + 1) {
                result += (Math.pow(-1, n) * (Math.pow(X, ((2*n) + 1)) / ((2*n) + 1)));
            }
        }
        System.out.println(result);
    }
}

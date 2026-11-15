package org.example;
import java.util.Scanner;

public class task_1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N: ");
        int N = scanner.nextInt();
        double y = 0;
        if (N < 2) {
            System.out.println("N не может быть меньше 2");
        }   else {
            for (double n = 2; n <= N; n++) {
                y = y + (1 / Math.log(n));
            }
        }
        System.out.println(y);
        }
}

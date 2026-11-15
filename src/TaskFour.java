import java.util.Scanner;

public class TaskFour {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа расчитывает доход вклада с ежемесячными процентными начислениями.");
        System.out.println("Введите первоначальный взнос в рублях: ");
        double deposit = scanner.nextFloat();
        System.out.println("Введите ежемесячный процент: ");
        double percent = scanner.nextFloat();
        System.out.println("Введите время, на которое открывается вклад (в месяцах): ");
        int duration = scanner.nextInt();

        if (deposit <= 0 || percent <= 0 || duration <= 0) {
            System.out.println("Ошибка: сумма и срок должны быть больше нуля, процент не может быть отрицательным.");
            return;
        }

        double result = calculate(deposit, percent, duration);
        System.out.println("Итоговая прибыль: " + (result - deposit) + "р");
    }

    public static double calculate(double deposit, double percent, int duration) {
        percent = percent/100;
        double result = deposit;
        for (int i = 1; i <= duration; i++) {
            result = result + (result * percent);
        }
        return result;
    }
}
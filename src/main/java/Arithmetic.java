/*
 * Ввести целые числа как аргументы командной строки,
 * подсчитать их сумму (произведение) и вывести результат на консоль.
 */

public class Arithmetic {
    public static void main(String[] args) {
        int sum = 0;
        int multiplication = 1;
        int numbers = 0;
        if (args.length != 0) {
            for (int i = 0; i < args.length; i++) {
                numbers = Integer.parseInt(args[i]);
                sum += numbers;
                multiplication *= numbers;
            }
            System.out.println("Your sum: " + sum);
            System.out.println("Your multiplication: " + multiplication);
        } else {
            System.out.println("Enter your digits, please");
        }
        System.out.println();
    }
}
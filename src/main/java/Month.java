import java.util.Scanner;

/*
 *  Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
 *  Осуществить проверку корректности ввода чисел.
 */

public class Month {
    public static void main(String[] args) {
        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("If you want quit, type 'q'");
            System.out.println("Input month number(1-12): ");
            if (sc.hasNextInt()) {
                int inputNumber = sc.nextInt();
                if (inputNumber > 0 && inputNumber < 13) {
                    System.out.println(months[inputNumber - 1]);
                    System.out.println("Thank you! Good bye!");
                    break;
                } else {
                    System.out.println("Sorry, number must be 1-12!\n");
                    continue;
                }
            }
            if (sc.hasNext()) {
                String input = sc.next();
                if (input.equalsIgnoreCase("q")) {
                    System.out.println("OK! Good bye!");
                    break;
                } else {
                    System.out.println("Please, enter NUMBER from 1-12.");
                }
            }
        }
    }
}
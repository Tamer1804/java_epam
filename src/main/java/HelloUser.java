import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        //добавить прверку на цифры. с помощью, Regex, Matcher проверить что вводимое значение это текст
        String userName;
        System.out.println("Write your name, please:");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
}

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomWrapper {
    public static void main(String[] args) {
        int kol;
        ArrayList arrayList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input quantity:");
        if (sc.hasNextInt()) {
            kol = sc.nextInt();
            for (int i = 0; i < kol; i++) {
                Random rand = new Random();
                arrayList.add(rand.nextInt());
            }
        } else {
            System.out.println("Sorry, it's not a number. Reset and try again.");
        }

        arrayList.forEach((number)-> System.out.println(number));
        arrayList.forEach((number)-> System.out.print(number+ " "));
    }
}
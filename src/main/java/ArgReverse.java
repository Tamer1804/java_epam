public class ArgReverse {
    public static void main(String[] args) {
        if (args.length != 0) {
            for (int i = args.length; i > 0; i--) {
                System.out.print(args[i - 1] + " ");
            }
        } else {
            System.out.println("Enter args, please");
        }
        System.out.println();
    }
}

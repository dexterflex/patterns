import java.util.Scanner;

public class hourGlass {
    public static void main(String[] args) {
        // inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        // loop
        for (int i = 1; i <= 2 * num - 1; i++) {
            if (i <= num) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = num; j >= i; j--) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 1; j < num - (i - num); j++) {
                    System.out.print(" ");
                }
                for (int j = num; j <= i; j++) {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }

        sc.close();
    }
}

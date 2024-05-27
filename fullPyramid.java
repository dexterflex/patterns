import java.util.Scanner;

public class fullPyramid {
    public static void main(String[] args) {
        // inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        // loop
        for (int i = 1; i <= num; i++) {
            // loop for space
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }

            // loop for *
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}

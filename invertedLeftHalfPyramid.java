import java.util.Scanner;

public class invertedLeftHalfPyramid {
    public static void main(String[] args) {
        // inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        // loop
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = num; j >= i; j--) {
                System.out.print("* ");

            }
            System.out.println();
        }
        sc.close();
    }
}

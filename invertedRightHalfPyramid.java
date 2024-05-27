import java.util.Scanner;

public class invertedRightHalfPyramid {
    public static void main(String[] args) {
        // inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print("* ");

            }
            System.out.println();
        }

        sc.close();
    }
}

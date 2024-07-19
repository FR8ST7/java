import java.util.Scanner;

public class pattern {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of rows:");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int z = 1; z <= i; z++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}

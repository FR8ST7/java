import java.util.Scanner;

public class pattern {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int x=1;
        System.out.println("Enter the number of rows:");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(x+" ");
                x++;
            }
            // Print stars
            //for (int z = 1; z <= n-i; z++) {
               // System.out.print(" ");

            //}
            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}

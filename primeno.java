import java.util.Scanner;
public class primeno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range to find prime numbers: ");
        int x = scanner.nextInt();

        for (int i = 2; i <= x; i++) {
            int flag = 0;
            for (int j = 2; j < i ; j++) {//j<i/2
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(i);
            }
        }
    }
}
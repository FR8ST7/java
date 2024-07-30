import java.util.Scanner;
public class practice {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        double x;
        int n,d;
        System.out.println("enter the value:");
        x= sc.nextDouble();
        System.out.println("enter the numerator");
        n= sc.nextInt();
        System.out.println("enter the denominator:");
        d= sc.nextInt();
        double z= (double)n/d;
        double a= Math.pow(x,z);
        System.out.println("the result is:"+a);
        sc.close();
    }
}

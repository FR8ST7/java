import java.util.Scanner;
public class Switch {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        String x;
        int num;
        System.out.println("Enter choice A for check odd or even.");
        System.out.println("Enter choice B to find square of no.");
        System.out.println("Enter choice C to exit.");

        x= scanner.next();
        System.out.println("Enter the value:");
        num= scanner.nextInt();
        switch(x){
            case "A":
            if(num%2==0){
                System.out.println("Even");
            }
            else{
                System.out.println("odd");
            }
            break;
            case "B":
            int square= num*num;
            System.out.println("Square of number:"+square);
            break;
            case "C":
            System.out.println("Exit!!");
            break;
        

        }
    }
    
}

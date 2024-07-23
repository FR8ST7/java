import java.util.Scanner;
public class menu {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        String z;
        int x;
        while(true){
        System.out.println("Enter choice A to check Buzz no.");
        System.out.println("Enter choice B to check odd or even no.");
        System.out.println("Enter choice C to check +ve or -ve no.");
        System.out.println("Enter choice D to exit.");
        z= scanner.next();
        if(z.equals("D")){
            System.out.print("exiting....");
            break;
        }
        System.out.println("Enter the Value:");
        x= scanner.nextInt();
        switch(z){
        case "A":
        if(x%10==7 || x%7==0){//x%10 gives the last value in the number
            System.out.println("Buzz number!!");
        }
        else{
            System.out.println("Not a Buzz number!!");
        }
        break;
        case "B":
        if(x%2==0){
            System.out.println("Its even number.");
        }
        else{
            System.out.println("Its odd number'");
        }
        break;
        case "C":
        if(x<0){
            System.out.println("Negative number.");
        }
        else{
            System.out.println("Positive number.");
        }
        break;
    }
    }
    scanner.close();
    }
    
}

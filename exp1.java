import java.util.Scanner;
public class exp1 {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        int age;
        System.out.println("enter your age:");
        age= scanner.nextInt();

        if(age>=18){
            System.out.println("eligible to vote.");
        }
        else{
            System.out.println("not eligibrle to vote.");
        }
    }
    
}

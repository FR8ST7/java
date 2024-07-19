import java.util.Scanner;
public class grading {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        int physics,maths,biology,chemistry,computer;
        int total;
        double percentage;
        System.out.println("Enter the marks:");
        physics= scanner.nextInt();
        maths= scanner.nextInt();
        biology= scanner.nextInt();
        chemistry= scanner.nextInt();
        computer= scanner.nextInt();

        total= physics+maths+biology+chemistry+computer;
        System.out.println("Total marks:"+total);
        percentage= (total/500.0)*100;
        System.out.println("Percentage obtained:"+percentage);
        if(percentage>=90){
            System.out.println("grade A");
        }
        else if(percentage>=80){
            System.out.println("grade B");
        }
        else if(percentage>=70){
            System.out.println("grade C");
        }
        else if(percentage>=60){
            System.out.println("grade D");
        }
        else if(percentage>=40){
            System.out.println("grade E");
        }
        else if (percentage<40){
            System.out.println("grade F");
        }
        else{
            System.out.println("invalid input..");
        }
    scanner.close();    
    }
    
}

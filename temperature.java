import java.util.Scanner;

public class temperature{
    public static void main(String args[]){
    int c;//here c indicates degree celcius
    Scanner scanner= new Scanner(System.in);
    System.out.println("enter the temperature:");
    c= scanner.nextInt();

    if(c<0){
        System.out.println("Freezing!!");}
    else if(0<=c && c<=10){
        System.out.println("very cold!!");
    }
    else if(11<=c && c<=20){
        System.out.println("Cold!!");
    }
    else if(21<=c && c<=30){
        System.out.println("Warm!!");
    }
    else if(c>30){
        System.out.println("Hot!!");
    }
    else{
        System.out.println("invalid input!!");
    }
    }
 }

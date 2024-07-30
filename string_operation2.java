import java.util.Scanner;
public class string_operation2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the paragraph");
        String x= sc.nextLine();

    String l="";
    for(int i=0;i<x.length();i++){
        char c= x.charAt(i);
        if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && 
        c!= 'A' && c!= 'E' && c!='I' && c!='O' && c!='U') {
           l= l+c;
         }
    }
    System.out.print("paragraph after deleting vowels:");
    System.out.println(l);
    sc.close();
}
}

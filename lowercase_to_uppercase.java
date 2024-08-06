import java.util.Scanner;
public class lowercase_to_uppercase {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string:");
        String x= sc.nextLine();
        char  y[]= x.toCharArray();
        for(int i=0;i<y.length;i++){
            if(y[i]>='a' && y[i]<='z'){
                y[i]-=32;
            }
        }
            
        String s= new String(y);
        System.out.println("new string:"+s);
        sc.close();
    }
    
}

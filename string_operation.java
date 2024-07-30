import java.util.Scanner;
public class string_operation {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the paragraph");
        String x= sc.nextLine();

    
    int l=0;
    int L=0;
    int s=0;
    int p=0;
    for(int i=0;i<x.length();i++){
        if(x.charAt(i)>='a' && x.charAt(i)<='z'){
           l++;
        }
        if(x.charAt(i)>= 'A' && x.charAt(i)<= 'Z'){
            L++;
        }
        if(x.charAt(i) ==' '){
            s++;
       }
       if(x.charAt(i)== '.'){
        p++;
       }

    }
    int d=0;
    boolean y= false;
    int z= x.length()-1;
    for(int i=0;i<x.length();i++){
        char c= x.charAt(i);
        if(c != ' ' && i !=z){
            y= true;
        }
        else if(c == ' ' && y){
            d++;
            y=false;
        }
        else if(i == z && y){
            d++;
        }
    }
    int t= l+L;
    System.out.println("no. of lines in a paragraph:"+p);
    System.out.println("no. of characters in paragraph:"+t);
    System.out.println("no. of spaces in a paragraph:"+s);
    System.out.println("no. of words in a paragraph:"+d);
    sc.close();
}
}

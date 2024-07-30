import java.util.Scanner;
public class char_counting {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         
         System.out.print("Enter the array size: ");
         int n = sc.nextInt();
         char[] x = new char[n];
         
         
         System.out.println("Enter the elements: ");
         for (int i = 0; i < n; i++) {
             x[i] = sc.next().charAt(0); 
         }
         
       
         for (int y = 0; y< n; y++) {
             for (int z = y + 1; z < n; z++) {
                 if (x[y] == x[z]) {
                     System.out.println("Duplicate element: " + x[y]);
                    
  
                 }
             }
         }
         
         
         int v = 0;
         int c= 0;
         for (int l = 0; l < n; l++) {
             if (x[l] == 'a' || x[l] == 'e' || x[l] == 'i' || x[l] == 'o' || x[l] == 'u') {
                v++;
             } else { 
                 c++;
             }
         }
         
         
         System.out.println("No. of vowels: " + v);
         System.out.println("No. of consonants: " + c);
         
         
         sc.close();
     }
 }
import java.util.Scanner;
public class checking_index {

	    public static void main (String args[]){

	        Scanner sc= new Scanner(System.in);

	        int x;

	        int arr[];

	        System.out.println("enter no. of elements:");

	        x= sc.nextInt();

	        arr= new int[x];

	        for(int i=0;i<x;i++){

	            arr[i]=sc.nextInt();

	        }

	        System.out.println("The elements are:");

	        for(int i=0;i<x;i++){

	            System.out.println(arr[i]);

	        }

	        System.out.println();

	System.out.println("Enter the number of elements to search:");

	        int y = sc.nextInt();

	        int z[] = new int[y];

	        

	        System.out.println("Enter the elements to search:");

	        for (int i = 0; i < y; i++) {

	            z[i] = sc.nextInt();

	        }

	        

	        System.out.println("Search results:");

	        for (int i = 0; i < y; i++) {

	            int flag =0 ;

	            for (int j = 0; j < x; j++) {

	                if (arr[j] == z[i]) {

	                    System.out.println("Element " + z[i] + " is in index " + j);

	                    flag = 1;

	                }

	            }

	        }

	    }

	}


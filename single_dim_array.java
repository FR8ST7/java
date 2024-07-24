import java.util.Scanner;
public class single_dim_array {
    public static void main(String args[]){
        int sum=0;
        int arr[]= new int[]{13,23,45,7,56,3};
        for(int i=0;i<arr.length;i++){
            sum= sum+ arr[i];
        }
        System.out.println("sum of elements in array:"+sum);
        //smallest no. and biggest no.
        for(int y=0;y<arr.length;y++){
            for(int z=0;z<arr.length-y-1;z++){
                if(arr[z]>arr[z+1]){
                    int a= arr[z];
                    arr[z]=arr[z+1];
                    arr[z+1]= a;
                }
            }
        }
        System.out.println("Smallest no.:"+arr[0]);
        System.out.println("Largest no."+arr[arr.length-1]);
    }
    
}

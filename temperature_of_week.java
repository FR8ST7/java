import java.util.Scanner;
public class temperature_of_week {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int sum=0;
        int avg=0;
        int temp=0;
        int arr[]= new int[7];
        System.out.println("enter the tempreature:");
        for(int t=0;t<arr.length;t++){
            arr[t]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum= sum+ arr[i];
        }
        avg= sum/7;
        System.out.println("Average temperature:"+avg);
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
        for(int i=0;i<arr.length;i++){
                if(arr[i]>avg){
                   temp++;  
                }
            
        }
        System.out.println("Lowest temperature:"+arr[0]);
        System.out.println("Highest temperature:"+arr[arr.length-1]);
        System.out.println("no. of days more temp than avg:"+temp);
        sc.close();
    }
    
}

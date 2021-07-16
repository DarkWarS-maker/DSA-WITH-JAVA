import java.util.*;

public class BarChart {

    public static Scanner sc=new Scanner(System.in);
      
    public static int findMax(int arr[],int n){
        int max=-(int)1e9;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void printBarChart(int arr[],int n,int floor){

        for(int i=floor;i>0;i--){
            for(int j=0;j<arr.length;j++){
                if(arr[j]>=i){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=findMax(arr,n);
        printBarChart(arr,n,max);
    }
    
}

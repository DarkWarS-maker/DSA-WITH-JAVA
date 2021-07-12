import java.util.*;

public class RotateArr {
    public static Scanner sc=new Scanner(System.in);


    public static void rotateArr(int arr[],int r){
        int a=arr.length;
        r=r%a;
        if(r<0){
            r+=a;
        }
        int ans[]=new int[a];
        for(int i=0;i<ans.length;i++){
            ans[(i+r)%a]=arr[i];

        }

        for(int j=0;j<ans.length;j++){
            System.out.println(ans[j]);
        }
    }

    public static void main(String args[]){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int r=sc.nextInt();
        rotateArr(arr,r);



    }
    
}

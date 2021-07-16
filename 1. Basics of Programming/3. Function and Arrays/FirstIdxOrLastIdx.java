import java.util.*;

public class FirstIdxOrLastIdx {

    public static Scanner sc=new Scanner(System.in);

    public static void findFirstIdx(int arr[],int d){
        int st=0;
        int ed=arr.length-1;
        int fi=-1;
        while(st<=ed){
            int mid=(st+ed)/2;
            if(arr[mid]==d){
                if(mid-1>=0 && arr[mid-1]==d ){
                    ed=mid-1;
                }
                else{
                    fi=mid;
                    break;
                }

            }
            else if(arr[mid]>d){
                ed=mid-1;
            }
            else{
                st=mid+1;
            }

        }
        System.out.println(fi);
    }

    public static void findLastIdx(int arr[],int d){
        int st=0;
        int ed=arr.length-1;
        int lst=-1;
        while(st<=ed){
            int mid=(st+ed)/2;
            if(arr[mid]==d){
                if(mid+1<=(arr.length-1) && arr[mid+1]==d ){
                    st=mid+1;
                }
                else{
                    lst=mid;
                    break;
                }

            }
            else if(arr[mid]>d){
                ed=mid-1;
            }
            else{
                st=mid+1;
            }

        }
        System.out.println(lst);
    }
    public static void main(String[] args) {
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
         findFirstIdx(arr,d);
         findLastIdx(arr,d);
        
    }
    
}

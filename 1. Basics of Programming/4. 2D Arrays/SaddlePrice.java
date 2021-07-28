import java.util.*;
public class SaddlePrice {

    public static int colMax(int arr[][],int n,int m,int ci){
        int maxx=-(int)1e9;
        for(int r=0;r<n;r++){
            maxx=Math.max(arr[r][ci],maxx);
        
        }
        return maxx;
    
    }
    
    
    public static void findSaddlePrice(int arr[][],int n,int m){
        
        
        for(int r=0;r<n;r++){
            int minn=(int)1e9;
            int ci=-1;
            for(int c=0;c<n;c++){
                if(minn>arr[r][c]){
                    minn=arr[r][c];
                    ci=c;
                }
             }
            int maxx=colMax(arr,n,m,ci);
            if(maxx==arr[r][ci]){
                System.out.println(arr[r][ci]);
                return;
            
            }
            
        
        }
        System.out.println("Invalid input");
        return;
    
    
    }
	public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

	int n=sc.nextInt();
    int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        findSaddlePrice(arr,n,n);
    }
    
}

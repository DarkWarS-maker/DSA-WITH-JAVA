public static Scanner sc=new Scanner(System.in);


    public static void findPath(int arr[][],String asf,int sr,int sc,int dr,int dc){

        if(sr==dr-1 && sc==dc-1){
            System.out.println(asf);
        }

        //we can use visited arr

        if(sr<0 || sc< 0 || sr==dr || sc==dc || arr[sr][sc]==1){
            return;
        }

        arr[sr][sc]=1;


        //right
        findPath(arr, asf+'r', sr, sc+1, dr, dc);

        

        //left
        findPath(arr, asf+'l', sr, sc-1, dr, dc);
       
        

        //top
        findPath(arr, asf+'t', sr-1, sc, dr, dc);
        
        

        //bottom
        findPath(arr, asf+'d', sr+1, sc, dr, dc);

        arr[sr][sc]=0;
        
        

    }

    public static void main(String[] args) {
        int n=sc.nextInt();
        int m=sc.nextInt();

        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        findPath(arr,"",0,0,n,m);
        
    }
    
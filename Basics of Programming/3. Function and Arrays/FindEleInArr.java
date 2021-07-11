import java.util.*;

public class FindEleInArr {
    public static Scanner sc = new Scanner(System.in);

    public static int findElem(int arr[], int d, int n) {
        int find = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {
                return i;
            }
        }
        return find;
    }

    public static void main(String args[]) {
        int n = sc.nextInt();
        int arr[] = new int[n];
        

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int d = sc.nextInt();
        int ans = findElem(arr, d, n);
        System.out.println(ans);
    }

}

import java.util.*;



public class LastIdx {

    public static Scanner sc = new Scanner(System.in);

    public static int lastIdx(int arr[], int i, int data) {

        int recAns = lastIdx(arr, i + 1, data);
        if (recAns != -1) {
            return recAns;

        } else if (arr[i] == data) {
            return i;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        int ans = lastIdx(arr,0,data);
        System.out.print(ans);
    }

}

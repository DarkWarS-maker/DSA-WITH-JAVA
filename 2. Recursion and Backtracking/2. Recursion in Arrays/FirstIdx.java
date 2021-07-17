import java.util.*;

public class FirstIdx {

    public static Scanner sc = new Scanner(System.in);

    public static int findIdx(int arr[], int i, int data) {

        if (i == arr.length) {
            return -1;
        }

        else if (arr[i] == data) {
            return i;
        }
        return findIdx(arr, i + 1, data);

    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        int ans = findIdx(arr, 0, data);
        System.out.println(ans);
    }

}

import java.util.*;

public class MaxOfArr {

    public static Scanner sc = new Scanner(System.in);

    public static int findMax(int arr[], int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }

        int recAns = findMax(arr, i + 1);
        if (recAns > arr[i]) {
            return recAns;
        } else {
            return arr[i];
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int ans = findMax(arr, 0);
        System.out.println(ans);

    }

}

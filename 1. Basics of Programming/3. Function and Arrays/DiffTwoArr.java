import java.util.*;

public class DiffTwoArr {

    public static Scanner sc = new Scanner(System.in);

    public static void inputArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int[] diffTwoArry(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[m];

        int i = n - 1, j = m - 1, k = m - 1;
        int borrow = 0;
        while (k >= 0) {
            int diff = borrow + arr2[j] - (i >= 0 ? arr1[i] : 0);
            if (diff < 0) {
                diff += 10;
                borrow = -1;
            } else {
                borrow = 0;
            }

            ans[k] = diff;

            i--;
            j--;
            k--;

        }
        return ans;
    }

    public static void main(String args[]) {
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        inputArr(arr1);
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        inputArr(arr2);
        int ans[] = diffTwoArry(arr1, arr2);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }

}

import java.util.*;

public class DisplayArr {

    public static Scanner sc = new Scanner(System.in);

    public static void DisplayArr(int arr[], int i) {
        if (i == arr.length) {
            return;
        }
        System.out.println(arr[i]);
        DisplayArr(arr, i + 1);

    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        DisplayArr(arr, 0);

    }

}

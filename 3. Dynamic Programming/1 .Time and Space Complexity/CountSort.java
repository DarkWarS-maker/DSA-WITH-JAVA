import java.util.*;
public class CountSort {
    public static void countSort(int[] arr, int min, int max) {
        // write your code here

        int n = max - min + 1;
        int freq[] = new int[n + 1];

        for (int i = 0; i < arr.length; i++) {

            ++freq[arr[i] - min];

        }
        // for (int i = 0; i < freq.length; i++) {
        // System.out.print(freq[i]);
        // }
        // System.out.println();

        int psa[] = new int[n + 1];
        psa[0] = freq[0];
        for (int i = 1; i < freq.length; i++) {
            psa[i] = psa[i - 1] + freq[i];
        }
        // for (int i = 0; i < psa.length; i++) {
        // System.out.print(psa[i]);
        // }
        // System.out.println();
        int ans[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[psa[arr[i] - min] - 1] = arr[i];
            psa[arr[i] - min]--;
        }

        for (int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
        }

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        countSort(arr, min, max);
        print(arr);
    }

}

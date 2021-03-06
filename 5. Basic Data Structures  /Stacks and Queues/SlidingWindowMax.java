import java.util.*;
import java.io.*;
public class SlidingWindowMax {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        // code
        sliding_window_maximum(a, k);
    }

    public static void sliding_window_maximum(int[] arr, int k) {
        int[] ngr = nextGreaterRight(arr);
        int n = arr.length;

        for (int i = 0; i <= n - k; i++) {
            int j = i;

            while (ngr[j] < i + k) {
                j = ngr[j];
            }

            System.out.println(arr[j]);
        }
    }

    public static int[] nextGreaterRight(int[] arr) {
        int n = arr.length;
        int[] ngr = new int[n];

        ngr[n - 1] = n;
        Stack < Integer > st = new Stack < > ();
        st.push(n - 1);

        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            if (st.size() == 0) {
                ngr[i] = n;
            } else {
                ngr[i] = st.peek();
            }

            st.push(i);
        }

        return ngr;
    }

    
}

import java.util.*;
import java.io.*;
public class LargestArea {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // code

        Stack<Integer> st = new Stack<>();
        int lb[] = new int[arr.length];
        lb[arr.length - 1] = arr.length;
        st.push(arr.length - 1);

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                lb[i] = arr.length;
            } else {
                lb[i] = st.peek();
            }
            st.push(i);

        }

        st = new Stack<>();
        int rb[] = new int[arr.length];
        rb[0] = -1;
        st.push(0);

        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                rb[i] = -1;
            } else {
                rb[i] = st.peek();
            }
            st.push(i);

        }

        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = lb[i] - rb[i] - 1;
            int area = width * arr[i];
            if (area > maxArea) {
                maxArea = area;
            }
        }
        System.out.println(maxArea);
    }

}

import java.util.*;

public class SubSetsOfArr {

    public static Scanner sc = new Scanner(System.in);

    public static String convetToBinary(int n) {
        String ans = "";
        while (n != 0) {
            int rem = n % 2;
            ans = rem + ans;
            n /= 2;
        }
        return ans;
    }

    public static void printSubSet(int arr[], int n) {
        int num = (int)Math.pow(2, n);
        for (int i = 1; i < num; i++) {
            String bin = convetToBinary(i);
          
            if (bin.length() != arr.length) {
                while (bin.length() != arr.length) {
                    bin = "0" + bin;
                }
            }
            //System.out.println(bin);
            for (int j = 0; j < bin.length(); j++) {
                if ((bin.charAt(j)-'0') == 1) {
                    System.out.print(arr[j]+"\t");
                } else {
                    System.out.print("-\t");
                }

            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        printSubSet(arr, n);

    }

}

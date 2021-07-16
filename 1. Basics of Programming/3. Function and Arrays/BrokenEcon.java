import java.util.*;

public class BrokenEcon {

    public static Scanner sc = new Scanner(System.in);

    public static void findCeilAndFloor(int arr[], int d) {
        int st = 0;
        int ed = arr.length - 1;
        int cel = -1;
        int flr = -1;
        while (st <= ed) {
            int mid = (st + ed) / 2;

            if (arr[mid] > d) {
                cel = arr[mid];
                ed = mid - 1;
            }

            else if (arr[mid] < d) {
                flr = arr[mid];
                st = mid + 1;

            } else {
                System.out.println(d);
                return;

            }

        }
        System.out.println(cel);
        System.out.println(flr);

    }

    public static void main(String args[]) {
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int d = sc.nextInt();

        findCeilAndFloor(arr, d);

    }

}

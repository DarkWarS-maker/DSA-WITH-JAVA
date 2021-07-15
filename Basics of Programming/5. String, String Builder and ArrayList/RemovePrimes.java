import java.util.*;

public class RemovePrimes {

    public static Scanner sc = new Scanner(System.in);

    public static boolean checkPrime(int n) {

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void removePrimes(ArrayList<Integer> al) {
        for (int i = 0; i < al.size();) {
            Boolean ans = checkPrime(al.get(i));
            if (ans == true) {
                al.remove(i);

            } else {
                i++;
            }

        }
    }

    public static void main(String args[]) {
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        removePrimes(al);

        for (int a : al) {
            System.out.println(a);
        }

    }

}

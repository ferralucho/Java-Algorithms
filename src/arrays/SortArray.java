package arrays;

import java.util.*;

public class SortArray {
    static String findNumber(List<Integer> arr, int k) {

        boolean found = arr.contains(k);
        if(found) return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            int n = scan.nextInt();
            System.out.println(findNumber(new ArrayList<Integer>(
                    Arrays.asList(1,2,3,4,5,6,7,8)), n));
        }
        scan.close();
    }

}

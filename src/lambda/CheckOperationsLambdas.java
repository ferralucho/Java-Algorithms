package lambda;

import java.io.*;
import java.util.*;


/*
5
1 4
2 5
3 898
1 3
2 12

Sample Output

EVEN
PRIME
PALINDROME
ODD
COMPOSITE



 */

interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        PerformOperation op = (num) -> {
            return num % 2 == 0;
        };
        return op;
    }

    public PerformOperation isPrime() {
        PerformOperation op = (num) -> {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return true;
                }
            }
            return false;
        };
        return op;
    }

    public PerformOperation isPalindrome() {
        PerformOperation op = (num) -> {
            StringBuffer s1 = new StringBuffer(Integer.toString(num));
            StringBuffer s2 = new StringBuffer(Integer.toString(num));
            s2.reverse();
            if (s1.toString().compareTo(s2.toString()) == 0) {
                return true;
            }
            else
            {
                return false;
            }
        };
        return op;
    }
}

     class Solution {

        public static void main(String[] args) throws IOException {
            MyMath ob = new MyMath();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            PerformOperation op;
            boolean ret = false;
            String ans = null;
            while (t -- > 0) {
                String s = br.readLine().trim();
                StringTokenizer st = new StringTokenizer(s);
                int ch = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                if (ch == 1) {
                    op = ob.isOdd();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "ODD" : "EVEN";
                } else if (ch == 2) {
                    op = ob.isPrime();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PRIME" : "COMPOSITE";
                } else if (ch == 3) {
                    op = ob.isPalindrome();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

                }
                System.out.println(ans);
            }
        }
    }

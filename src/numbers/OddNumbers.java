package numbers;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

 class Solution {
    static List<Integer> oddNumbers(int l, int r) {
        List<Integer> listOdd = new LinkedList<Integer>();

        for (int i = l; i <= r; i++) {
            if (i % 2 != 0) {
                listOdd.add(i);
            }
        }
        return listOdd;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        int r = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> res = oddNumbers(l, r);
        System.out.println( res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
                + "\n");


        bufferedReader.close();
    }
}


package numbers;

import java.util.Scanner;

public class PalindromePrime {

    public static boolean prime(int num){
        for(int divisor = 3; divisor <= Math.sqrt(num); divisor += 2){
            if(num % divisor == 0){
                return false;
            }
        }
        return true;
    }

    public static int reverse(int n){
        int reverse = 0;
        String strRever = Integer.toString(n);
        char[] charStr = strRever.toCharArray();
        char[] retStr = new char[strRever.length()];
        for (int i = charStr.length - 1; i >= 0; i--) {
            retStr[i] = charStr[i];
        }
        return Integer.parseInt(new String(retStr));
    }

    public static void generatePalindromicPrime(int y){
        if(y == 0) return;
        System.out.print(2 + "\n"); // print the first Palindromic Prime
        int count = 1;
        int num = 3;
        while(count < y) {
            if(num == reverse(num) && prime(num)) {
                count++; // counts check when to terminate while loop
                System.out.print(num + "\n"); // print the Palindromic Prime
            }
            num += 2; // inrease iterator value by two
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the quantity of First Palindromic Primes you want");
        int n = in.nextInt();
        generatePalindromicPrime(n);
    }

}

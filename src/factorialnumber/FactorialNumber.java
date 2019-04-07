package factorialnumber;

import java.util.Stack;

public class FactorialNumber {
    /*
    Implement a method that, given a number, calculates the factorial of that number. The method implementation must use a stack data structure.
    Implement the class Factorial and call the method getFactorial(int n) which receives an int as parameter and returns the factorial of that number.
       */

    public int getFactorial(int n){
        Stack<Integer> stack = new Stack<Integer>();

        int result = 1;

        for (int i = n; i >= 1; i--){
            stack.push(i);
        }

        while(!stack.empty()){
            result = result * stack.pop();
        }
        return result;
    }

}
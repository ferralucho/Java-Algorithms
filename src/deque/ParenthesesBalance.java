package deque;

import java.util.ArrayDeque;

import static org.junit.Assert.assertEquals;

public class ParenthesesBalance {

    static boolean isMatchingPair(char character1, char character2) {
        if (character1 == '(' && character2 == ')')
            return true;
        else if (character1 == '{' && character2 == '}')
            return true;
        else if (character1 == '[' && character2 == ']')
            return true;
        else
            return false;
    }

    static boolean areBalanced(char parEx[]) {
        if(parEx.length == 0)
            return false;

        ArrayDeque<Character> charStack = new ArrayDeque();
        char aux;
        for (int i = 0; i < parEx.length; i++) {
            if (parEx[i] == '{' || parEx[i] == '(' || parEx[i] == '[') {
                charStack.push(parEx[i]);

            }
            if (parEx[i] == '}' || parEx[i] == ')' || parEx[i] == ']') {
                if (charStack.isEmpty()) {
                    return false;
                }
                if (!isMatchingPair(charStack.pop(), parEx[i])) {
                    return false;
                }
            }
        }
        if (charStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        assertEquals(true, areBalanced("f(e(d))".toCharArray()));
        assertEquals(false, areBalanced("{(b)".toCharArray()));
        assertEquals(false, areBalanced("{c]".toCharArray()));
        assertEquals(false, areBalanced(")(".toCharArray()));
        assertEquals(false, areBalanced("".toCharArray()));
    }
}

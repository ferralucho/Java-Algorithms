package com.ferralucho;

import java.util.ArrayDeque;

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

}

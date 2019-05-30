package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeItAnagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word1 = in.nextLine();
        String word2 = in.nextLine();
        int length = 0;

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < word1.length(); i++){
            char c = word1.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }

        for(int j = 0; j < word2.length(); j++){
            char c = word2.charAt(j);
            if(map.containsKey(c) && map.get(c) != 0){
                map.put(c, map.get(c) -1);
                length += 2;
            }
        }
        System.out.println(word1.length()-(length/2)+ word2.length()-(length/2));
    }
}

package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        Pattern p = Pattern.compile("<(.[^<>]*)>([^<>]+)</\\1>");
        boolean found = false;
        while(testCases > 0){
            String line = in.nextLine();
            Matcher m = p.matcher(line);
            found = false;
            while (m.find()) {
                found = true;
                System.out.println( m.group(2) );
            }
            if (!found) {
                System.out.println( "None" );
            }
            testCases--;
        }
    }
}

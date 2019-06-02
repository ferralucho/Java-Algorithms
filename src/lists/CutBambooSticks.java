package lists;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CutBambooSticks {

    public static List<Integer> cutBamboo(List<Integer> lengths) {
        Collections.sort(lengths);

        int position = 0;
        int remaining = lengths.size();
        List<Integer> retList = new LinkedList<Integer>();

        while (0 < remaining) {
            retList.add(remaining);
            int count = countFromPosition(lengths, position);
            position += count;
            remaining -= count;
        }

        return retList;
    }

    private static int countFromPosition(List<Integer> sticks, int from) {
        int value = sticks.get(from);
        for (int i = 1; from + i < sticks.size(); ++i) {
            if (value != sticks.get(from + i)) {
                return i;
            }
        }
        return sticks.size() - from;
    }

    public static void main(String[] args) {
        LinkedList<Integer> arrLengths = new LinkedList<Integer>();
        arrLengths.add(5);
        arrLengths.add(4);
        arrLengths.add(4);
        arrLengths.add(2);
        arrLengths.add(2);
        arrLengths.add(8);
        System.out.println(cutBamboo(arrLengths));

    }

}

import arraylistnumbers.Classifier;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestArrayListNumbers {

    @Test
    public void testArrayNumbers(){
        ArrayList<Integer> listA = new ArrayList<Integer>( Arrays.asList(2,8,5,10));
        ArrayList<Integer> listB = new ArrayList<Integer>(Arrays.asList(2,2,3,4,4,20));
        ArrayList<Integer> listC = new ArrayList<Integer>(Arrays.asList((2)));
        ArrayList<Integer> listD = new ArrayList<Integer>(Arrays.asList(3,4,20));
        Classifier c = new Classifier();
        c.classify(listA, listB);
        assertEquals(listC, c.getListC());
        assertEquals(listD, c.getListD());
    }
}

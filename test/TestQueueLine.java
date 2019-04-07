import org.junit.Test;
import queueline.Queue;
import static org.junit.Assert.assertEquals;

public class TestQueueLine {

    @Test
    public void testQueueLine(){
        Queue q = new Queue();
        int amount = 5;
        q.enqueue(amount);
        String name = q.getPersonName(3);
        assertEquals("Person4", name);
    }

}

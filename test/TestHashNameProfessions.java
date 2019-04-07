import hashmapnameprofessions.People;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHashNameProfessions {

    @Test
    public void testHashNameProfessions(){
        People p = new People();
        String job = p.findPerson("Maria");
        assertEquals("Engineer", job);
    }
}

package gedcomreader;
import java.io.IOException;
import java.text.ParseException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestUS05 {
    @Before
    public void Before(){
        System.out.println("Testing US05");

    }

    @Test
    public void testMarriageBeforeDeath () throws IOException, ParseException {

        GED instance = new GED();
        instance.traversal();
        instance.errorsPrint();
        assertTrue(true);
        assertNotNull(instance.individuals);
        assertNotNull(instance.families);
        assertNotNull(instance.errors);
        String error = "Error US05: Married date of Rone /Jams/(I4) in the family of F2 is after the death date.";
        assertEquals(true,instance.errors.contains(error));
    }
    @After
    public void After(){
        System.out.println("Testing end");
    }
}


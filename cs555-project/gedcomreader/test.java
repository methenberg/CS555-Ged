package gedcomreader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import org.junit.Test;
import static org.junit.Assert.*;


public class test {

    public test() {
    }

    @Test
    public void testDatesBeforeCurrentDate () throws IOException, FileNotFoundException, ParseException {
        System.out.println("Testing US01");
        GED instance = new GED();
        instance.traversal();
        instance.errorsPrint();

        assertTrue(true);
        assertNotNull(instance.individuals);
        assertNotNull(instance.families);
        assertNotNull(instance.errors);




        if (instance.errors.size() <= 0) {
            fail("the exception number is wrong");
        }
        else {
            System.out.println("the number of errors is correct");
        }
        if (instance.errors.size() != 5) {
            fail("the exception number is wrong");
        }
        else {
            System.out.println("the number of errors is correct");
        }

        if (!instance.errors.contains("Error US01: Birthday of Tim /Jams/(I1) occurrs after the current date")) {
            fail("the first exception information is wrong");
        }
        else {
            System.out.println("set of errors contains the first error");
        }

        if (!instance.errors.contains("Error US01: Birthday of Mary /Smith/(I3) occurrs after the current date")) {
            fail("the second exception information is wrong");
        }
        else {
            System.out.println("set of errors contains the second error");
        }
        if (!instance.errors.contains("Error US01: Birthday of Mary /Smith/(I3) occurrs after the current date")) {
            fail("the third exception information is wrong");
        }
        else {
            System.out.println("set of errors contains the second error");
        }
        System.out.println("test of US01 passed");
    }



}

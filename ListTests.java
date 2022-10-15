import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.SwingPropertyChangeSupport;

public class ListTests {

    @Test
    public void filteringCheck() {
        //making a list of strings 
        List<String> result = new ArrayList<>();
        result.add("Cat");
        result.add("Horse");
        sc.checkString(results);
        //System.out.println(result) (is it being added)
        assertArrayEquals(expected:result("dog", "frog"))
        result.sc.checkString(result);
        
        //assertArrayEquals(expected:("dog", "frog"), sc.checkString(result);


    }
}
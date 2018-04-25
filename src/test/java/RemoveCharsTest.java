import com.strelia.removeFirstLastCharacter.RemoveChars;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveCharsTest {

    @Before
    public void initialize() {
    }


    @Test
    public void testRemoval() {
        assertEquals("loquen", RemoveChars.remove("eloquent"));
        assertEquals("ountr", RemoveChars.remove("country"));
        assertEquals("erso", RemoveChars.remove("person"));
        assertEquals("lac", RemoveChars.remove("place"));
    }

    @After
    public void close() {
    }

}

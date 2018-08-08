import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard("Corded", 104, "Black", "QWERTY");
    }

    @Test
    public void hasType(){
        assertEquals("Corded", keyboard.getType());
    }

    @Test
    public void hasNumberOfKeys(){
        assertEquals(104, keyboard.getNumberOfKeys());
    }

    @Test
    public void hasColour(){
        assertEquals("Black", keyboard.getColour());
    }

    @Test
    public void hasLayout(){
        assertEquals("QWERTY", keyboard.getLayout());
    }

    @Test
    public void canType(){
        assertEquals("You have typed.", keyboard.Type());
    }

    @Test
    public void canSendData(){
        assertEquals("Sending...data", keyboard.sendData("data"));
    }
}

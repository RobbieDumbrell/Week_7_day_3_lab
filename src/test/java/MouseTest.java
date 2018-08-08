import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    Mouse mouse;

    @Before
    public void before(){
        mouse = new Mouse("Corded", 2, "Black");
    }

    @Test
    public void hasType(){
        assertEquals("Corded",mouse.getType());
    }

    @Test
    public void hasButtons(){
        assertEquals(2, mouse.getNumberOfButtons());
    }

    @Test
    public void hasColour(){
        assertEquals("Black", mouse.getColour());
    }

    @Test
    public void canMove(){
        assertEquals("Mouse Cursor has disappeared from the screen", mouse.moveMouse());
    }

    @Test
    public void canClickButton(){
        assertEquals("You have clicked a button, congratulations.", mouse.buttonClick());
    }

    @Test
    public void canSendData(){
        assertEquals("Sending...data", mouse.sendData("data"));
    }
}

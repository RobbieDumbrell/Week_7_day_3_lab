import behaviours.IOutput;
import device_management.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class ComputerTest {
    Computer computer;
    Monitor monitor;
    Mouse mouse;
    Keyboard keyboard;

    @Before
    public void before() {
        mouse = new Mouse ("Corded", 2, "Black");
        keyboard = new Keyboard("Corded", 104, "Black", "QWERTY");
        monitor = new Monitor(22, 786432);
        computer = new Computer(8, 512, monitor, mouse);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

//    @Test
//    public void hasMonitor() {
//        assertEquals(22, computer.getMonitor().getScreenSize());
//        assertEquals(786432, computer.getMonitor().getPixels());
//    }

    @Test
    public void hasOutputDevice() {
        IOutput outputDevice = computer.getOutputDevice();
        assertNotNull(outputDevice);
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaPrinter(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        Computer computer = new Computer(8, 512, printer, keyboard);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaSpeaker(){
        Speaker speaker = new Speaker(100);
        Computer computer = new Computer(8, 512, speaker, mouse);
        assertEquals("playing: Beep!", computer.outputData("Beep!"));
    }

    @Test
    public void canSetOutputDevice(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void hasInputDevice(){
        assertEquals(mouse, computer.getInputDevice());
    }

    @Test
    public void canSendDataViaMouse(){
        assertEquals("Sending...data", computer.inputData("data"));
    }

    @Test
    public void canSendDataViaKeyboard(){
        computer.setInputDevice(keyboard);
        assertEquals("Sending...Data", computer.inputData("Data"));
    }

    @Test
    public void  canSaveDataInDataStream(){
        computer.inputData("Anything");
        assertEquals("Anything",computer.getDataStream());
    }

    @Test
    public void canStillSaveDataInDataStream(){
        computer.inputData("Anything");
        computer.inputData("Something else");
        assertEquals("Anything, Something else", computer.getDataStream());
    }

    @Test
    public void canDisplayDataFromDataStream(){
        computer.inputData("Something");
        assertEquals("Something is now on screen", computer.outputDataStream());
    }

}

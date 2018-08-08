package device_management;

import behaviours.IInput;

public class Mouse implements IInput {

    private String type;
    private int NumberOfButtons;
    private String colour;

    public Mouse(String type, int numberOfButtons, String colour) {
        this.type = type;
        NumberOfButtons = numberOfButtons;
        this.colour = colour;
    }

    public String getType(){
        return type;
    }

    public int getNumberOfButtons() {
        return NumberOfButtons;
    }

    public String getColour() {
        return colour;
    }

    public String moveMouse(){
        return "Mouse Cursor has disappeared from the screen";
    }

    public String buttonClick(){
        return "You have clicked a button, congratulations.";
    }

    public String sendData(String data){
        return "Sending..." + data;
    }
}

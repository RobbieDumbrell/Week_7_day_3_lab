package device_management;

import behaviours.IInput;

public class Keyboard implements IInput {

    private String type;
    private int numberOfKeys;
    private String colour;
    private String layout;

    public Keyboard(String type, int numberOfKeys, String colour, String layout) {
        this.type = type;
        this.numberOfKeys = numberOfKeys;
        this.colour = colour;
        this.layout = layout;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String getColour() {
        return colour;
    }

    public String getLayout() {
        return layout;
    }

    public String Type(){
        return "You have typed.";
    }

    public String sendData(String data){
        return "Sending..." + data;
    }
}

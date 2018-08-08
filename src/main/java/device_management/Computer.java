package device_management;

import behaviours.IInput;
import behaviours.IOutput;

import java.util.ArrayList;

public class Computer {
    private int ram;
    private int hddSize;
    private IOutput outputDevice;
    private IInput inputDevice;
    private String dataStream;

    public Computer(int ram, int hddSize, IOutput outputDevice, IInput inputDevice) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.outputDevice = outputDevice;
        this.inputDevice = inputDevice;
        this.dataStream = null;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public IOutput getOutputDevice() {
        return this.outputDevice;
    }

    public IInput getInputDevice(){
        return this.inputDevice;
    }

    public String outputData(String data) {
        return this.outputDevice.outputData(data);
    }

    public void setOutputDevice(IOutput outputDevice){
        this.outputDevice = outputDevice;
    }

    public String inputData(String data){

        if (dataStream == null){
            dataStream = data;
        } else {
            dataStream += (", " + data);
        }
            return this.inputDevice.sendData(data);
    }

    public void setInputDevice(IInput inputDevice){
        this.inputDevice = inputDevice;
    }

    public String getDataStream(){
        return this.dataStream;
    }

    public String outputDataStream(){
        return outputDevice.outputData(dataStream);
    }
}

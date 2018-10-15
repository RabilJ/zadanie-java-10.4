package zadanie10.domowe4.Model;

import zadanie10.domowe4.Model.Processor;

public class Ram extends Processor {
    private int memory;

    public Ram(String model, String producent, String serial, int timing, int temp, int maxTemp, int memory) {
        super(model, producent, serial, timing, temp, maxTemp);
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {

        return super.toString() + "\nPamięć: " + getMemory()+"GB";
    }


}
package zadanie10.domowe4.Model;

import zadanie10.domowe4.Model.Features;

public class HardDrive extends Features {
    private int memory;

    public HardDrive(String model, String producent, String serial, int memory) {
        super(model, producent, serial);
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
        return super.toString()+"Pamięć: "+memory+"GB";
    }
}

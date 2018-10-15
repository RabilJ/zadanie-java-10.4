package zadanie10.domowe4.Model;

import zadanie10.domowe4.Model.Features;

public class Processor extends Features {
    private int timing;
    private int temp;
    private int maxTemp;

    public Processor(String model, String producent, String serial, int timing, int temp, int maxTemp) {
        super(model, producent, serial);
        this.timing = timing;
        this.temp = temp;
        this.maxTemp = maxTemp;
    }


    public int getTiming() {
        return timing;
    }

    public void setTiming(int timing) {
        this.timing = timing;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    @Override
    public String toString() {
        return super.toString()+"Taktowanie: " + timing + "MHz\nAktualna temperatura: " +
                temp + "C\nMaksymalna temperatura: " + maxTemp + "C";
    }

}
package zadanie10.domowe4.Model;

public abstract class Features {
    private String model;
    private String producent;
    private String serial;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Features(String model, String producent, String serial) {
        this.model = model;
        this.producent = producent;
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Producent: " + getProducent() + "\nModel: " + getModel() + "\nNumer seryjny: " + getSerial() + "\n";
    }
}

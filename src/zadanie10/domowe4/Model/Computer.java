package zadanie10.domowe4.Model;

public class Computer {
    private Processor proc;
    private HardDrive hardDrive;
    private Ram ram;

    public Computer(Processor proc, HardDrive hardDrive, Ram ram) {
        this.proc = proc;
        this.hardDrive = hardDrive;
        this.ram = ram;
    }

    public Processor getProc() {
        return proc;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Procesor:\n"+proc+"\n\nRAM:\n"+ram+"\n\nDysk twardy:\n"+hardDrive;
    }

}

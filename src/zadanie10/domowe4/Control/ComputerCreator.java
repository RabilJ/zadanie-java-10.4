package zadanie10.domowe4.Control;


import zadanie10.domowe4.Model.Computer;
import zadanie10.domowe4.Model.HardDrive;
import zadanie10.domowe4.Model.Processor;
import zadanie10.domowe4.Model.Ram;

public class ComputerCreator {

    public static Computer create() {
        Processor proc = new Processor("i5","Intel","75464",2500,60,95);
        HardDrive hd = new HardDrive("Gamma","MSI","32424",125);
        Ram ram = new Ram("HyperX","Kingstone","112234",3000,70,95,12);
        Computer comp = new Computer(proc,hd,ram);
        return comp;
    }
}

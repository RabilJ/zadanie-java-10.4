package zadanie10.domowe4.Control;

import zadanie10.domowe4.ExcAndEnum.FreezeAlertException;
import zadanie10.domowe4.Model.Processor;
import zadanie10.domowe4.Model.Ram;
import zadanie10.domowe4.ExcAndEnum.OverheatException;

public class TimingManipulator {
    public  void boostTiming(Processor proc, int speedUp) {

        if ((proc.getTemp() + 10 * (speedUp / 100)) > proc.getMaxTemp()) {
            throw new OverheatException();
        } else {
            proc.setTiming(proc.getTiming() + speedUp);
            proc.setTemp(proc.getTemp()+ 10 * (speedUp / 100));
        }
    }
    public  void lowerTiming(Ram ram, int slowDown) {
        if ((ram.getTemp() - 15 * (slowDown / 100)) < 0) {
            throw new FreezeAlertException();
        } else {
            ram.setTiming(ram.getTiming() - slowDown);
            ram.setTemp(ram.getTemp()- 15 * (slowDown / 100));
        }
    }
    public  void lowerTiming(Processor proc, int slowDown ) {

        if ((proc.getTemp() - 10 * (slowDown / 100)) < 0) {
            throw new FreezeAlertException();
        } else {
            proc.setTiming(proc.getTiming() - slowDown);
            proc.setTemp(proc.getTemp()- 10 * (slowDown / 100));
        }
    }
    public  void boostTiming(Ram ram, int speedUp) {
        if ((ram.getTemp() + 15 * (speedUp / 100)) > ram.getMaxTemp()) {
            throw new OverheatException();
        } else {
            ram.setTiming(ram.getTiming() + speedUp);
            ram.setTemp(ram.getTemp()+ 15 * (speedUp / 100));
        }
    }

}

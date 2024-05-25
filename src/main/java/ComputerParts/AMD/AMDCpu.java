package ComputerParts.AMD;

import ComputerParts.ICpu;

public class AMDCpu implements ICpu {

    @Override
    public void doCpuStuff() {
        System.out.println("AMD CPU");
    }
}

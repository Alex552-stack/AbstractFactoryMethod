package ComputerParts.Intel;

import ComputerParts.ICpu;

public class IntelCpu implements ICpu {
    @Override
    public void doCpuStuff() {
        System.out.println("Intel CPU");
    }
}

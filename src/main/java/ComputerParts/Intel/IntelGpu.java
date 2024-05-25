package ComputerParts.Intel;

import ComputerParts.IGpu;

public class IntelGpu implements IGpu {
    @Override
    public void doGpuStuff() {
        System.out.println("Intel Gpu");
    }
}

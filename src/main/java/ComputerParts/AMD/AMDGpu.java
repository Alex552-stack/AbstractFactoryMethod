package ComputerParts.AMD;

import ComputerParts.IGpu;

public class AMDGpu implements IGpu {
    @Override
    public void doGpuStuff() {
        System.out.println("AMD Gpu");
    }
}

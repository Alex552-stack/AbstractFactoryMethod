package ComputerParts.NVidia;

import ComputerParts.IGpu;

public class NVidiaGpu implements IGpu {
    @Override
    public void doGpuStuff() {
        System.out.println("NVidia Gpu");
    }
}

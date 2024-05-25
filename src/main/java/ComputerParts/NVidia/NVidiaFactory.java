package ComputerParts.NVidia;

import ComputerParts.ICpu;
import ComputerParts.IGpu;
import ComputerParts.IPcPartsFactory;

public class NVidiaFactory implements IPcPartsFactory {
    @Override
    public ICpu createCpu() {
        return new NVidiaCpu();
    }

    @Override
    public IGpu createGpu() {
        return new NVidiaGpu();
    }
}

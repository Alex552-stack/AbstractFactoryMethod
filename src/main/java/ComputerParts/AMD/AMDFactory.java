package ComputerParts.AMD;

import ComputerParts.ICpu;
import ComputerParts.IGpu;
import ComputerParts.IPcPartsFactory;

public class AMDFactory implements IPcPartsFactory {
    @Override
    public ICpu createCpu() {
        return new AMDCpu();
    }

    @Override
    public IGpu createGpu() {
        return new AMDGpu();
    }
}

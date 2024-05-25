package ComputerParts.Intel;

import ComputerParts.ICpu;
import ComputerParts.IGpu;
import ComputerParts.IPcPartsFactory;

public class IntelFactory implements IPcPartsFactory {
    @Override
    public ICpu createCpu() {
        return new IntelCpu();
    }

    @Override
    public IGpu createGpu() {
        return new IntelGpu();
    }
}

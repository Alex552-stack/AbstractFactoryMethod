package ComputerParts.NVidia;

import ComputerParts.ICpu;

public class NVidiaCpu implements ICpu {
    @Override
    public void doCpuStuff() {
        System.out.println("NVidia CPU(if it is anything other than ai, consider it failed)");
    }
}

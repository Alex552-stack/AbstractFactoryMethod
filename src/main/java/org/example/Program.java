package org.example;

import ComputerParts.ICpu;
import ComputerParts.IGpu;
import ComputerParts.IPcPartsFactory;

public class Program {
    private final IPcPartsFactory _pcFactory;
    private ICpu _cpu;
    private IGpu _gpu;

    public Program(IPcPartsFactory pcFactory)
    {
        _pcFactory = pcFactory;
    }

    public void createPc()
    {
        System.out.println("Creating PC....");
        _cpu = _pcFactory.createCpu();
        _gpu = _pcFactory.createGpu();
        System.out.println("PC created....");
    }

    public void usePc()
    {
        _cpu.doCpuStuff();
        _gpu.doGpuStuff();
    }
}

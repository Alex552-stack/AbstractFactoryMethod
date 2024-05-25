package org.example;

import ComputerParts.AMD.AMDFactory;
import ComputerParts.IPcPartsFactory;
import ComputerParts.Intel.IntelFactory;
import ComputerParts.NVidia.NVidiaFactory;

public class Main {
    public static void main(String[] args) {
            //IPcPartsFactory factory = new AMDFactory();
            //IPcPartsFactory factory = new NVidiaFactory();
            IPcPartsFactory factory = new IntelFactory();

            Program program = new Program(factory);
            program.createPc();
            program.usePc();

        }
    }

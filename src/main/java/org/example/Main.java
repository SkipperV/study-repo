package org.example;

import april25.HardDiskDrive;
import april25.SolidStateDrive;

public class Main {
    public static void main(String[] args) {
        SolidStateDrive solidStateDrive = new SolidStateDrive("M.2", "Samsung 970 Pro", 976762);
        HardDiskDrive hardDiskDrive = new HardDiskDrive("SATA3", "WD Blue", 953870);

        solidStateDrive.printInfo();
        hardDiskDrive.printInfo();
        //Із інтерфейсами нічого не придумав, буду думати далі, вже на наступний раз. Зроблю в 3 рази більше)
    }
}

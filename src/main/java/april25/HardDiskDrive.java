package april25;

public class HardDiskDrive extends Storage{
    public HardDiskDrive() {
        super();
    }

    public HardDiskDrive(String formFactor, String name, int capacity) {
        super(formFactor+" HDD", name, capacity);
    }

    @Override
    public void printInfo() {
        System.out.println("This is HardDiskDrive Class");
        System.out.println(getInfo());
    }
}

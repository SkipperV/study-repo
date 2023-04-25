package april25;

public class SolidStateDrive extends Storage {
    public SolidStateDrive() {
        super();
    }

    public SolidStateDrive(String formFactor, String name, int capacity) {
        super(formFactor+" SSD", name, capacity);
    }

    @Override
    public void printInfo() {
        System.out.println("This is SolidStateDrive Class");
        System.out.println(getInfo());
    }
}

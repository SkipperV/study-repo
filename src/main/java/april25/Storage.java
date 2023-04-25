package april25;

//Перевірка роботи Override в методі Main

public class Storage {
    private String name;
    private String formFactor;
    private int capacity;
    private int usedSpace;
    private int freeSpace;

    public Storage() {
        name = "";
        formFactor = "";
        capacity = 0;
        usedSpace = 0;
        freeSpace = 0;
    }

    public Storage(String formFactor, String name, int capacity) {
        this.formFactor = formFactor;
        this.name = name;
        this.capacity = capacity;
        this.usedSpace = 0;
        this.freeSpace = capacity;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setUsedSpace(int usedSpace) {
        this.usedSpace = usedSpace;
        freeSpace = capacity - usedSpace;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public String getName() {
        return name;
    }

    public long getCapacity() {
        return capacity;
    }

    public long getUsedSpace() {
        return usedSpace;
    }

    public long getFreeSpace() {
        return freeSpace;
    }

    public String getInfo() {
        return ("Name: " + getFormFactor() + " " + getName() + "\n" +
                "Capacity: " + getCapacity() + "MB\n" +
                "Used Space: " + getUsedSpace() + "MB\n" +
                "Free Space: " + getFreeSpace() + "MB\n");
    }

    public void printInfo() {
        System.out.println("This is Storage class instance");
        System.out.println(getInfo());
    }
}

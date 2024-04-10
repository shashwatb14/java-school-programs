// abstract class cannot be used to create objects
public abstract class Computer {
    private String name;
    private String cpu;

    // in GB
    private int primaryMemory;
    private int secondaryMemory;

    // constructor
    public Computer(String name, int primaryMemory, int secondaryMemory) {
        this.name = name;
        this.cpu = "";
        this.primaryMemory = primaryMemory;
        this.secondaryMemory = secondaryMemory;
    }

    // overloaded constructor
    public Computer(String name, String cpu, int primaryMemory, int secondaryMemory) {
        this.name = name;
        this.cpu = cpu;
        this.primaryMemory = primaryMemory;
        this.secondaryMemory = secondaryMemory;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public int getPrimaryMemory() {
        return this.primaryMemory;
    }

    public int getSecondaryMemory() {
        return this.secondaryMemory;
    }

    public String getCPU() {
        return this.cpu;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrimaryMemory(int primaryMemory) {
        this.primaryMemory = primaryMemory;
    }

    public void setSecondaryMemory(int secondaryMemory) {
        this.secondaryMemory = secondaryMemory;
    }

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    // no method body
    public abstract double calculateVirtualMemory();

    public String toString() {
        return "Computer: " + this.name + "\nProcessor" + this.cpu + "\nRAM: " + this.primaryMemory + " GB" + "\nSSD: " + this.secondaryMemory + " GB";
    }
}

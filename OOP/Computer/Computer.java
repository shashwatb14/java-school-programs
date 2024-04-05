// abstract class cannot be used to create objects
public abstract class Computer {
    private String name;

    // in GB
    private int primaryMemory;
    private int secondaryMemory;

    // constructor
    public Computer(String name, int primaryMemory, int secondaryMemory) {
        this.name = name;
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

    // no method body
    public abstract double calculateVirtualMemory();

    public String toString() {
        return "Computer: " + this.name + "\nRAM: " + this.primaryMemory + " GB" + "\nSSD: " + this.secondaryMemory + " GB";
    }
}

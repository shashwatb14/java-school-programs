public class StorageServer extends Server {
    private int redundancy;

    public StorageServer(String name, int primaryMemory, int secondaryMemory, int clients, int redundancy) {
        super(name, primaryMemory, secondaryMemory, clients);
        this.redundancy = redundancy;
    }

    public int getRedundancy() {
        return this.redundancy;
    }

    public void setRedundancy() {
        this.redundancy = Math.abs(redundancy); // must be positive integer
    }

    public String toString() {
        return super.toString() + "\nRedundancy: " + this.redundancy;
    }
}

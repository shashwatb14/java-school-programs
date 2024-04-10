public class Server extends Computer {

    private int clients;

    public Server(String name, int primaryMemory, int secondaryMemory, int clients) {
        super(name, primaryMemory, secondaryMemory);
        this.clients = clients;
    }

    // getter
    public int getClients() {
        return this.clients;
    }

    public void setClients(int clients) {
        this.clients = clients;
    }

    // example
    public double calculateVirtualMemory() {
        return (this.getPrimaryMemory() * 3) + (this.clients * 0.5);
    }

    public String toString() {
        return super.toString() + "\nClients" + this.clients;
    }
}

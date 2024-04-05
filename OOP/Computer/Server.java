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

    @Override
    public double calculateVirtualMemory() {
        return 0;
    }
}

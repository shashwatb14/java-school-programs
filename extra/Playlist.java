import java.util.Scanner;

public class Playlist {

    static DoublyCircularLinkedList playlist = new DoublyCircularLinkedList();

    public static void main(String[] args) {
        int num;
        stringNode current = playlist.head;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nCurrent playlist: ");
            playlist.printSongs();

            if (current != null) System.out.println("Now playing: " + current.data + "\n");
            else System.out.println("No songs in the playlist.\n");

            System.out.println("Choose an option: [1] next song");
            System.out.println("                  [2] previous song");
            System.out.println("                  [3] add song");
            System.out.println("                  [4] insert song");
            System.out.println("                  [5] remove song");
            System.out.println("                  [6] delete playlist");
            System.out.println("                  [7] quit");
            System.out.print(">>> ");
            num = scanner.nextInt();

            if (num < 0 || num > 7) System.out.println("Invalid option.");

            switch (num) {
                case 1 -> {
                    if (current != null) current = current.next;
                }
                case 2 -> {
                    if (current != null) current = current.prev;
                }
                case 3 -> {
                    boolean change = playlist.isEmpty();
                    add();
                    if (change) current = playlist.head;
                }
                case 4 -> {
                    boolean change = playlist.isEmpty();
                    insert();
                    if (change) current = playlist.head;
                }
                case 5 -> remove();
                case 6 -> reset();
            }
        } while (num != 7);
    }

    // add song to the end of the list
    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add song: ");
        String song = scanner.nextLine();
        playlist.append(song);
    }

    // insert anywhere in playlist
    public static void insert() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert song: ");
        String song = scanner.nextLine();

        Scanner intScanner;
        do {
            intScanner = new Scanner(System.in);
            System.out.print("Position to insert song: ");
        } while (!intScanner.hasNextInt());
        int pos = intScanner.nextInt();

        while (true) {
            try {
                playlist.insert(song, pos);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // remove a specific song based on index
    public static void remove() {
        Scanner scanner;
        do {
            scanner = new Scanner(System.in);
            System.out.print("Remove song (position number): ");
        } while (!scanner.hasNextInt());
        int pos = scanner.nextInt();

        while (true) {
            try {
                playlist.remove(pos);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // deletes entire playlist
    public static void reset() {
        playlist.reset();
    }
}

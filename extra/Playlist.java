public class Playlist {
    public static void main(String[] args) {
        LinkedList playlist = new LinkedList();
        System.out.println("No songs");
        try {
            playlist.insert("test", 0);
            playlist.printList();
            playlist.insert("qwerty", 1);
            playlist.printList();
            playlist.insert("lol", 1);
            playlist.printList();
            playlist.insert("LMAO", 3);
            playlist.printList();
            playlist.insert("123", 0);
            playlist.printList();
            System.out.println("Removed " + playlist.remove(2) + " from list.");
            playlist.printList();
            playlist.append("ADDED");
            playlist.printList();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

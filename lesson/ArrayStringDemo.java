public class ArrayStringDemo {

    private final static int MAXSIZE = 10;
    private static int currentIndex = 0;

    // checks if empty
    public static boolean isEmpty() {
        return currentIndex == 0;
    }

    // checks if full
    public static boolean isFull() {
        return currentIndex == MAXSIZE;
    }

    // prints the complete array
    public static void printWholeArray(String[] array) {
        System.out.print("[" + array[0]);
        for (int i = 1; i < MAXSIZE; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.println("] Length: " + array.length);
    }

    // prints only the populated parts of the array
    public static void printPopulatedArray(String[] array) {
        int c = 1;
        if (array[0] != null) System.out.print(array[0]);
        for (int i = 1; i < MAXSIZE; i++) {
            if (array[i] != null) {
                c++;
                System.out.print(", " + array[i]);
            }
        }
        System.out.println(" (Population size: " + c + ")");
    }

    // clones and returns array
    public static String[] clone(String[] array) {
        String[] duplicate = new String[MAXSIZE];
        for (int i = 0; i < MAXSIZE; i++) {
            duplicate[i] = array[i];
        }
        return duplicate;
    }

    // adds to the end of an array
    public static void append(String[] array, String item) {
        // throws exception if no space for adding
        if (isFull()) System.out.println(" Error - array full");
        else {
            array[currentIndex] = item;
            currentIndex++;
        }
        printPopulatedArray(array);
    }

    // returns index of data in array
    public static int search(String[] array, String data) {
        for (int i = 0; i < MAXSIZE; i++) {
            if (array[i].equalsIgnoreCase(data)) return i;
        }
        return -1;
    }

    // creates visual separation
    public static void separate() {
        System.out.println("\n---------------------------------------------------------------------\n");
    }

    public static void main(String[] args) {
        String[] array = new String[MAXSIZE];

        // printing initial array
        System.out.print("Initial array: ");
        printWholeArray(array);

        separate();

        // array with names
        String[] original = {"James", "Alan", "Steve", "John", "Larry", "Elon", "Mark", "Tim", "Bill", "Ada", "Linus", "Grace"};

        // appending
        for (String x : original) {
            // printf with -5%s to align all the names on the left
            System.out.printf("Adding [%-5s] to array: ", x);
            // populating array by appending
            append(array, x);
        }

        separate();

        System.out.print("Cloned array: ");
        printWholeArray(clone(array));

        separate();

        // searching
        System.out.printf("Search for Alan:  %2d\n", search(array, "Alan"));
        System.out.printf("Search for Linus: %2d\n", search(array, "Linus"));

        separate();
    }
}
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
        // throws error if full
        if (isFull()) System.out.println(" Error - array full");
        else {
            array[currentIndex] = item;
            currentIndex++;
            printPopulatedArray(array);
        }
    }

    // returns index of data in array
    public static int search(String[] array, String data) {
        for (int i = 0; i < MAXSIZE; i++) {
            if (array[i] != null && array[i].equalsIgnoreCase(data)) return i;
        }
        return -1;
    }

    // deletes element from array
    public static void delete(String[] array, String item) {
        int index = search(array, item);
        if (index == -1) System.out.printf("Error - %s does not exist\n", item);
        else {
            array[index] = null;
            printWholeArray(array);
        }
    }

    // replaces element in array
    public static void replace(String[] array, String original, String replacement) {
        int index = search(array, original);
        if (index == -1) System.out.printf("Error - %s does not exist\n", original);
        else {
            array[index] = replacement;
            printWholeArray(array);
        }
    }

    // swaps two given elements
    public static void swap(String[] array, int index1, int index2) {
        // validate indexes
        if (index1 < 0 || index1 > MAXSIZE - 1 || index2 < 0 || index2 > MAXSIZE - 1) {
            System.out.println("Error - invalid indexes");
            return;
        }

        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        printWholeArray(array);
    }

    // inserts an element at any given position
    // replaced element fills any available spaces
    public static void insert(String[] array, String data, int index) {
        if (index < 0 || index > MAXSIZE - 1) {
            System.out.println("Error - invalid index");
            return;
        }

        String temp = array[index];
        array[index] = data;

        int replaceIndex = searchForNull(array);
        if (replaceIndex == -1) System.out.println("No available spaces");
        else {
            array[replaceIndex] = temp;
            printWholeArray(array);
        }
    }

    // returns null index in array
    public static int searchForNull(String[] array) {
        for (int i = 0; i < MAXSIZE; i++) {
            if (array[i] == null) return i;
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

        //cloning
        System.out.print("Cloned array: ");
        printWholeArray(clone(array));

        separate();

        // searching
        System.out.printf("Search for Alan:  %2d\n", search(array, "Alan"));
        System.out.printf("Search for Linus: %2d\n", search(array, "Linus"));

        separate();

        // deleting
        System.out.print("Deleting 'John':    ");
        delete(array, "John");
        System.out.print("Deleting 'Gosling': ");
        delete(array, "Gosling");

        separate();

        // replacing
        System.out.println("Replacing 'Steve' with 'Wozniak': ");
        replace(array, "Steve", "Wozniak");
        System.out.println("Replacing 'John' with 'Cena': ");
        replace(array, "John", "Cena");

        separate();

        // swapping
        System.out.println("Swapping the first element with the last element: ");
        swap(array, 0, MAXSIZE - 1);
        System.out.println("Swapping array[0] with array[10]: ");
        swap(array, 0, 10);

        separate();

        // inserting
        System.out.println("Inserting 'John' at the first position: ");
        insert(array, "John", 0);
        System.out.println("Inserting 'Steve' at the third position: ");
        insert(array, "Steve", 2);
        System.out.println("Inserting 'John' at index 10: ");
        insert(array, "John", MAXSIZE);

        separate();

        System.out.print("Final array: ");
        printWholeArray(array);
    }
}
public class Sorting {
    public static void main(String[] args) {
        int[] array = {12, 7, 14, 9, 5, 3};
        String[] names = {"James", "Alan", "Steve", "John", "Larry", "Elon", "Mark", "Tim", "Bill", "Ada", "Linus", "Grace"};

        printWholeArray(array);
        selection(clone(array));
        bubble(clone(array));
        selection(clone(names));
        bubble(clone(names));
    }

    // print for int arrays
    public static void printWholeArray(int[] array) {
        System.out.print("[" + array[0]);
        for (int i = 1, n = array.length; i < n; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.println("]");
    }

    // print for string arrays
    public static void printWholeArray(String[] array) {
        System.out.print("[" + array[0]);
        for (int i = 1, n = array.length; i < n; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.println("]");
    }

    // selection sort
    public static void selection(int[] a) {
        int len = a.length;
        for (int smallest = 0; smallest < len - 1; smallest++) {
            int index = smallest;
            int min = a[index];
            int j = index + 1;

            // finding min value
            for (; j < len; j++) {
                if (a[j] < a[index]) {
                    index = j;
                    min = a[j];
                }
            }

            // swap
            a[index] = a[smallest];
            a[smallest] = min;
        }
        printWholeArray(a);
    }

    // bubble sort
    public static void bubble(int[] a) {
        int n = a.length;
        boolean swap = true;

        for (int i = 0; i < n && swap; i++) {
            swap = false;
            for (int j = 0; j < n - i - 1; j++) {
                // swap if greater
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swap = true;
                }
            }
        }
        printWholeArray(a);
    }

    // selection sort for strings
    public static void selection(String[] a) {
        int len = a.length;
        for (int smallest = 0; smallest < len - 1; smallest++) {
            int index = smallest;
            String min = a[index];
            int j = index + 1;

            // finding min value
            for (; j < len; j++) {
                if (a[j].compareToIgnoreCase(a[index]) < 0) {
                    index = j;
                    min = a[j];
                }
            }

            // swap
            a[index] = a[smallest];
            a[smallest] = min;
        }
        printWholeArray(a);
    }

    // selection sort for strings
    public static void bubble(String[] a) {
        int n = a.length;
        boolean swap = true;

        for (int i = 0; i < n && swap; i++) {
            swap = false;
            for (int j = 0; j < n - i - 1; j++) {
                // swap if greater
                if (a[j].compareToIgnoreCase(a[j + 1]) > 0) {
                    String temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swap = true;
                }
            }
        }
        printWholeArray(a);
    }

    // clone for int arrays
    public static int[] clone(int[] array) {
        int n = array.length;
        int[] duplicate = new int[n];
        for (int i = 0; i < n; i++) {
            duplicate[i] = array[i];
        }
        return duplicate;
    }

    // clone for string arrays
    public static String[] clone(String[] array) {
        int n = array.length;
        String[] duplicate = new String[n];
        for (int i = 0; i < n; i++) {
            duplicate[i] = array[i];
        }
        return duplicate;
    }
}

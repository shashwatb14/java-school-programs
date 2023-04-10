public class Sorting {
    public static void main(String[] args) {
        int[] array = {12, 7, 14,  9, 5, 3};
        printWholeArray(array);
        selection(array);
        bubble(array);
    }

    public static void printWholeArray(int[] array) {
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // swap if greater
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        printWholeArray(a);
    }
}

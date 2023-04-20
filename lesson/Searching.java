public class Searching {
    public static void main(String[] args) {
        int[] array = {2, 14, 8, 7, 10, 12, 4, 6, 9};
        Sorting.printWholeArray(array);
        System.out.println("Index of 14 prior sorting: " + linearSearch(array, 14));
        Sorting.bubble(array);
        System.out.println("Index of 14 after sorting: " + linearSearch(array, 14));
        System.out.println("Index of  2 using binarySearch: " + binarySearch(array, 0, array.length,2));
        System.out.println("Index of  4 using binarySearch: " + binarySearch(array, 0, array.length,4));
        System.out.println("Index of  6 using binarySearch: " + binarySearch(array, 0, array.length,6));
        System.out.println("Index of  7 using binarySearch: " + binarySearch(array, 0, array.length,7));
        System.out.println("Index of  8 using binarySearch: " + binarySearch(array, 0, array.length,8));
        System.out.println("Index of  9 using binarySearch: " + binarySearch(array, 0, array.length,9));
        System.out.println("Index of 10 using binarySearch: " + binarySearch(array, 0, array.length,10));
        System.out.println("Index of 12 using binarySearch: " + binarySearch(array, 0, array.length,12));
        System.out.println("Index of 14 using binarySearch: " + binarySearch(array, 0, array.length,14));
        System.out.println("Index of 20 using binarySearch: " + binarySearch(array, 0, array.length,20));
        System.out.println("Index of 20 using linearSearch: " + linearSearch(array, 20));

    }

    // returns index; rogue value = -1
    public static int linearSearch(int[] arr, int val) {
        for (int i = 0, n = arr.length; i < n; i++) {
            if (arr[i] == val) return i;
        }
        return -1;
    }

    // returns index through recursive binary
    public static int binarySearch(int[] arr, int start, int end, int val) {

        // doesn't exist if end is lesser or equal to start
        if (end <= start) return -1;

        // mid-index by calculating average
        int mid = (start + end) / 2;

        // return index if target reached
        if (arr[mid] == val) return mid;

        // if value is lesser than target, search right half recursively
        else if (arr[mid] < val) return binarySearch(arr, mid + 1, end, val);

        // otherwise search right half recursively
        else return binarySearch(arr, start, mid, val);
    }
}

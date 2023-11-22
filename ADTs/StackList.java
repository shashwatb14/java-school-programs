public class StackList {

    // tracks position of index
    private int currentIndex;

    // set length of array
    private final int LENGTH = 10;
    int[] array = new int[LENGTH];

    // constructor
    public StackList() {
        this.currentIndex = 0;
    }

    // overriding constructor
    public StackList(int[] array) {

        // ensure array fits perfectly
        if (array.length <= LENGTH) {

            // to adjust currentIndex due to invalid numbers
            int errors = 0;

            for (int i = 0, n = 0; i < array.length; i++, n++) {
                if (array[i] == 0) {
                    System.out.println("ERROR - Invalid number at index " + i);
                    errors++;
                    n--;
                } else this.array[n] = array[i];
            }
            this.currentIndex = array.length - 1 - errors;
        }
        else {
            for (int i = 0; i < LENGTH; i++) {
                if (array[i] != 0) this.array[i] = array[i];
            }
            this.currentIndex = this.array.length - 1;
        }
    }

    public boolean isEmpty() {
        return array[0] == 0;
    }

    public boolean isFull() {
        return currentIndex == array.length - 1;
    }

    // push
    public void push(int num) {
        if (num == 0) System.out.println("Invalid number.");
        else if (!isFull()) {
            if (array[currentIndex] == 0) array[currentIndex] = num;
            else {
                array[currentIndex + 1] = num;
                currentIndex++;
            }
        }
        else System.out.println("Stack is full!");
    }

    // pop
    public void pop() {
        if (!isEmpty()) {
            array[currentIndex] = 0;
            if (currentIndex > 0) currentIndex--;
        }
        else System.out.println("Stack is empty!");
    }

    // return built output string
    public String toString() {
        String output = "TAIL -> ";
        for (int num : array) {
            output += num + " -> ";
        }
        output += "HEAD";
        return output;
    }
}

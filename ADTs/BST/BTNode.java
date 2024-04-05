public class BTNode {

    // integer value to be stored in binary tree
    public int data;

    // self-referential
    public BTNode right;
    public BTNode left;

    // empty constructor
    public BTNode() {}

    // constructor overloading
    public BTNode(int data) {
        this.data = data;
    }

    public String toString() {
        return String.valueOf(this.data);
    }
}

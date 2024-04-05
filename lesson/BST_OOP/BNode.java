public class BNode
{
	private BNode left;
	private BNode right;
	private Student data;		// 'data' TYPE has to be changed

	public BNode(Student data)	// 'data' TYPE has to be changed
	{
		this.data  = data;
		this.left  = null;
		this.right = null;
	}

	// certain methods need to be added to this class
	// setters and getters
	public Student getData() {
		return this.data;
	}

	public void setData(Student data) {
		this.data = data;
	}

	public BNode getLeft() {
		return this.left;
	}

	public void setLeft(BNode left) {
		this.left = left;
	}

	public BNode getRight() {
		return right;
	}

	public void setRight(BNode right) {
		this.right = right;
	}
}


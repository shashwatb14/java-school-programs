
public class Student
{
	private int id;
	private String name;
	private double height;

	public Student()
	{ }

	public Student(int id, String name, double height)
	{	this.id = id;
		this.name = name;
		this.height = height;
	}

	public String getName()
	{	return this.name;
	}

	public int getID()
	{	return this.id;
	}

	public double getHeight()
	{	return this.height;
	}

	public void setName(String name)
	{	this.name = name;
	}

	public void setID(int id)
	{	this.id = id;
	}

	public String toString()
	{
        return this.getID() + ": " + this.getName() +
                            " @ " + this.getHeight() + " m tall";
	}

	public boolean equals(Student two) {
		return this.id == two.id;
	}

}

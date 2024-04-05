import java.io.*;
import java.util.*;

public class StudentTest
{
	public static BNode treeH;
	public static BNode treeName;

	public static void insertByHeight(BNode node, Student data)
    {
        double height = data.getHeight();

    }

	public static void insertByName(BNode node, Student data)
	{

    }

	public static void preOrder(BNode node)
	{

	}

	public static void inOrder(BNode node)
	{

	}

	public static void postOrder(BNode node)
	{

	}

    public static void descending(BNode node)
    {

    }


	public static void main (String[] args) throws IOException
	{
		System.out.println();
        load();  // load student list from disk and insert by HEIGHT
        System.out.println();
        load2(); // load student list from disk and insert by NAME
		System.out.println("\nBST by ID ========");
		System.out.println("*pre-order:");
        preOrder(treeH);
        System.out.println("\n*in-order:");
        inOrder(treeH);
        System.out.println("\n*post-order:");
        postOrder(treeH);
        System.out.println("\n*descending order:");
		descending(treeH);

		System.out.println("\nBST by Name ======");
		System.out.println("*pre-order:");
        preOrder(treeName);
        System.out.println("\n*in-order:");
        inOrder(treeName);
        System.out.println("\n*post-order:");
        postOrder(treeName);
        System.out.println("\n*descending order:");
        descending(treeName);
	}

	// do not modify these methods
	public static void load() throws IOException
	{
		int id;
		String name;
		double height;
        Student newNode;
		File file = new File("student_data.txt");
		Scanner in = new Scanner(file);
        while( in.hasNext() )
        {	String temp = in.nextLine();
			String[]line = temp.split(",");
			id = Integer.parseInt(line[0]);
        	name = line[1];
        	height = Double.parseDouble(line[2]);
			newNode = new Student(id, name, height);
			insertByHeight(treeH, newNode);
        } // end while
        in.close();
        //System.out.println("Data loaded from file.\n");
	}

	public static void load2() throws IOException
	{
		int id;
		String name;
		double height;
        Student newNode;
		File file = new File("student_data.txt");
		Scanner in = new Scanner(file);
        while( in.hasNext() )
        {	String temp = in.nextLine();
			String[]line = temp.split(",");
			id = Integer.parseInt(line[0]);
        	name = line[1];
			height = Double.parseDouble(line[2]);
			newNode = new Student(id, name, height);
			insertByName(treeName, newNode);
        } // end while
        in.close();
        //System.out.println("Data loaded from file.\n");
	}

}

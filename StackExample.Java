import java.io.*;
class Node
{
	int data1;

	Node next1;

	public Node(int p)
	{

		data1=p;

		next1=null;
	}
}
class stackllist
{
	Node top1=null;

	public boolean isempty1()
	{
		if (top1==null)

			return true;

		else

			return false;
	}
	public void addFirst(int y)
	{
		if(isempty1()==true)
		{
			Node x=new Node(y);
			top1=x;
		}
		else
		{
			Node x=new Node(y);

			x.next1=top1;

			top1=x;
		}
	}
	public int removeFirst()
	{

		if(isempty1()==true)
		{
			System.out.println("Stack is empty....");

			return -1;
		}
		else
		{
			int y=top1.data1;

			top1=top1.next1;

			return y;
		}
	}
	public void show()
	{

		if(isempty1()==true)

		{

			System.out.println("No elements....");

		}

		else

		{

			Node at=top1;

			while(at!=null)

			{

				System.out.println(at.data1);

				at=at.next1;
			}
		}
	}
}

public class StackSystem{

	public static void main(String[] args) throws IOException

	{

		BufferedReader object1=new BufferedReader(new InputStreamReader(System.in));

		int c1,t1;

		stackllist stll=new stackllist();

		do

		{

			System.out.println("1.Add a process ID");

			System.out.println("2.Remove a process");

			System.out.println("3.Show the Stack");

			System.out.println("4.Exit");

			System.out.println("Enter Choice:");

			c1=Integer.parseInt(object1.readLine());

			switch (c1)

			{

			case 1:

				System.out.println("Enter element to insert:");

				t1=Integer.parseInt(object1.readLine());

				stll.addFirst(t1);

				break;

			case 2:

				t1=stll.removeFirst();

				System.out.println("removed element is: "+t1);

				break;

			case 3:

				stll.show();
			}
		}
		while(c1!=4);
	}
}

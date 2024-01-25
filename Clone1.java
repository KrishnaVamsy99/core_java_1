/* Cloning using new instance method */

//import java.lang.*;

class College
{
	int rollno;
	String name;
	
	College()
	{
		rollno=0;
		name="";
	}

	College(int rollno, String name)
	{
		this.rollno = rollno;
		this.name = name;
	}

	public void disp()
	{
		System.out.println("A sample method");
	}
	
}

class Clone1
{
	public static void main(String[] args) throws Exception
	{
		//Class c1 = Class.forName("College");
		//College co1 = (College)c1.newInstance();
		//co1.disp();
	}
}
/* cloning */

//import java.lang.*;
//import java.util.*;

class Emp implements Cloneable
{
	int eno;
	String ename;
	float esal;

	public Emp()
	{
		eno=0;
		ename="";
		esal=0.0f;
	}
	
	public Emp(int eno, String ename, float esal)
	{
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
	}
	
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	public int getEno()
	{
		return eno;
	}
	
	public String getEname()
	{
		return ename;
	}
	
	public float getEsal()
	{
		return esal;
	}
}	



class Clone
{
	public static void main(String []args)
	{
		Emp e1 = new Emp(101, "Krishna", 10000000.00f);

		try
		{
			Emp e2 = (Emp)e1.clone();
			System.out.println(e2.getEno());
			System.out.println(e2.getEname());
			System.out.println(e2.getEsal());	
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}
/* Serialization */

//import java.lang.*;
//import java.util.*;
import java.io.*;

class Dog implements Serializable
{
	int a=10;
	Dog()
	{
		System.out.println("Constructor");
	}

	public void disp()
	{
		System.out.println("Normal Disp method");
	}
		
}

class Serialization1 
{
	public static void main(String[] args) throws Exception
	{
		Dog d1 = new Dog();
		FileOutputStream fos = new FileOutputStream("Dog.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.flush();
		oos.close();
		System.out.println("Successfully Created");

		FileInputStream fis = new FileInputStream("Dog.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		d2.disp();
		ois.close();
	}
}
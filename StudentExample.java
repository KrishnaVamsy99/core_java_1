import java.lang.*;

class Student
{
	int sno;
	String sname,result,grade;
	float c,cpp,java,python,oracle,total,avg;

	Student(int sno, String sname, float c, float cpp, float java, float python, float oracle)
	{
		this.sno = sno; // s1.sno = 101
		this.sname = sname; // s1.sname = "krishna"
		this.c = c; // s1.c = 80
		this.cpp = cpp; // s1.cpp = 75
		this.java = java; //s1.java = 95
		this.python = python; //s1.python = 100
		this.oracle = oracle; // s1.oracle = 60

		/* result=null, grade=null,total = 450.0,avg=90.0 */
	}

	private float findTotalMarks()
	{
		float t= c+cpp+java+python+oracle;
		return t;
	}

	// total/no.of subjects
	private float findAvg()
	{
		float avg1 = findTotalMarks()/5;
		return avg1;
	}

	public void showResults()
	{
		System.out.println("sno\t\t: "+sno);
		System.out.println("sname\t\t: "+sname);
		System.out.println("C\t\t: "+c);
		System.out.println("CPP\t\t: "+cpp);
		System.out.println("java\t\t: "+java);
		System.out.println("python\t\t: "+python);
		System.out.println("oracle\t\t: "+oracle);
		total = findTotalMarks();
		System.out.println("TotalMarks\t:"+total);
		avg = findAvg();
		System.out.println("Average\t\t: "+avg);
		grade = findGrade();
		System.out.println("Grade\t\t:"+grade);
		if(grade == "A" || grade == "B" || grade == "C" || grade == "D" || grade == "E")
		{
			result = "Pass";
		}
		else
		{
			result = "Fail";
		}
		System.out.println("Result\t\t:"+result);
	}

	private String findGrade()
	{
		float fa = avg; //fa = 90.0f
		if(fa>=90.0f)
		{
			return "A+";
			
		}
		else if(fa>=80.0f && fa<90.0f)
		{
			return  "A";
			
		}
		else if(fa>=70.0f && fa<80.0f)
		{
			return  "B";
		}
		else if(fa>=60.0f && fa<70.0f)
		{
			return  "C";
		}
		else if(fa>=50.0f && fa<60.0f)
		{
			return  "D";
		}
		else if(fa>=40.0f && fa<50.0f)
		{
			return  "E";	
		}
		else
		{
			return  "F";
		}
	}

	
}

class StudentExample
{
	public static void main(String[] args)
	{
		Student s1 = new Student(101, "Krishna", 80, 75, 95, 100, 60);
		s1.showResults();
	
			
	}
}
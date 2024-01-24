class Employee
{
    int a,b;
    static int c=1;
    public Employee()
    {
        System.out.println("Default Constructor for Employee.");
        a=1;
        b=1;
    }
    public Employee(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    void display()
    {
        System.out.println("Display method");
        System.out.println("a "+a);
        System.out.println("b "+b);
    }
}

class Student
{
    int sno, sb1, sb2, sb3, sb4, sb5, total;
    String sname;
    float avg;
    String grade;
    
    public Student(int sno, String sname, int sb1, int sb2, int sb3, int sb4, int sb5)
    {
        this.sno = sno;
        this.sname = sname;
        this.sb1 = sb1;
        this.sb2 = sb2;
        this.sb3 = sb3;
        this.sb4 = sb4;
        this.sb5 = sb5;

    }

    public int totalMarks()
    {
        total = sb1 + sb2 + sb3 + sb4 + sb5;
        return total;
    }

    public float average()
    {
        avg = totalMarks()/5;
        return avg;
    }

    public void findGrade() 
    {
        int t = totalMarks();
        if(t>=550)
        {
            System.out.println("Grade A+");
        }
        else if (t>500 && t<550) 
        {
            System.out.println("Grade A");
        }
        else if(t>=450 && t<500)
        {
            System.out.println("Grade B");
        }
        else if(t>=400 && t<450)
        {
            System.out.println("Grade C");
        }
        else if(t>=350 && t<400)
        {
            System.out.println("Grade D");
        }
        else if(t>=300 && t<350)
        {
            System.out.println("Grade E");
        }
        else
        {
            System.out.println("Grade F");
        }
        
    }

    
}
class Const
{
    public static void main(String[] args) {
        /*Employee e1 = new Employee();
        Employee e2 = new Employee(10,20);
        System.out.println("Non-parameterized constructor display method");
        e1.display();
        System.out.println("Parameterized constructoor display method");
        e2.display();*/

        Student s1 = new Student(101, "Krishna", 90, 65, 60, 80, 85);
        System.out.println("total marks "+s1.totalMarks());
        System.out.println("average marks "+s1.average());
        s1.findGrade();
    }
}

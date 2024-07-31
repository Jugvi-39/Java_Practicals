import java.util.*;

class member
{
	String name;
	int age;
	String num;
	String address;
	long salary;
	
	void printSalary()
	{
		System.out.println("The salary is: "+salary);
	}
}

class Employee extends member
{
	String specialization;
	Employee()
	{}
	Employee(String n, int a, String no, String add, long s, String spec)
	{
		name=n;
		age=a;
		num=no;
		address=add;
		salary=s;
		specialization=spec;
		//printSalary();
	}
	void print()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Number: "+num);
		System.out.println("Address: "+address);
		System.out.println("Specialization: "+specialization);
		printSalary();
	}
	
}

class Manager extends member
{
	String dept;
	Manager()
	{}
	Manager(String n, int a, String no, String add, long s, String d)
	{
		name=n;
		age=a;
		num=no;
		address=add;
		salary=s;
		dept=d;
		//printSalary();
	}
	void print()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Number: "+num);
		System.out.println("Address: "+address);
		System.out.println("Department: "+dept);
		printSalary();
	}
}

public class prc18
{
	public static void main(String args[])
	{
		Employee e1=new Employee("JUGVI",20,"7575068948","Laxminarayan vihar society",50000,"Cloud computing");
		System.out.println("The employee details are: ");
		e1.print();
		
		System.out.println();
		
		Manager m1=new Manager("SHAILI DESAI",40,"8369463746","20, Aristro villa",75000,"Machine learning");
		System.out.println("The manager details are: ");
		m1.print();
		/*Scanner s=new Scanner(System.in);
		
		System.out.println("Enter employee details: ");
		System.out.println("Name: ");
		e1.name=s.nextLine();
		System.out.println("Age: ");
		e1.age=s.nextInt();
		System.out.println("Phone Number: ");
		e1.num=s.nextLong();
		s.nextLine();
		System.out.println("Address: ");
		e1.address=s.nextLine();
		System.out.println("Specialization: ");
		e1.specialization=s.nextLine();
		System.out.println("Salary: ");
		e1.salary=s.nextLong();
		
		System.out.println("THE DETAILS OF EMPLOYEE ARE: ");
		e1.print();
		
		Manager m1=new Manager();
		
		System.out.println("Enter manager details: ");
		System.out.println("Name: ");
		m1.name=s.nextLine();
		System.out.println("Age: ");
		m1.age=s.nextInt();
		System.out.println("Phone Number: ");
		m1.num=s.nextLong();
		s.nextLine();
		System.out.println("Address: ");
		m1.address=s.nextLine();
		System.out.println("Department: ");
		m1.dept=s.nextLine();
		System.out.println("Salary: ");
		m1.salary=s.nextLong();
		
		System.out.println("THE DETAILS OF MANAGER ARE: ");
		m1.print();*/
		
	}
}

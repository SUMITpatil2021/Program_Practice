package collection_framework;
import java.util.*;
import java.lang.*;
import java.io.*;


public class ArrayList_Demo {
	static class Emp{
		int id;
		String name;
		double sal;
		
		public Emp()
		{
			super();
			id=0;
			name="";
			sal=0.0;
		}
		public Emp(int id,String name , double sal)
		{
			this.id=id;
			this.name=name;
			this.sal=sal;
		}
		
		public String toString()
		{
			return "ID: "+id+" Name : "+name+" Salary : "+sal;
		}
	}

	public static void main(String[] args) {
		
	/*	ArrayList ar=new ArrayList();
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add("sumit");
		ar.add(1); */
	   
		/*   Simple arrayList Functionality 
		
	 	System.out.println("******simple get method *********");
		System.out.println(ar.get(0));
		
		
		System.out.println("******simple for loop *********");
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		System.out.println("******Iterator *********");
		Iterator it=ar.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		} */
		
		// ArrayList of User Defind  Class Emp 
		ArrayList<Emp> emp=new ArrayList<Emp>();
		
		Emp e1=new Emp(1,"Sumit",50000);
		Emp e2=new Emp(2,"Varad",60000);
		Emp e3=new Emp(3,"Sushant",40000);
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		System.out.println("******Emp  *********");

		System.out.println(emp.get(0)); 
		System.out.println(emp.get(1)); 
		System.out.println(emp.get(2)); 

		emp.remove(2);
		System.out.println("******Emp  after removing  *********");

		for(int i=0;i<emp.size();i++)
		{
			System.out.println(emp.get(i));
		}
		
		
		ArrayList<Emp> emp1=new ArrayList<Emp>();
		Emp e4=new Emp(4,"Vaibhav",60000);
		Emp e5=new Emp(5,"mahesh",65000);

		emp1.add(e5);
		emp1.add(e1);
		emp1.add(e4);
//		emp1.addAll(emp);
		
		
		
		
		System.out.println("******Emp1 *********");
		Iterator<Emp> e=emp1.iterator();
		while(e.hasNext())
		{
			Emp emps=e.next();
			System.out.print(" "+emps.id);
			System.out.print(" "+emps.name);
			System.out.print(" "+emps.sal);
			System.out.println();
		}
		
		// retainnAll() method will give only comman object 
		emp1.retainAll(emp);
		System.out.println("******Emp1 after retainAll  *********");
		for(int i=0;i<emp1.size();i++)
		{
			System.out.println(emp1.get(i));
		}

		
		
		
		

	}

}

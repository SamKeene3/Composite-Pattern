package composite;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Manager implements Teacher{
	
	private String name;
	private double salary;
	
	
	public Manager ( String name, double salary) {
		
		this.name	= name;
		this.salary = salary;
		
	}
	
	 List<Teacher> students = new ArrayList<Teacher>();
	 public void add(Teacher student) {
	    students.add(student);
	    
	 }
	 	public Teacher getChild(int i) {
		  return students.get(i);
		 }

		 public String getName() {
		  return name;
		 }

		 public double getSalary() {
		  return salary;
		 }
	
		 public void print() {
		  System.out.println("-------------");
		  System.out.println("Name ="+getName());
		  System.out.println("Salary = £"+getSalary());
		  System.out.println("-------------");

		  Iterator<Teacher> studentIterator = students.iterator();
		    while(studentIterator.hasNext()){
		     Teacher student = studentIterator.next();
		     student.print();
		    }
		 }

		 public void remove(Teacher student) {
		  students.remove(student);
		 }
}

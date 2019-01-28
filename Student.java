package composite;

public class Student implements Teacher{
	
	private String name;
	private double salary;
	
	public Student(String name,double salary){
	    this.name = name;
	    this.salary = salary;
	}
	
	public void add(Teacher student) {
		// TODO Auto-generated method stub
		
	}
	public void remove(Teacher student) {
		// TODO Auto-generated method stub
		
	}
	public Teacher getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
		}
	
	
public void print() {
    System.out.println("-------------");
    System.out.println("Name ="+getName());
    System.out.println("Salary = £ "+getSalary());
    System.out.println("-------------");
    
}
}
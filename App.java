package composite;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Teacher emp1= new Student("John", 10000);
		 Teacher emp2=new Student("David", 15000);
		 Teacher manager1=new Manager("Daniel",25000);
		  manager1.add(emp1);
		  manager1.add(emp2);
		  Teacher emp3=new Student("Michael", 20000);
		  Manager manager=new Manager("Mark", 50000);
		  manager.add(emp3);
		  manager.add(manager1);
		  manager.print();
		 }
		}

	



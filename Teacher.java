package composite;

public interface Teacher {
	
	   public void add(Teacher student);
	   public void remove(Teacher student);
	   public Teacher getChild(int i);
	   public String getName();
	   public double getSalary();
	   public void print();
	

}

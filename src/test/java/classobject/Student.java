package classobject;

public class Student {
	// Field Initialization 
	// Fields(Properties)
	private String name;
	private Character grade;
	private Integer age ;
	
	{
		grade = 'X';
	}
	// Constructor 
	// default constructor
	public Student(int a) { 
		age = a;
	}
	
	public Student(String n, Integer a) {
		this(a);
		name = n;

	}
	
	
	// Methods 
	public void displayObjectState() {
		StringBuilder strb = new StringBuilder();
		strb.append("====objetc state======\n")
		    .append("names: "  + name + "\n")
		    .append("grade: "  + grade + "\n")
		    .append("age  : "  + age + "\n")
		    .append("======================\n");
		System.out.println( strb.toString()  );
	}
}

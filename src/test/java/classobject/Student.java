package classobject;

public class Student {
	// Field Initialization 
	// Fields(Properties)
	protected String name;
	private Character grade = 'Y';
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
		grade = 'L';
	}
	
	
	// Methods 
	protected void displayObjectState() {
		StringBuilder strb = new StringBuilder();
		strb.append("====objetc state======\n")
		    .append("names: "  + name + "\n")
		    .append("grade: "  + grade + "\n")
		    .append("age  : "  + age + "\n")
		    .append("======================\n");
		System.out.println( strb.toString()  );
	}
}

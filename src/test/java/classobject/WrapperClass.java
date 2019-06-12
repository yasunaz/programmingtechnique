package classobject;

public class WrapperClass {
	// Fields 
	static public final Integer passcode = 200;

	public static void main(String[] args) {
		
		// primitive ---> wrapper 
		String ageText = String.valueOf(12);
		
		Character grade = new Character('A');    // not raw data:  this is an object 
		char g = grade.charValue();              // unboxing 
		
		
		Character charobjcet = 'a';              // boxing 
		
		
		Integer age = 10 * 10 * 10;   // 1000   
		Integer number = 100 * 10;    // 1000   
	

		
		System.out.println( age  );
		System.out.println(number);
		
		// age == number 
		if( age.equals(number) ) {  // hey if age pointing to the same object as number pointing at?
			System.out.println("Yes they are the same");
		}else {
			System.out.println("NO! they are different");
		}
		
		System.out.println("Before: " + passcode );	
		System.out.println("After: " + passcode  );
		  
	}
	

}

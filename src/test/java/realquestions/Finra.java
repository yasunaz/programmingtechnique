package realquestions;

public class Finra {

	public static void main(String[] args) {
		
		printFinra();
	}

	static public void printFinra() {
		
		for (int i = 1; i <= 30; i++) {
			if (i % 10 == 1)
				System.out.print("\n");
			
			if (i % 15 == 0)
				System.out.print("FINRA" + ", ");
			else if (i % 3 == 0)
				System.out.print("FIN" + ", ");
			else if (i % 5 == 0)
				System.out.print("RA" + ", ");
			else
				System.out.print(i + ", ");
		}
	}
}

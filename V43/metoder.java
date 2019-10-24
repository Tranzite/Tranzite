import java.util.Scanner;
public class metoder {

	public static void main(String[] args) {
	
		twoNumbers();
		
	}
	
	public static void twoNumbers() {
		
		int tal1;
		int tal2;

		Scanner input = new Scanner(System.in);

		System.out.println("Vänligen skriv in 2 heltal");
		tal1 = input.nextInt();
		tal2 = input.nextInt();

		minstaTal(tal1, tal2);

	}

	public static String minstaTal(int tal1, int tal2) {
	
	if ( tal1 <= tal2) {
		System.out.println("minsta talet är: " + tal1);
	}
	else {
		System.out.println("minsta talet är: " + tal2);
	}
	
		String hej = "programmet är färdigt";
		
		return hej;
	
		}
		
}
	


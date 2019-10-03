import java.util.Scanner;

public class TakeTwoStones {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int heltal1 = input.nextInt();
		

		for (int i = 1; heltal1 >= i; i++) {
			
		}
		if (heltal1 % 2 == 0) {
			System.out.println("Bob");
		}
		if (heltal1 % 2 == 1) {
			System.out.println("Alice");
			
		input.close();
		}
	}

}

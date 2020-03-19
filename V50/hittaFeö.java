import java.util.Scanner;

public class hittaFeö {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number;
		boolean success = false;
		
		System.out.println("Write an int: ");
		while ( !success ) {
			
		
		try {
			number = input.nextInt();
			System.out.println("this number is: " + number);
			
		} catch (Exception e) {
			input.next();
			System.out.println("YOU FUCKER MOTHER FUCKER FUCKER YOU FUCK");
		}
	}
		
		
		

	}

}

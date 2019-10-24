import java.util.Scanner;

public class uppgift2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int digit;
		int heltal;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Skriv in ett heltal: ");
		
		heltal = input.nextInt();
		
		while (heltal != 0) { // != är samma sak som fortsätt tills heltal är 0
			
			digit = heltal % 10;
			sum += digit;
			heltal /= 10 ; // samma sak som att skriva "heltal = heltal/10"
			
			System.out.println(sum);
			
		}
			
		
		
				
	}

}

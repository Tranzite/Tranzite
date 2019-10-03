import java.util.Scanner;

public class Oddities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int cases;
		int number = 0;

		number = input.nextInt();

		if (number % 2 == 0) {
			System.out.println(number + " is" + " even");

		} else if (number % 2 == 1) {
			System.out.println(number + " is" + " odd");
		}
		
		else {
			if(number % 2 == -1);
			
		}

	}

}

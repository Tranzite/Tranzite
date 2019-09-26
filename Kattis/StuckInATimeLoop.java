

import java.util.Scanner;

public class StuckInATimeLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		
		int heltal1 = 0;
		
		heltal1 = input.nextInt();
		
		for (int i = 1; heltal1 >= i; i++){
			System.out.println( i + " Abracadabra");
		}

		
		
		

	}

}

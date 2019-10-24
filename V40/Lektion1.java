
public class Lektion1 {

	public static void main(String[] args) {
		
		
		// % == modulus

		int tal1 = 47; 

		
		System.out.println(tal1 % 3); //testa ifall "tal1" är delbart med 3
									  // är den det så blir svaret 0, om inte
									  // om inte anges "rest".
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
		
			if (i % 3 == 0) {
				System.out.println("Talet " + i + " är delbart med 3");
				
				sum += i;
			}
			
		}
		System.out.println("the total sum of all intergers divisible by 3 is:" + sum);
		
		
		int turn = 0;
		
		while (true) {
			
			turn++;
			
			if(turn % 3 == 0) {
				System.out.println("Davids tur");
			}
			
			else if (turn % 3 ==1) {
				System.out.println("Johans tur");
			}
			else if (turn % 3 ==1) {
				System.out.println("Johans tur");
			}
			
			if (turn == 100) {
				break;
			}
		}
	}

}

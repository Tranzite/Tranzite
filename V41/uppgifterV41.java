import java.util.Scanner;

public class uppgifterV41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Uppgift 1");
		
		
		
		Scanner input = new Scanner(System.in);
		
		int i1 = input.nextInt();
		int j1 = input.nextInt();
		
		if ( i1 > j1 ) {
			System.out.println( i1 + "är störst");
		}
			else  {
				System.out.println( j1 + " är störst");
			}
		System.out.println("Uppgift 2");
		
		
		
		System.out.println("uppgift 3");
		
		System.out.println("uppgift 4");
		
		System.out.println("uppgift 5");

		int sum = 0;
		
		for(int i = 0; i <= 10000; i++) {
		
			if (i % 7 == 0) {
				System.out.println("Talet " + i + " är delbart med 7");
				
				sum += i;
			}
			
		

}
}
}

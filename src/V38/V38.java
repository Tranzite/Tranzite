package V38;

import java.util.Scanner;

public class V38 {

	public static void main(String[] args) {

		
		// vilkor
		
		boolean again = true;
		int svar = 1;
		int age = 0; //initiserat variabel
		
		Scanner input = new Scanner(System.in);
		
			if (again) {
				
			System.out.println("hur gammal är du?");
			age = input.nextInt();
			
			if (age >= 18) {
			
				System.out.println("Du får rösta på SD!!!!!!!!!!!!!!!!!!!!!!");
				}
			
			    else if (age >= 15 && age < 18) {
			    	System.out.println("du kan rösta på SD nästa val!!!");
			    }
				
			    else { // om vilkoret inte uppfils körs "else"
					System.out.println("Du får vänta lite med att rösta på SD15");
					
				}
				
				
				System.out.println("vill du fråga om åldern igen? Skriv (1) om ja, (2) om nej");
				
				
				if (svar != input.nextInt()) {
					again = false;
			}
			}

	}
}

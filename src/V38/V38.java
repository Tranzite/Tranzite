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
				
			System.out.println("hur gammal �r du?");
			age = input.nextInt();
			
			if (age >= 18) {
			
				System.out.println("Du f�r r�sta p� SD!!!!!!!!!!!!!!!!!!!!!!");
				}
			
			    else if (age >= 15 && age < 18) {
			    	System.out.println("du kan r�sta p� SD n�sta val!!!");
			    }
				
			    else { // om vilkoret inte uppfils k�rs "else"
					System.out.println("Du f�r v�nta lite med att r�sta p� SD15");
					
				}
				
				
				System.out.println("vill du fr�ga om �ldern igen? Skriv (1) om ja, (2) om nej");
				
				
				if (svar != input.nextInt()) {
					again = false;
			}
			}

	}
}

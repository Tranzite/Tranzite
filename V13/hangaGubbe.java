import java.util.Scanner;



public class hangaGubbe {

	public static String[] ordl�tt = { "simma".toUpperCase(), "�pple".toUpperCase(), "hej".toUpperCase(),
			"sol".toUpperCase(), "bil".toUpperCase() };


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(v�lkommen(input));
		System.out.println(meny(input));
		System.out.println(h�ngagubbel�tt(input));

	}

	public static int h�ngagubbel�tt(Scanner input) {
		boolean loop = true;
		int antalgissningar = 7; // deklarerar variabel
		int spelaigen = 0;
		int randomizer = (int) (Math.random() * ordl�tt.length);
		System.out.println("Ordet du har f�tt �r: " + ordl�tt[randomizer]);

		do {
			

			char ordet[] = ordl�tt[randomizer].toCharArray();
			char gissning[] = new char[antalgissningar];

			for (int i = 0; i < ordl�tt.length; i++) {
				gissning[i] = '*';
			}
			

			boolean ordhittat = false;
			while(!ordhittat && antalgissningar <= 0) {
				System.out.println("gissning: ");
				System.out.println(ordl�tt);
				System.out.println("Du har " + antalgissningar + " kvar" );
				antalgissningar--;
				char A = input.nextLine().charAt(0);
			
			
			if(A == '-') {
				ordhittat = true;
				loop = false;
			} else {
				for (int i = 0; i < ordl�tt.length; i++) {
					if(ordet[i] == A) {
						gissning[i] = A;
					}
				}
				if(�rordgissat(gissning)) {
					ordhittat = true;
					System.out.println("Du vann");
				}
			}
			}
			

			
			  if (antalgissningar <= 0) {
				System.out.println();
				System.out.println("Du fick slut p� f�rs�k");
				System.out.println();
				System.out.println("Vill du k�ra igen?");
				System.out.println();
				System.out.println("(1) - K�r igen!");
				System.out.println("(2) - Avsluta");

				spelaigen = input.nextInt();
				int tillbakameny = 0; // denna �r egentligen on�dig men det funkar s� jag har kvar den.

				switch (spelaigen) {

				case 1:
					tillbakameny = meny(input); // skickar tillbaka dig till menyn allts� starten av spelet.
					break;
				case 2:
					System.exit(0); // st�nger programmet
					break;

				default:

					break;
				}
			}
			antalgissningar--;
		} while (loop == true);

		return antalgissningar;
	}

	public static int v�lkommen(Scanner input) { // denna metoden skapar ett v�lkommen medelande och skickar dig till
													// n�sta segment
		System.out.println("V�lkommen! Klicka p� ett valfritt nummer f�r att g� vidare!!");
		int val = input.nextInt();
		System.out.println("Nu kommer du f� v�lja en sv�rhetsgrad!");

		return val;
	}

	public static int meny(Scanner input) { // Denna metoden ska funka som menyn och du ska kunna v�lja vilken
											// sv�rhetsgrad
		
	

		boolean loop = true;
		do {

			System.out.println("V�lj sv�rhetsgrad!");
			System.out.println("(1) - L�tt ord");
			System.out.println("(4) - Avsluta");

			System.out.println();

			int choice = input.nextInt();

			String sv�rhetsgrad;

			switch (choice) {
			case 1:
				sv�rhetsgrad = "L�tt";
				System.out.println("Du valde " + sv�rhetsgrad + " Skriv in din gissning!");
				h�ngagubbel�tt(input);

				// startar spelet med hj�lp av metoden.
				break;

			case 4:
				System.out.println("Hejd�!");
				System.exit(0); // st�nger ner spelet.

			default:
				System.out.println("Du kan bara v�lja mellan 1-3");
				loop = false; // breakar loopen d� loop = false

			}

		} while (loop == true);

		return 0;

	}

	public static boolean �rordgissat(char[] array){
		boolean m�l = true;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == '_') {
				m�l = false;
			}
				
		}
		return m�l;
	}
}

import java.util.Scanner;



public class hangaGubbe {

	public static String[] ordlätt = { "simma".toUpperCase(), "äpple".toUpperCase(), "hej".toUpperCase(),
			"sol".toUpperCase(), "bil".toUpperCase() };


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(välkommen(input));
		System.out.println(meny(input));
		System.out.println(hängagubbelätt(input));

	}

	public static int hängagubbelätt(Scanner input) {
		boolean loop = true;
		int antalgissningar = 7; // deklarerar variabel
		int spelaigen = 0;
		int randomizer = (int) (Math.random() * ordlätt.length);
		System.out.println("Ordet du har fått är: " + ordlätt[randomizer]);

		do {
			

			char ordet[] = ordlätt[randomizer].toCharArray();
			char gissning[] = new char[antalgissningar];

			for (int i = 0; i < ordlätt.length; i++) {
				gissning[i] = '*';
			}
			

			boolean ordhittat = false;
			while(!ordhittat && antalgissningar <= 0) {
				System.out.println("gissning: ");
				System.out.println(ordlätt);
				System.out.println("Du har " + antalgissningar + " kvar" );
				antalgissningar--;
				char A = input.nextLine().charAt(0);
			
			
			if(A == '-') {
				ordhittat = true;
				loop = false;
			} else {
				for (int i = 0; i < ordlätt.length; i++) {
					if(ordet[i] == A) {
						gissning[i] = A;
					}
				}
				if(ärordgissat(gissning)) {
					ordhittat = true;
					System.out.println("Du vann");
				}
			}
			}
			

			
			  if (antalgissningar <= 0) {
				System.out.println();
				System.out.println("Du fick slut på försök");
				System.out.println();
				System.out.println("Vill du köra igen?");
				System.out.println();
				System.out.println("(1) - Kör igen!");
				System.out.println("(2) - Avsluta");

				spelaigen = input.nextInt();
				int tillbakameny = 0; // denna är egentligen onödig men det funkar så jag har kvar den.

				switch (spelaigen) {

				case 1:
					tillbakameny = meny(input); // skickar tillbaka dig till menyn alltså starten av spelet.
					break;
				case 2:
					System.exit(0); // stänger programmet
					break;

				default:

					break;
				}
			}
			antalgissningar--;
		} while (loop == true);

		return antalgissningar;
	}

	public static int välkommen(Scanner input) { // denna metoden skapar ett välkommen medelande och skickar dig till
													// nästa segment
		System.out.println("Välkommen! Klicka på ett valfritt nummer för att gå vidare!!");
		int val = input.nextInt();
		System.out.println("Nu kommer du få välja en svårhetsgrad!");

		return val;
	}

	public static int meny(Scanner input) { // Denna metoden ska funka som menyn och du ska kunna välja vilken
											// svårhetsgrad
		
	

		boolean loop = true;
		do {

			System.out.println("Välj svårhetsgrad!");
			System.out.println("(1) - Lätt ord");
			System.out.println("(4) - Avsluta");

			System.out.println();

			int choice = input.nextInt();

			String svårhetsgrad;

			switch (choice) {
			case 1:
				svårhetsgrad = "Lätt";
				System.out.println("Du valde " + svårhetsgrad + " Skriv in din gissning!");
				hängagubbelätt(input);

				// startar spelet med hjälp av metoden.
				break;

			case 4:
				System.out.println("Hejdå!");
				System.exit(0); // stänger ner spelet.

			default:
				System.out.println("Du kan bara välja mellan 1-3");
				loop = false; // breakar loopen då loop = false

			}

		} while (loop == true);

		return 0;

	}

	public static boolean ärordgissat(char[] array){
		boolean mål = true;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == '_') {
				mål = false;
			}
				
		}
		return mål;
	}
}

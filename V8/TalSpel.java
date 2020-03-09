import java.util.Scanner;



public class TalSpel {

	public static void main(String[] args) {

		boolean loop;
		do {

			try { // tittar i coden och in deb ser att man har skrivit en bokstav så ska din skicka till catchen och då kommer syso skriva ut.

				Scanner input = new Scanner(System.in);

				System.out.println(välkommen(input));
				System.out.println(meny(input));
				System.out.println(randomizerlätt(input));
				System.out.println(randomizermedel(input));
				System.out.println(randomizersvår(input));

			} catch (Exception e) {
				System.out.println("Du kan bara välja ett nummer eller ett nummer mellan 1-4");
				
			}

			System.out.println();

			Scanner input = new Scanner(System.in);

			int choice = input.nextInt();

			switch (choice) { // switch beror av choice och när man skriver tex 1, så kommer man till case 1 etc

			case 1:

				System.out.println();

				break;

			case 2:

				loop = false;

			default:
				System.out.println("Du kan bara välja mellan 1-2");
				loop = false;

			}

		} while (loop = true);
	}

	public static int randomizerlätt(Scanner input) { // Skapar ett random nummer för respektive svårhetsgrad
		int randomizer = (int) (Math.random() * 100);

		return randomizer;
	}

	public static int randomizermedel(Scanner input) { // Skapar ett random nummer för respektive svårhetsgrad
		int randomizer = (int) (Math.random() * 250);

		return randomizer;
	}

	public static int randomizersvår(Scanner input) { // Skapar ett random nummer för respektive svårhetsgrad
		int randomizer = (int) (Math.random() * 500);

		return randomizer;
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
		try {

			boolean loop = true;
			do {

				System.out.println("Välj svårhetsgrad!");
				System.out.println("(1) - Lätt 1-100");
				System.out.println("(2) - Medel 1-250");
				System.out.println("(3) - Svårt 1-500");
				System.out.println("(4) - Avsluta");

				System.out.println();

				int choice = input.nextInt();

				String svårhetsgrad;

				switch (choice) {
				case 1:
					svårhetsgrad = "Lätt";
					System.out.println(
							"Du valde " + svårhetsgrad + " Skriv in din gissning!");

					System.out.println();
					Spellätt(input); // startar spelet med hjälp av metoden.
					break;

				case 2:
					svårhetsgrad = "Mellan";
					System.out.println(
							"Du valde " + svårhetsgrad + " Skriv in din gissning!");

					System.out.println();
					Spelmedel(input);
					break;

				case 3:
				
					svårhetsgrad = "Svårt";
					System.out.println(
							"Du valde " + svårhetsgrad + " Skriv in din gissning!");

					System.out.println();
					Spelsvår(input);
					break;

				case 4:
					System.out.println("Hejdå!");
					System.exit(0); // stänger ner spelet.

				default:
					System.out.println("Du kan bara välja mellan 1-3");
					loop = false; // breakar loopen då loop = false

				}

			} while (loop == true);

		} catch (Exception e) {
			System.out.println("du kan bara välja mellan 1-3.");
		}
	return 0;

	}

	public static void Spellätt(Scanner input) {
		boolean loop = true; // skapar en loop som ska vara true, därmed så länge loop = true så ska loopen loopas.

		int random = randomizerlätt(input);
		int antalgissningar = 0; // deklarerar variabel
		int spelaigen = 0;
		do {

			int gissning = input.nextInt();

			antalgissningar++; // ökar antalet gissningar med 1 varje gång det loopas därmed att man spelar igen.
			
			

			

			if (gissning == random) { // om man gissar rätt så ska detta skickas
				System.out.println("Du gissade på: " + gissning + " Du gissade rätt! ");
				System.out.println();
				System.out.println("Antal gissningar: " + antalgissningar);
				System.out.println();
				System.out.println("(1) - Spela igen");
				System.out.println("(2) - Avsluta");
				
				 spelaigen = input.nextInt();
				int tillbakameny = 0; // denna är egentligen onödig men det funkar så jag har kvar den.
				
				switch(spelaigen) {
				
				case 1:
					 tillbakameny = meny(input); // skickar tillbaka dig till menyn alltså starten av spelet.
					 break;
				case 2:
					System.exit(0); // stänger programmet
					break;
				
				
				default:
					
					break;
			}
				
			} else if (gissning > random) {
				System.out.println("Du gissade på talet:" + gissning + " Talet ska vara mindre! Gissa igen");
			} else {
				System.out.println("Du gissade på talet:" + gissning + " Talet ska vara större! Gissa igen");
			}
		} while (loop == true); // ser till så att loopen ska runnas, alltså om den fortfarande = true

	}

	public static void Spelmedel(Scanner input) {

		boolean loop = true;

		int random = randomizermedel(input);
		int antalgissningar = 0;
		int spelaigen = 0;
		do {

			int gissning = input.nextInt();

			antalgissningar++;
			
			

			

			if (gissning == random) {
				System.out.println("Du gissade på: " + gissning + " Du gissade rätt! ");
				System.out.println();
				System.out.println("Antal gissningar: " + antalgissningar);
				System.out.println();
				System.out.println("(1) - Spela igen");
				System.out.println("(2) - Avsluta");
				
				 spelaigen = input.nextInt();
				int tillbakameny = 0;
				
				switch(spelaigen) {
				
				case 1:
					 tillbakameny = meny(input);
					
				
				case 2:
					System.exit(0);
					break;
				
				
				default:
					break;
			}
				
			} else if (gissning > random) {
				System.out.println("Du gissade på talet:" + gissning + " Talet ska vara mindre! Gissa igen");
			} else {
				System.out.println("Du gissade på talet:" + gissning + " Talet ska vara större! Gissa igen");
			}
		} while (loop == true);
	}

	public static void Spelsvår(Scanner input) {

		boolean loop = true;

		int random = randomizersvår(input);
		int antalgissningar = 0;
		int spelaigen = 0;
		do {

			int gissning = input.nextInt();

			antalgissningar++;
			
	

			

			if (gissning == random) {
				System.out.println("Du gissade på: " + gissning + " Du gissade rätt! ");
				System.out.println();
				System.out.println("Antal gissningar: " + antalgissningar);
				System.out.println();
				System.out.println("(1) - Spela igen");
				System.out.println("(2) - Avsluta");
				
				 spelaigen = input.nextInt();
				int tillbakameny = 0;
				
				switch(spelaigen) {
				
				case 1:
					 tillbakameny = meny(input);
					
				
				case 2:
					System.exit(0);
					break;
				
				
				default:
					break;
			}
				
			} else if (gissning > random) {
				System.out.println("Du gissade på talet:" + gissning + " Talet ska vara mindre! Gissa igen");
			} else {
				System.out.println("Du gissade på talet:" + gissning + " Talet ska vara större! Gissa igen");
			}
		} while (loop == true);
	}
}

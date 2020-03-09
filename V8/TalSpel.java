import java.util.Scanner;



public class TalSpel {

	public static void main(String[] args) {

		boolean loop;
		do {

			try { // tittar i coden och in deb ser att man har skrivit en bokstav s� ska din skicka till catchen och d� kommer syso skriva ut.

				Scanner input = new Scanner(System.in);

				System.out.println(v�lkommen(input));
				System.out.println(meny(input));
				System.out.println(randomizerl�tt(input));
				System.out.println(randomizermedel(input));
				System.out.println(randomizersv�r(input));

			} catch (Exception e) {
				System.out.println("Du kan bara v�lja ett nummer eller ett nummer mellan 1-4");
				
			}

			System.out.println();

			Scanner input = new Scanner(System.in);

			int choice = input.nextInt();

			switch (choice) { // switch beror av choice och n�r man skriver tex 1, s� kommer man till case 1 etc

			case 1:

				System.out.println();

				break;

			case 2:

				loop = false;

			default:
				System.out.println("Du kan bara v�lja mellan 1-2");
				loop = false;

			}

		} while (loop = true);
	}

	public static int randomizerl�tt(Scanner input) { // Skapar ett random nummer f�r respektive sv�rhetsgrad
		int randomizer = (int) (Math.random() * 100);

		return randomizer;
	}

	public static int randomizermedel(Scanner input) { // Skapar ett random nummer f�r respektive sv�rhetsgrad
		int randomizer = (int) (Math.random() * 250);

		return randomizer;
	}

	public static int randomizersv�r(Scanner input) { // Skapar ett random nummer f�r respektive sv�rhetsgrad
		int randomizer = (int) (Math.random() * 500);

		return randomizer;
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
		try {

			boolean loop = true;
			do {

				System.out.println("V�lj sv�rhetsgrad!");
				System.out.println("(1) - L�tt 1-100");
				System.out.println("(2) - Medel 1-250");
				System.out.println("(3) - Sv�rt 1-500");
				System.out.println("(4) - Avsluta");

				System.out.println();

				int choice = input.nextInt();

				String sv�rhetsgrad;

				switch (choice) {
				case 1:
					sv�rhetsgrad = "L�tt";
					System.out.println(
							"Du valde " + sv�rhetsgrad + " Skriv in din gissning!");

					System.out.println();
					Spell�tt(input); // startar spelet med hj�lp av metoden.
					break;

				case 2:
					sv�rhetsgrad = "Mellan";
					System.out.println(
							"Du valde " + sv�rhetsgrad + " Skriv in din gissning!");

					System.out.println();
					Spelmedel(input);
					break;

				case 3:
				
					sv�rhetsgrad = "Sv�rt";
					System.out.println(
							"Du valde " + sv�rhetsgrad + " Skriv in din gissning!");

					System.out.println();
					Spelsv�r(input);
					break;

				case 4:
					System.out.println("Hejd�!");
					System.exit(0); // st�nger ner spelet.

				default:
					System.out.println("Du kan bara v�lja mellan 1-3");
					loop = false; // breakar loopen d� loop = false

				}

			} while (loop == true);

		} catch (Exception e) {
			System.out.println("du kan bara v�lja mellan 1-3.");
		}
	return 0;

	}

	public static void Spell�tt(Scanner input) {
		boolean loop = true; // skapar en loop som ska vara true, d�rmed s� l�nge loop = true s� ska loopen loopas.

		int random = randomizerl�tt(input);
		int antalgissningar = 0; // deklarerar variabel
		int spelaigen = 0;
		do {

			int gissning = input.nextInt();

			antalgissningar++; // �kar antalet gissningar med 1 varje g�ng det loopas d�rmed att man spelar igen.
			
			

			

			if (gissning == random) { // om man gissar r�tt s� ska detta skickas
				System.out.println("Du gissade p�: " + gissning + " Du gissade r�tt! ");
				System.out.println();
				System.out.println("Antal gissningar: " + antalgissningar);
				System.out.println();
				System.out.println("(1) - Spela igen");
				System.out.println("(2) - Avsluta");
				
				 spelaigen = input.nextInt();
				int tillbakameny = 0; // denna �r egentligen on�dig men det funkar s� jag har kvar den.
				
				switch(spelaigen) {
				
				case 1:
					 tillbakameny = meny(input); // skickar tillbaka dig till menyn allts� starten av spelet.
					 break;
				case 2:
					System.exit(0); // st�nger programmet
					break;
				
				
				default:
					
					break;
			}
				
			} else if (gissning > random) {
				System.out.println("Du gissade p� talet:" + gissning + " Talet ska vara mindre! Gissa igen");
			} else {
				System.out.println("Du gissade p� talet:" + gissning + " Talet ska vara st�rre! Gissa igen");
			}
		} while (loop == true); // ser till s� att loopen ska runnas, allts� om den fortfarande = true

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
				System.out.println("Du gissade p�: " + gissning + " Du gissade r�tt! ");
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
				System.out.println("Du gissade p� talet:" + gissning + " Talet ska vara mindre! Gissa igen");
			} else {
				System.out.println("Du gissade p� talet:" + gissning + " Talet ska vara st�rre! Gissa igen");
			}
		} while (loop == true);
	}

	public static void Spelsv�r(Scanner input) {

		boolean loop = true;

		int random = randomizersv�r(input);
		int antalgissningar = 0;
		int spelaigen = 0;
		do {

			int gissning = input.nextInt();

			antalgissningar++;
			
	

			

			if (gissning == random) {
				System.out.println("Du gissade p�: " + gissning + " Du gissade r�tt! ");
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
				System.out.println("Du gissade p� talet:" + gissning + " Talet ska vara mindre! Gissa igen");
			} else {
				System.out.println("Du gissade p� talet:" + gissning + " Talet ska vara st�rre! Gissa igen");
			}
		} while (loop == true);
	}
}

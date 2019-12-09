
public class läxa {

	public static void main(String[] args) {

		// 100 tal i intervallet [0-9]
		int[] numbers = { 1, 1, 1, 2, 6, 7, 8, 4, 3, 7, 8, 9, 3, 1, 3, 7, 8, 5, 3, 4, 8, 9, 6, 4, 2, 4, 7, 9, 7, 4, 3,
				2, 3, 6, 7, 8, 7, 7, 5, 7, 9, 6, 1, 4, 0, 8, 6, 5, 6, 8, 9, 0, 7, 5, 4, 3, 2, 4, 5, 9, 8, 5, 9, 8, 8, 4,
				5, 6, 7, 8, 9, 0, 9, 0, 9, 7, 5, 2, 1, 2, 3, 4, 5, 4, 4, 5, 3, 4, 5, 0, 8, 7, 0, 7, 9, 7, 0, 6, 5, 4 };

		// 100 namn
		String[] names = { "Crystal", "Tam", "Ed", "Beulah", "Daina", "Benjamin", "Kia", "Clelia", "Cassy", "Gita",
				"Celsa", "Karoline", "Talitha", "Lewis", "Betsy", "Colin", "Glendora", "Carola", "Rosalba", "Jeanie",
				"Yevette", "Armand", "Neal", "Lilla", "Dorethea", "Delta", "Maye", "Nikita", "Shoshana", "Carola",
				"Margie", "Haywood", "Venessa", "Natacha", "Gilbert", "Kandi", "Tyisha", "Tammie", "Blossom", "Penney",
				"Diana", "Audrey", "Willard", "Zoraida", "Drusilla", "Jacquline", "Cyndy", "Janiece", "Tressie", "Kami",
				"Lashanda", "Leann", "Tom", "Santana", "Junita", "Gisela", "Tom", "Marquerite", "Bryant", "Lauralee",
				"Yael", "Kelle", "Samantha", "Tom", "Meta", "Lanette", "Wanetta", "Carola", "Jana", "Neal", "Brady",
				"Rigoberto", "Felicia", "Hellen", "Georgeann", "Carola", "Isaias", "Ellis", "Roseanne", "Lenard", "Ela",
				"Ophelia", "Alesha", "Mafalda", "Flor", "Kelsi", "Autumn", "Sondra", "Pasty", "Jacquelyne", "Benjamin",
				"Emmie", "Mickie", "Lang", "Jamee", "Felice", "Daniella", "Carola", "Nathalie", "Genevive" };

		System.out.println(seven(numbers));
		System.out.println(tom(names));
		System.out.println(mostNumbers(numbers));
		System.out.println(index(names));
		System.out.println(jamna(numbers));
		System.out.println(allatal(numbers)); 
		System.out.println(namnpål(names));
		System.out.println(fembokstav(names));
	}
	// hur många 7:or finns det i numbers

	public static int seven(int[] numbers) {
		int seven = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == 7) {
				seven++;
			}
		}
		return seven;
	}

	public static int tom(String[] names) {
		int howmanytoms = 0;

		for (int i = 0; i < names.length; i++) {

			if (names[i].equals("Tom")) {
				howmanytoms++;
			}
			
		}
			return howmanytoms;
	}

	private static int mostNumbers(int[] numbers) {
		int most = 0;
		int amount = 0;
		int max = 0;

		for (int i = 0; i < 10; i++) {
			amount = 0;
			for (int j = 1; j < numbers.length; j++) {
				if (numbers[j] == i) {
					amount++;

				}

			}
			
			if (amount > max) {
				max = amount;
				most = i;
			}

		}
		return most;
	}
	
	private static int index(String[] names) {
		// På vilket index finns namnet Drusilla i names?
		int namn = 0;
		
		for (int i = 0; i < names.length; i++) {
				if (names[i].equals("Drusilla")) {
					 namn = i;
				}
			
		}
	
		return namn;
	}
	
	private static int jamna(int[] numbers) {
		// Vad är summan av alla jämna tal i numbers?
		int jämna = 0 ;
		
		for (int i = 0; i < numbers.length; i++) {
				if (numbers[i]%2 == 0) {
					jämna += numbers[i];
					
					
				}
			
		}
		

		return jämna;
	}
	//Hur många finns det av varje tal i numbers?
	private static int[] allatal(int[] numbers) {
		int[] most = new int[10];
		int amount = 0;
		int max = 0;

		for (int i = 0; i < 10; i++) {
			amount = 0;
			for (int j = 1; j < numbers.length; j++) {
				if (numbers[j] == i) {
					amount++;

				}
				amount = most[i];
			}
		
		} 

		return most;
	}
	private static int namnpål(String[] names) { //Hur många namn börjar på bokstaven L i names?
		int namn = 0;
		
		for (int i = 0; i < names.length; i++) {
			if(names[i].contains("L")) {
				namn++; 
			}
			
		}
		return namn;
	}
	private static int fembokstav(String[] names ) { //Hur många namn är fem bokstäver långa i names?
		int namn = 0;
		
		for (int i = 0; i < names.length; i++) {
			if(names[i].length() == 5) {
				namn = i++;
			}
			
		}
		
		return namn;
	}

	
}

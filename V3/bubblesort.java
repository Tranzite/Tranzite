import java.util.Arrays;

import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(Arrays.toString(sortering(input)));
		System.out.println(randomizer(input));
	}

	public static void metod1(String[] args) {

		int[] numbers = new int[37];
		boolean swapped = false;
		int temp;

		for (int i = 0; i < numbers.length; i++) { // slumpar 37 heltal mellan 1-100
			numbers[i] = (int) (Math.random() * 100);
		}

		System.out.println(Arrays.toString(numbers));

		do {
			swapped = false; // nollst�ller swapped i b�rjan p� j�mf�reelsen
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) { // byter plats p� tv� intilliggande tal
					temp = numbers[i]; // sparar tillf�llet v�rdet p� v�nstra sidan
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					swapped = true;
				}
			}
		} while (swapped);
		// System.out.println(Arrays.toString(numbers));

	}

	public static int randomizer(Scanner input) {
		int randomizer = (int) (Math.random()*100);
		
		return randomizer;
	}

	public static int[] sortering(Scanner input) {
	
		int antall�der =  input.nextInt();
		int[] l�dor = new int[antall�der];
		
		for (int i = 0; i < l�dor.length; i++) {
			l�dor[i] = randomizer(input);
			
		}
		return l�dor;
	}
}

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
			swapped = false; // nollställer swapped i början på jämföreelsen
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) { // byter plats på två intilliggande tal
					temp = numbers[i]; // sparar tillfället värdet på vänstra sidan
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
	
		int antallåder =  input.nextInt();
		int[] lådor = new int[antallåder];
		
		for (int i = 0; i < lådor.length; i++) {
			lådor[i] = randomizer(input);
			
		}
		return lådor;
	}
}

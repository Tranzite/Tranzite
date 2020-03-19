import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {

		/*
		 * int[] nummer = { }; // int[] är en låda som är tom. = { } då har vi skapat en
		 * array som innehåller tex {1,1,-3}
		 */
		Scanner input = new Scanner(System.in);
		int[] siffror1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // skapar en array och fyller den med 10 tal
		
		int[] siffror2 = new int[10]; // skapar en array med 10 tomma lådor.
		
		for (int i = 0; i < siffror2.length; i++) { // loopar genom siffror1[] och skriver ut innehållet
				siffror2[1] = input.nextInt();

			System.out.print(siffror1[i]);

		}
		System.out.println();
		System.out.println(Arrays.toString(siffror1));
		
		for(int i : siffror1) {
			System.out.print(i);
		}
	}

}

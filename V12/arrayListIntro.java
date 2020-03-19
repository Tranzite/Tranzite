import java.util.ArrayList;
import java.util.Scanner;

public class arrayListIntro {

	public static void main(String[] args) {


		ArrayList<String> nameList = new ArrayList<String>(); // en tom lista som kan ta bort och till saker när man vill
																

		nameList.add("David"); // på index 0
		nameList.add("Tomas"); // på index 1
		nameList.add(1, "Edvin"); // Edvin hamnar på index 1 och Petter hamnar på index 2

		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
			

		}
		System.out.println();

		nameList.remove("Tomas"); // tar bort namnet, skriver du tex 2 så tar bort du bort index2

		for (int i = 0; i < nameList.size(); i++) {
			
			System.out.println(nameList.get(i));

		}
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < 100; i++) {
			numbers.add(i*i);
			
		}
		for (int i = 0; i < numbers.size(); i++) {
			
			System.out.println(numbers.get(i));
		}
		System.out.println(numbers);
		
		
	}

}

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class läxa {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		boolean loop = true;
		do {
		
		System.out.println("Welcome to the Obama menu!");
		System.out.println("(1) - Obama");
		System.out.println("(2) - Osama");
		System.out.println("(3) - Oboma");
		System.out.println("(4) - Owobama");
		System.out.println("(5) - Quitbama");
		System.out.println();
		
		int choice = input.nextInt();
		
		String genre;
		
		switch (choice) {
		
		
		case 1:
			genre = "Obama";
			System.out.println("You chose " + genre + "! Here are three good Obamas!");
			System.out.println();
			System.out.println("1. OBAMA");
			System.out.println("2. OBAMA");
			System.out.println("3. OBAMA");
			System.out.println("if you want to return to the menu click any key!");
			System.out.println();
			input.next();
			break;
		case 2:
			genre = "Osama";
			System.out.println("You chose " + genre + "! Here are three Osamas!");
			System.out.println();
			System.out.println("1. OSAMA");
			System.out.println("2. OSAMA");
			System.out.println("3. OSAMA");
			System.out.println("if you want to return to the menu click any key!");
			System.out.println();
			input.next();
			break;
		case 3:
			genre = "Oboma";
			System.out.println("You chose " + genre + "! Here are three good Obomas!");
			System.out.println();
			System.out.println("1. OBOMAS");
			System.out.println("2. OBOMAS");
			System.out.println("3. OBOMAS");
			System.out.println("if you want to return to the menu click any key!");
			System.out.println();
			input.next();
			break;
		case 4:
			genre = "Owobama";
			System.out.println("You chose " + genre + "! Here are three good Owobamas!");
			System.out.println();
			System.out.println("1. OWOBAMA");
			System.out.println("2. OWOBAMA");
			System.out.println("3. OWOBAMA");
			System.out.println("if you want to return to the menu click any key!");
			System.out.println();
			input.next();
			TimeUnit.SECONDS.sleep(5);
			break;
		case 5:
			System.out.println("Thank you for today and remember, to vote for obama :)");
			loop = false;
			break;
		case 6: loop = false;
		}
	} while (loop == true);
}
}

		


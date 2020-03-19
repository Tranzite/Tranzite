import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class övning {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(Arrays.asList("Billskog Gabriel", "Bratland Petter", "Dahlqvist Ida",
				"Erlandsson Malte", "Favoryt Kalle", "Gustafsson Emil", "Hasic Edvin", "Helenius Anton", "Jenslöv Max",
				"Jonsson Svante", "Kamo Vivian", "Khanzade Vakil Kandi Pedram", "Leisten David", "Lindqvist Lucas",
				"Lindström Linus", "Markström Stenhammar Zachris", "Nelin Jacob", "Niklasson Theodor",
				"Nilsson Fredrik", "Norberg Max", "Ohlsson Andreas", "Parsa Filip", "Richardsson Filippa",
				"Roman David", "Romland Linus", "Sandström Ludvig", "Simonsen Johan", "Simonsen Markus",
				"Tammpere Patrik", "Thilén Philip", "Utbult David", "Vins Andreas"));
		
		System.out.println("Lägg in följande namn i arrayListen \"namn\"");
		System.out.println(list);
		System.out.println();
		
		System.out.println("Byt plats på 5:e och 10:e namnet och skriv ut listan gjort");
		Collections.swap(list, 5, 10);
		
		ArrayList<String> otherList = new ArrayList<>(Arrays.asList("David Roman"));

		otherList.addAll(list);
		System.out.println(otherList);
		System.out.println();
		
		System.out.println("Ta bort alla namn som börjar på bokstaven L och skriv ut listan");
		for (int i = 0; i < list.size(); i++) {
			
			String line = "\"Billskog Gabriel\", \"Bratland Petter\", \"Dahlqvist Ida\",\r\n" + 
					"				\"Erlandsson Malte\", \"Favoryt Kalle\", \"Gustafsson Emil\", \"Hasic Edvin\", \"Helenius Anton\", \"Jenslöv Max\",\r\n" + 
					"				\"Jonsson Svante\", \"Kamo Vivian\", \"Khanzade Vakil Kandi Pedram\", \"Leisten David\", \"Lindqvist Lucas\",\r\n" + 
					"				\"Lindström Linus\", \"Markström Stenhammar Zachris\", \"Nelin Jacob\", \"Niklasson Theodor\",\r\n" + 
					"				\"Nilsson Fredrik\", \"Norberg Max\", \"Ohlsson Andreas\", \"Parsa Filip\", \"Richardsson Filippa\",\r\n" + 
					"				\"Roman David\", \"Romland Linus\", \"Sandström Ludvig\", \"Simonsen Johan\", \"Simonsen Markus\",\r\n" + 
					"				\"Tammpere Patrik\", \"Thilén Philip\", \"Utbult David\", \"Vins Andreas\"";
			String pure = line.replaceAll("!\\l{L}+", "");
			System.out.println(pure);
		
		}
		// Lägg in följande namn i arrayListen "namn" gjort

		// Byt plats på 5:e och 10:e namnet och skriv ut listan gjort

		// Lägg in en dublett av valfritt namn från listan på första platsen och skriv
		// ut listan

		// Ta bort alla namn som börjar på bokstaven L och skriv ut listan

		// Flytta ditt namn till första platsen och skriv ut listan

		// Sortera namnlistan omvänd från Ö till A
	}
}
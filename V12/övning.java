import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class �vning {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(Arrays.asList("Billskog Gabriel", "Bratland Petter", "Dahlqvist Ida",
				"Erlandsson Malte", "Favoryt Kalle", "Gustafsson Emil", "Hasic Edvin", "Helenius Anton", "Jensl�v Max",
				"Jonsson Svante", "Kamo Vivian", "Khanzade Vakil Kandi Pedram", "Leisten David", "Lindqvist Lucas",
				"Lindstr�m Linus", "Markstr�m Stenhammar Zachris", "Nelin Jacob", "Niklasson Theodor",
				"Nilsson Fredrik", "Norberg Max", "Ohlsson Andreas", "Parsa Filip", "Richardsson Filippa",
				"Roman David", "Romland Linus", "Sandstr�m Ludvig", "Simonsen Johan", "Simonsen Markus",
				"Tammpere Patrik", "Thil�n Philip", "Utbult David", "Vins Andreas"));
		
		System.out.println("L�gg in f�ljande namn i arrayListen \"namn\"");
		System.out.println(list);
		System.out.println();
		
		System.out.println("Byt plats p� 5:e och 10:e namnet och skriv ut listan gjort");
		Collections.swap(list, 5, 10);
		
		ArrayList<String> otherList = new ArrayList<>(Arrays.asList("David Roman"));

		otherList.addAll(list);
		System.out.println(otherList);
		System.out.println();
		
		System.out.println("Ta bort alla namn som b�rjar p� bokstaven L och skriv ut listan");
		for (int i = 0; i < list.size(); i++) {
			
			String line = "\"Billskog Gabriel\", \"Bratland Petter\", \"Dahlqvist Ida\",\r\n" + 
					"				\"Erlandsson Malte\", \"Favoryt Kalle\", \"Gustafsson Emil\", \"Hasic Edvin\", \"Helenius Anton\", \"Jensl�v Max\",\r\n" + 
					"				\"Jonsson Svante\", \"Kamo Vivian\", \"Khanzade Vakil Kandi Pedram\", \"Leisten David\", \"Lindqvist Lucas\",\r\n" + 
					"				\"Lindstr�m Linus\", \"Markstr�m Stenhammar Zachris\", \"Nelin Jacob\", \"Niklasson Theodor\",\r\n" + 
					"				\"Nilsson Fredrik\", \"Norberg Max\", \"Ohlsson Andreas\", \"Parsa Filip\", \"Richardsson Filippa\",\r\n" + 
					"				\"Roman David\", \"Romland Linus\", \"Sandstr�m Ludvig\", \"Simonsen Johan\", \"Simonsen Markus\",\r\n" + 
					"				\"Tammpere Patrik\", \"Thil�n Philip\", \"Utbult David\", \"Vins Andreas\"";
			String pure = line.replaceAll("!\\l{L}+", "");
			System.out.println(pure);
		
		}
		// L�gg in f�ljande namn i arrayListen "namn" gjort

		// Byt plats p� 5:e och 10:e namnet och skriv ut listan gjort

		// L�gg in en dublett av valfritt namn fr�n listan p� f�rsta platsen och skriv
		// ut listan

		// Ta bort alla namn som b�rjar p� bokstaven L och skriv ut listan

		// Flytta ditt namn till f�rsta platsen och skriv ut listan

		// Sortera namnlistan omv�nd fr�n � till A
	}
}
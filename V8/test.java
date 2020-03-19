import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(randomizer(input));

	}
	public static int randomizer(Scanner input) {
		int randomizer = (int) (Math.random()*100);
		
		return randomizer;
	}

}

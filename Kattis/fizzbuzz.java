import java.util.Scanner;

public class fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		int y = input.nextInt();
		int n = input.nextInt();

		

		for (int i = 1; n >= i; i++) {
			
		
			if (i % y == 0 && i % x == 0) {
				System.out.println("FizzBuzz");
			}
			
			
			else if (i % x == 0) {
				System.out.println("Fizz");
			}
			
			else if (i % y == 0) {
				
			System.out.println("Buzz" );
			}
			
			else  {
			System.out.println( i );
			}
			
		
			
		}
		}

	}



package V38;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int tal1;
		int tal2;
		int tal3;
		int tal4;
		int tal5;
		
		int highest = 0;
		int lowest = 0;
		int sum = 0;
		
		System.out.println("skriv in 5 heltal");
		
		tal1 =input.nextInt();
		tal2 =input.nextInt();
		tal3 =input.nextInt();
		tal4 =input.nextInt();
		tal5 =input.nextInt();
		
		
		if (tal1 > tal2 && tal1 > tal3 && tal1 > tal4 && tal1 > tal5 ) {
			
			System.out.println("Highest numer is:" + tal1);
		}
			
		if (tal2 > tal1 && tal2 > tal3 && tal2 > tal4 && tal2 > tal5 ) {
				
			System.out.println("Highest numer is:" + tal2);
		}
			
		if (tal3 > tal2 && tal3 > tal1 && tal3 > tal4 && tal3 > tal5 ) {
				
			System.out.println("Highest numer is:" + tal3);
				
		}
		
		if (tal4 > tal2 && tal4 > tal1 && tal4 > tal3 && tal4 > tal5 ) {
			
			System.out.println("Highest numer is:" + tal4);
				
		}
		
		if (tal5 > tal2 && tal5 > tal1 && tal5 > tal4 && tal5 > tal3 ) {
			
			System.out.println("Highest numer is:" + tal5);
				
		}
		
		int tal2 = input.nextInt();
		
		if (tal2 > highest)
		{
			highest = tal2;
		}
		else if(tal2 < lowest)
		{
			lowest = tal2;
		}
		
		
		
	}


}
package phase1Project;

import java.util.Scanner;

public class arithmeticassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("-------Calculator--------");
		System.out.println("Enter any two numbers");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		while(true) {
			System.out.println("-------Operations-------");
			System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
			System.out.println("Enter your choice");
			int ch = s.nextInt();
			switch(ch) {
			case 1:
				int add = num1 + num2;
				System.out.println("The result is: " + add);
				break;
				
			case 2:
				int sub = num1 - num2;
				System.out.println("The result is: " + sub);
				break;
				
			case 3:
				int mul = num1 * num2;
				System.out.println("The result is: " + mul);
				break;
			
			case 4:
				
				try {
					float div = (float)num1 / num2;
					System.out.println("The result is: " + div);
					
				} catch (ArithmeticException e) {
					System.out.println(e.getMessage());
				
				}
				
				break;
				
			case 5:
				System.out.println("Exiting the menu");
				System.exit(0);
			default:
				System.out.println("Enter a correct choice");
			}
		}

	}

}

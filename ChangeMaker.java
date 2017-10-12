import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter the amount of change you have (in cents): ");
	int amount = sc.nextInt();
	
	int dollars = amount / 100;
	amount = amount % 100;
	
	int quarters = amount / 25;
	amount = amount % 25;
	
	int dimes = amount / 10;
	amount = amount % 10;
	
	int nickels = amount / 5;
	amount = amount % 5;
	
	System.out.println("Here is the breakdown of change:"
			+ "\nDollars  - " + dollars
			+ "\nQuarters - " + quarters
			+ "\nDimes    - " + dimes
			+ "\nNickels  - " + nickels
			+ "\nPennies  - " + amount);		
	
	sc.close();
	}

}

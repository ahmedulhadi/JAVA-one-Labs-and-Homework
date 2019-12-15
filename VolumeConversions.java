import java.util.Scanner;

import java.util.Scanner;

public class VolumeConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter an amount in cups:");
		Scanner sc = new Scanner(System.in);
		double amountInCups = sc.nextDouble();
		
		System.out.print("Enter a unit to convert to (oz/pint/tbsp/ml):");
		String unit = sc.next();
		
		if (unit.contentEquals("oz")) {
			System.out.println(8*amountInCups +" ozs");
			System.out.println();
		}
		else if (unit.contentEquals("pint")) {
			System.out.println(0.5*amountInCups +" pints");
			System.out.println();
		}
		else if (unit.contentEquals("tbsp")) {
			System.out.println(16*amountInCups +" tbsps");
			System.out.println();
		
	}
		else if (unit.contentEquals("ml")) {
			System.out.println(236.588*amountInCups +" mls");
		}
}
}
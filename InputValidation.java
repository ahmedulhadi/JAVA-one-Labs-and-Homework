import java.util.Scanner;

public class InputValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Day? ");
		Scanner sc =new Scanner(System.in);
		int day = sc.nextInt();
		
		System.out.print("Month? ");
		int month = sc.nextInt();
		
		System.out.print("Year? ");
		int year = sc.nextInt();
	
		if(month==2 && day>28) {
			System.out.println("Invalid day.");
		}
		
		
		if((month==4|| month==6||month==9||month==11) && day>30) {
			System.out.println("Invalid day.");
		}
		if((month==1||month==3||month==5 ||month==7|| month==8||month==10||month==12) && day>31) {
			System.out.println("Invalid day.");
		}
		if(year<1900 || year>2019) {
			System.out.println("Invalid year.");
		}
		if(day<1 || day>31) {
			System.out.println("Invalid day.");
		}	
		if(month<1 || month>12) {
			System.out.println("Invalid month.");
		}	
		
	}}
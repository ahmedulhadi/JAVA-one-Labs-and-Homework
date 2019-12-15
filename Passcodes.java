import java.util.Scanner;

public class Passcodes {
    public static void main (String [] args) {
        System.out.print("Choose a passcode: ");
            	Scanner sc=new Scanner(System.in);
            	    	String passcode=sc.nextLine();
        	if(passcode.length()>=4 && passcode.length()<=9){
    	    if(passcode.length()>=8 && passcode.length()<=9) {
    			System.out.println("Passcode is secure.");	
    		}
    		else{
    			System.out.println("Passcode is not secure.");
    		}
    	}
    	else
    	{
    		System.out.println("Invalid passcode.");
    	
        
     
    	}     
    }
}
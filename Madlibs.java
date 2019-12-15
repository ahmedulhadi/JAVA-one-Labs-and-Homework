import java.util.Scanner;
public class Madlibs {
    public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);
        //Enter a noun: cat
        //Enter another noun: penguin
        //Enter an adjective: reasonable
        //Enter a verb: build
        //The cat jumped over a reasonable penguin. Then the penguin decided to stop being so reasonable and take up a hobby: building.
        System.out.print("Enter a noun: cat ");
        String noun1= sc.nextLine();
        
        System.out.print("Enter another noun: penguin ");
        String noun2= sc.nextLine();
        
        System.out.print("Enter an adjective: reasonable ");
        String adjective1= sc.nextLine();
        
        System.out.print("Enter a verb: build ");
        String verb1= sc.nextLine();
        //The (noun1) jumped over a (adjective1) (noun2). Then the (noun2) decided to stop being so (adjective1) and take up a hobby: (verb1-ing).
        System.out.println("The " + noun1 + " jumped over a " + adjective1 +" "+ noun2 + "." + " Then the " + noun2 + " decided to stop being so " + adjective1 + " and take up a hobby: " + verb1+ "ing" +".");
    }
}
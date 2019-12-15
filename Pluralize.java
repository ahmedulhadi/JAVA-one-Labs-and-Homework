import java.util.Scanner;
public class Pluralize {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        
        System.out.print("Enter word: ");
        String word = sc.next();
        
        if (number==1) {
            System.out.println(number +" "+ word);
        }
        
        else {
            System.out.println(number +" "+ word +"s");
        }
    }
}
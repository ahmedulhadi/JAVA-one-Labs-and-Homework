import java.util.Scanner;

public class PluralizeExtended {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter word: ");
        String word = sc.next();
        
        int length = word.length();     // found the length of the word

        if (number == 1) {  
            System.out.print(number+ " " + word);
        } 
        else if (word.substring(length - 3).equalsIgnoreCase("ife")){ 
                word = word.substring(0, length-2) + "ves";
                System.out.println(number+word);
                
            } else if (word.substring(length - 2).equalsIgnoreCase("sh")
                    || word.substring(length -2).equalsIgnoreCase("ch")) {
                word +="es";
                System.out.println(number+word);
                
            } else if (word.substring(length - 2).equalsIgnoreCase("us") ){
                word = word.substring(0, length - 2) + "i";
                System.out.println(number+word);
                
            } else if (word.substring(length-1).equalsIgnoreCase("y") ) {
                word = word.substring(0, length - 1) + "ies";
                System.out.println(number+word);
                
            } else {
                System.out.println(number + " " + word + "s");
            }
        }
   }

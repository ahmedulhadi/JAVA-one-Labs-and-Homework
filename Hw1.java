public class Recursion {
    public static void main(String[] args) {
        countChars("Ahmedulhadi Yusha Evans Sharif", 'a');
    }
    public static int countChars(String s, char c) {
        if (s.charAt(0) == 0) {
            return 0;
        }
        else if(s.charAt(0)== c) {
            return 1+ countChars(s.substring(1, s.length()));
        }
        else 0 + countChars(s.substring(1, s.length()));
    } 
}
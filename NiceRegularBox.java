public class NiceRegularBox {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] lines = {
            "fbn",
            "abbgfddd",
            "hcghdgdh",
            "abcd"
        };
        lengthOfLongestLine(lines); 
        repeatCharacter('*', 5);
    }

    public static int lengthOfLongestLine(String[] lines) {
        String longestString = lines[0];
        for (int i = 0; i < lines.length - 1; i++) {
            if (longestString.length() > lines[i + 1].length()) {
                longestString = longestString;
                System.out.println(longestString);
            } else {
                longestString = lines[i + 1];
                System.out.println(longestString);
            }
        }
        return longestString.length();
    }

    public static String repeatCharacter(char c, int no) {
        String result = "";
        for (int i = 0; i < no; i++) {
            result = result + c;
        }
        return result;
    }
}
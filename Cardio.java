public class Cardio {
    public static void main(String[] args) {
        String longestWord = longestWord("Ahmedulhadi","Sharif","Ibrahim");
        System.out.println(longestWord);
        boolean isTriangle = isTriangle(1,10,12);
        System.out.println(isTriangle);
        String american = american("Saturday", 22, "July", 2015);
        System.out.println(american);
        String european = european("Saturday",22,"July",2015);
        System.out.println(european);
        boolean isSpecialNumber = isSpecialNumber(14);
        System.out.println(isSpecialNumber);
        boolean isPositiveSpecialNumber = isPositiveSpecialNumber(35);
        System.out.println(isPositiveSpecialNumber);
    }
    
    public static String longestWord(String s1,String s2, String s3) {
        if (s1.length() > s2.length() && s1.length() > s3.length()) {
            return s1;  
        } else if (s2.length() > s1.length() && s2.length() > s3.length()) {
            return s2;
        } else {
            return s3;
        }
    }
    
    public static boolean isTriangle(double s1,double s2, double s3) {
        if (s1 + s1 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
            return true;
        } else {
            return false;
        }
    }
    
    public static String american(String day, int date, String month, int year) {
        String american = day + "," + " " + month + " " + date + "," + " " + year;
        return american;
    }

    public static String european(String day,int date,String month,int year) {
        String european = day + "," + " " + date + " " + month + "," + " " + year;
        return european;
    }
    
    public static boolean isSpecialNumber(int n) {
        if (n % 7 == 0 && n % 5 != 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean isPositiveSpecialNumber(int n1) {
        if (n1 % 7 == 0 && n1 % 5 != 0 && n1 > 0) {
            return true;
        } else {
            return false;
        }
    }
}
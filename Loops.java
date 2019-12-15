public class Loops {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(sumToN(4));
        System.out.println(reverseString("World!"));
        System.out.println(snakeCase("nowIsTheWinter"));
    }

    public static int sumToN(int num) {
        int result = 0;

        for (int i = 1; i <= num; i++) {
            result = result + i;
        }

        return result;
    }

    public static String reverseString(String s) {
        String result = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);

        }

        return result;
    }

    public static String snakeCase(String s) {

        char[] value = new char[1000];
        String result = "";
        for (int i = 0; i < s.length(); i++) {

            if (Character.isUpperCase(s.charAt(i))) {
                value[i] = Character.toLowerCase(s.charAt(i));
                value[i - 1] = '_';
                result = result + value[i - 1] + value[i];
            } else {
                value[i] = s.charAt(i);
                result = result + value[i];

            }
        }

        return result;
    }

}
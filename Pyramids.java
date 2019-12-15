public class Pyramids {

    public static void main(String[] args) {
        String pyramidresult = pyramid(5);
        System.out.println(pyramidresult);
        String sidepyramidresult = sidePyramid(8);
        System.out.println(sidepyramidresult);
    }

    public static String pyramid(int rows) {
        String result = "";
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                result = result + "*";
            }
            result = result + "\n";
        }
        return result;

    }

    public static String sidePyramid(int rows) {
        String result = "";
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                result = result + "*";
            }
            result = result + "\n";
        }
        for (int i = rows - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                result = result + "*";
            }
            result = result + "\n";

        }
        return result;
    }

}
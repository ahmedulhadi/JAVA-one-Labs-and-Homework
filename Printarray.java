public class PrintArray {
    public static void main(String[] args) {
        String[] heroes = { "Superman", "Batman", "Flash", "Ahmedulhadi" };
        System.out.println(heroes);
        
        int i = 0;
        while (i <= 4) { //while this condition is true keep doing this
        //while (i <=heroes.length -1) // more simple .
            System.out.println(i + " " + heroes[i]);
            i = i + 1;
        }
    }
}
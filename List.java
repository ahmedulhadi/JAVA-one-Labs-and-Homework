import java.util.ArrayList; 
// import from util like scanner

public class List {
    public static void main(String[] args) {
        double[] dubs = {7.2, 13.33, 3.14159, 0.6 };
        
        ArrayList<Double> dublist = new ArrayList<Double>();
        // same as Scanner class
        dublist.add(7.2); // add using dot add
        dublist.add(13.33);
        dublist.add(3.14159);
        
        System.out.println(dublist.get(2)); //get using get dot
        System.out.println(dublist.size()); // get the size (number of element)
        
        doublist.add(42.2); // add new to the list
        System.out.println(dublist.get());
        
        doublist.set(0, 2.2); // replace the entry for "0" with "Depressed Avenger"
        System.out.println(dublist.get());
        
        dublist.remove(1); // remove from the list
        System.out.println(dublist.get(0));
        
        /*Write a program, ArrayListPractice.java.
Write your main program to create a String ArrayList named heroes. Initialize it to "Hulk", "Thor", and "Black Widow" by calling add on the items one by one.
Print out the three items by calling get and then printing the result with System.out.println.
Now using the set() function, replace the entry for "Thor" with "Depressed Avenger"
Remove the "Hulk" entry from the ArrayList using remove() 
Print the size of the ArrayList using the size() function
Compile and run your program
Convince yourself that you know the answer to these questions:
How do you create an ArrayList of a particular type?
How do you add to an ArrayList?
How do you index into an ArrayList?
How do you remove items from an ArrayList?
How do you replace entries in an ArrayList?
How do you get the number of elements in an ArrayList?
 */
        
        
    }
}
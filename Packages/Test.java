// print today's date
import java.util.Scanner; // explicit import
// FQN

public class Test{ //main class
	
	public static void main(String[] args) {

		java.util.Date d = new java.util.Date(); // FQN

        System.out.println("Today's current timestamp: "+ d); // d.toString()

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your good Name");
        String name = in.next();

        System.out.println("Hello Mr/Ms."+ name);

	}

}
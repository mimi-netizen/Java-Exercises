import java.util.*;
public class ExceptionDemo{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two nos:");
		int a = 0, b = 0;
		try{
		a = in.nextInt(); // int - java.util.InputMismatchException
		b = in.nextInt(); // int -  

		int res = a/b; // throw new java.lang.ArithmeticException();
		System.out.println("Result = "+res);
        }
        catch(Exception e){
        System.err.println(e);// 
        }

        int sum = a+b;
		System.out.println("Sum = "+sum);
       
		int prod = a*b;
		System.out.println("Prodcuct = "+prod);

		System.out.println("Rest of the code....follows!");
	}
}
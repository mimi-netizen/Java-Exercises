// if else - finding even or odd
public class Main{

	public static void main(String[] args) {
		
    int a = 1 + (int) (Math.random()*100);  // 1 - 100
    System.out.println(a);

    if(a%2 == 0)
    	System.out.println(a+" is even");
    else
    	System.out.println(a+" is odd");
		
	}
}

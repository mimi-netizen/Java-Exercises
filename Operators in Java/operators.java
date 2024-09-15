public class operators{
	public static void main(String[] args) { // main

		int x = Integer.parseInt(args[0]); // "123" -> 123
		int y = Integer.parseInt(args[1]); //  "10" -> 10

        System.out.println(x>y); // true
        System.out.println(x==y); // false

		//int res = x/y; // 0 - crashes - no rest of the code will execute
		//System.out.println(res); // divide / zero = infinity -> NO - java.lang.AE

		int p = x*y;
		System.out.println(p); //0

		int r = x%y; // / by zero -- crashes
		System.out.println(r); // java.lang.AE
    
	}
}

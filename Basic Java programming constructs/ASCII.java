// Program to print all printable characters - UNICODE/ASCII
public class ASCII{

	public static void main(String[] args) {
		
		for(int i=33; i<127; i++){
			System.out.print(i+"->"+" "+(char)i+" "); //eliminating non-printable (34)
		}

		System.out.println();
	}
	
}
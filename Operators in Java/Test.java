public class Test{
	
	public static void main(String[] args) throws Exception{
     
     int a = 1 + (int) (Math.random()* 100); // 1 - 100
     int b = 1 + (int) (Math.random()* 100);
     int c = 1 + (int) (Math.random()* 100);

     System.out.println(a+"  "+b+"  "+c);

     int biggest = (a>b && a>c) ? a : (b>c ? b: c); // find biggest of three
     System.out.println(biggest);

	}
} 
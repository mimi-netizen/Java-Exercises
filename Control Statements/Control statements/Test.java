// simple if - biggest of 3 nos
public class Test{
	
	public static void main(String[] args){
     
     int a = 1 + (int) (Math.random()*100);  // 1 - 100
     int b = 1 + (int) (Math.random()*100);  // 1 - 100
     int c = 1 + (int) (Math.random()*100);  // 1 - 100
     System.out.println(a+" "+b+" "+c);
     if(a>b && a>c)
     	System.out.println(a+ " is big");
     
     if(b>a && b>c)
     	System.out.println(b+ " is big");

     if(c>a && c>b)
     	System.out.println(c+ " is big");

	}
} 

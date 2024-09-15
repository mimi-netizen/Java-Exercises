// to find whether a given number is divisible by 3 and 7
public class Divisible{
	
	public static void main(String[] args){
     
     int n = 1 + (int) (Math.random()*100);  // 1 - 100
     System.out.println("Number generated= "+ n);

     if(n%3==0 && n%7==0){  // &&
     	System.out.println(n+" is divisible by 3 and 7");
     }
     else
     	System.out.println(n+" is not divisible by 3 and 7");

	}
} 

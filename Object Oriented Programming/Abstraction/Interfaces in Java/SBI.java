public class SBI implements RBI{
	
	public void withdraw(){
		System.out.println("withdraw success!");
	 } 
     public void deposit(){
       System.out.println("deposit succes and you got interest @"+intRate);
     }

     public void transfer(){  
       System.out.println("transfer success!");
     }

     void disp(){
     	System.out.println("Im SBI");
     }
     public static void main(String[] args) {
     	
     	RBI r1 = new SBI(); // upcasting
     	r1.withdraw();
     	r1.deposit();
     	r1.transfer();
        
        SBI s1 = new SBI();
        s1.disp();

     }

}
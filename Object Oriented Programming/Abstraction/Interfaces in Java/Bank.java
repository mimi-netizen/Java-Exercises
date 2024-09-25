public class Bank extends ATM{
     int cashback; // child specific - intRate from parent

     public Bank(double intRate, int cashback){
     	super(intRate);
     	this.cashback = cashback;
     }
	 void withdraw(){
	 	System.out.println("withdraw success!");
	 	System.out.println("Congrats..You got cashback..."+cashback);
	 }
     void deposit(){
     	System.out.println("Deposit success!");
     	System.out.println("Congrats..you got interest @"+intRate);
     }
     @Override
     void disp(){
     	super.disp(); //
    	System.out.println("I'm Bank");
    }
    void fun(){
    	System.out.println("Its child specific method");
    }

    public static void main(String[] args) {
    	
    	ATM a1 = new Bank(8.5,30); // upcasting
    	a1.withdraw();
    	a1.deposit();
    	a1.disp();

    	Bank b1 = new Bank(8.5,30);
    	b1.fun(); // CE
    }

}

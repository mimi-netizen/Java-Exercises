abstract class ATM{  // 2/3 = 66%

	double intRate;

	public ATM(double intRate){
		this.intRate = intRate;
	}

	abstract void withdraw(); 

    abstract void deposit(); 
    
    // concrete method
    void disp(){
    	System.out.println("I'm ATM");
    }

}

public class TechEmp extends Emp{ // we must have to have a constructor if parent has cons
    // child specific members
    int bonus;
    
    public TechEmp(int eid, String ename, double basic, int bonus){
    super(eid,ename,basic); // invokes parent's cons - first statement
    this.bonus = bonus;
    }

    // re-define disp()
    @Override
    public void disp(){
    	// super
    	super.disp(); // parent's disp()
		System.out.println(bonus);
	}
    // re-defining  - overriding
    @Override // annotations
    public void calSalary(){  // method signature must be same
    	// local variables - as allowances
    	int da = 42;
    	int hra = 30;
    	int ta = 8;
    	double salary = getBasic() + getBasic()*(da+hra+ta)/100 + bonus;  // updated salary
    	System.out.println("Total Salary: "+salary);
    }
	public static void main(String[] args) {	
     
     TechEmp te = new TechEmp(1234,"QWERTY", 100000, 10000);
     te.disp();
     te.calSalary();

	}
	
}
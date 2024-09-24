public class TechEmp extends Emp{
    int bonus;
    public TechEmp(int eid, String ename, double basic, int bonus){
    super(eid,ename,basic); // invokes parent's cons - first statement
    this.bonus = bonus;
    }
    @Override
    public void disp(){
    	// super
    	super.disp(); // parent's disp()
		System.out.println(bonus);
	}
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
     
     Emp e1 = new TechEmp(123,"ASDF",100000, 10000); // upcasting
     e1.disp(); //  overriden  - RTP
     e1.calSalary(); // overriden - RTP
     System.out.println("********************************");
     Emp e = new Emp(321,"ABC", 100000); // not upcasting
     e.disp(); // static binding - parent's
     e.calSalary();// static binding - parent's
     System.out.println("***********************************");
     TechEmp te = new TechEmp(1234,"XYZ",100000,10000); // not upcasting
     te.disp(); // static polymorphism
     te.calSalary();// static polymorphism
     System.out.println("********************************"); 
     e = te; // upcasting 
     e.disp(); // RTP - child's 
     e.calSalary(); // RTP - child's 

	}
	
}
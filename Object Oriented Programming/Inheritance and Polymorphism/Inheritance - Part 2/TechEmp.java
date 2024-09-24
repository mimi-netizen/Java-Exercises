public class TechEmp extends Emp{
    // inherited members - non-private  - 
    // child specific members
    int bonus;
    public void setBonus(int bonus){
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
     TechEmp te = new TechEmp(); // eid, ename, basic -
     te.setEmp(321,"ASDF",100000);
     te.setBonus(10000);

     te.disp();
     te.calSalary(); // 

	}
	
}

interface XYZ{  // with Java 9 features
void absMethod(); // abstract 

default void msg(){
	System.out.println("Its a default method!");
	pvtMethod(); // called within the class/intreface
}

static void fun(){
	System.out.println("Its a static method");
	stPvtMethod(); // called with in the interface - XYZ
}

private void pvtMethod(){
	System.out.println("Its a private method");
}

private static void stPvtMethod(){
	System.out.println("Its a static private method");
}
}


public class ABC implements XYZ{  
   
    public void absMethod(){
		System.out.println("method of XYZ implemented in ABC");
    }

	public static void main(String[] args) {
		
		XYZ.fun(); // static method can be called with class/interface
		ABC abc = new ABC();
		abc.msg(); // default method - pvtMethod();
		abc.absMethod();
		
	}
}
	

public class Outer{ // default, public, final, abstract, strctfp
private int data = 99; // 

class Inner{
	void msg(){
		System.out.println("Data of outer class is: "+data);
	}
}

void disp(){
System.out.println("Im outer class method");

Inner in = new Inner(); // in - exist in out object
in.msg();

}

public static void main(String[] args) {	
	Outer out = new Outer(); // outer object
	// Inner object

	//Outer.Inner in = out. new Inner();
	//in.msg();

	out.disp();
}

}


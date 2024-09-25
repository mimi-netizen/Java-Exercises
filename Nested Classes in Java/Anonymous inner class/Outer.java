public class Outer{ 
private int data = 99; 

public void disp(){
	// local class
	class Local{
		void msg(){
			System.out.println("data from outer class: "+data);
		}
	} // class end 

	Local l = new Local();
	l.msg();
}

public static void main(String[] args) {	
	
	Outer out = new Outer();
    out.disp();	

}
}

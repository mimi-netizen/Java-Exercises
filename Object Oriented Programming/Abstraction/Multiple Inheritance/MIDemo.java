interface Printable {
	void print();
}

interface Showable {	
	void show();
}

public class MIDemo implements Printable, Showable{

public void print(){
System.out.println("Its printing......");
}

public void show(){
System.out.println("Its showing.....");
}

public static void main(String[] args) {

      MIDemo mi = new MIDemo();
      mi.print();
      mi.show();
}
}

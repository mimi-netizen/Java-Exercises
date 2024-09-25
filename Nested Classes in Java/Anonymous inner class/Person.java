public abstract class Person{
	
	abstract void eat(); //

	public void speak(){
		System.out.println("English");
	}

    public static void main(String[] args) {	
		
		Person p = new Person(){ // process instantiation + class definition  
         void eat(){
         	System.out.println("Eating fruits!");
         }
         @Override
         public void speak(){
         	System.out.println("Speaks Hindi");
         }
		};
		p.eat();
		p.speak();
	}

}

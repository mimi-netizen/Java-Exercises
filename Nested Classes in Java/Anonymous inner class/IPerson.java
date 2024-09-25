public interface IPerson{

	 void eat(); 
     void speak();

    public static void main(String[] args) {	
		
		IPerson p = new IPerson(){ // process instantiation + class definition  
        
         public void eat(){
         	System.out.println("Eating fruits!");
         }
        
         public void speak(){
         	System.out.println("Speaks Hindi");
         }

		};
		
		p.eat();
		p.speak();
	}

}

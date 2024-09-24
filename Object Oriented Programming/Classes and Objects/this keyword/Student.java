public class Student{   // fully encapsulated class
	// data members
    private int sid; 
    private String sname; 
    private double gpa; 
    private static String university = "Stanford";
    private String city;

    // constructor
	public Student(int sid, String sname, double gpa){  // local variables 
    	this.sid = sid; // 
    	this.sname = sname;
        this.gpa = gpa;
    }
    // 
    public Student(int sid, String sname, double gpa, String city){  // local variables 
    	
    	this(sid,sname,gpa); // first statement
    	this.city = city;
    }

    // getter / accessor for all
    public void getStudent(){
    	System.out.println(sid+"  "+sname+"  "+gpa+"  "+city+"  "+university);
    }
    
    public static void main(String[] args) {
    	 Student s1 = new Student(101, "XYZ", 9.1);  // old object - no city
    	 s1.getStudent(); //

         Student s2 = new Student(123,"ABC",9.2,"Pune"); // new object - city
         s2.getStudent(); // city
    }
    public void setStudent(int i, String string, double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setStudent'");
    }
    public void getSname() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSname'");
    }
}



public class Student{   // fully encapsulated class
	// data members
    private int sid; 
    private String sname; 
    private double gpa; 
    private static String university = "Stanford";
	// default cons
    public Student(){
    // no code --> primary responsibility: construct instance with their defaults
    	System.out.println("Its default cons");
    }

	// parameterized cons
	public Student(int id, String name, double avg){  // local variables 
    	sid = id;
    	sname = name;
        gpa = avg;
    }

    // getter / accessor for all
    public void getStudent(){
    	System.out.println(sid+"  "+sname+"  "+gpa+"  "+university);
    }
    
    public static void main(String[] args) {
    	 Student s1 = new Student(101, "XYZ", 9.1); // parameterized
    	 s1.getStudent(); 

    	 Student s2 = new Student(); // default cons
    	 s2.getStudent(); // 0 null 0.0 Stanford
    }
}


package singleton;

public class PersonStatic {
	
	private int notSoStatic; 
	
	private static String fname;
	private static String lname;
	
	public static String getFname() {
		return PersonStatic.fname;
	}
	public static void setFname(String fname) {
		PersonStatic.fname = fname;
	}
	public static String getLname() {
		return PersonStatic.lname;
	}
	public static void setLname(String lname) {
		PersonStatic.lname = lname;
	}
	
	
	public int getNotSoStatic() {
		return notSoStatic;
	}
	public void setNotSoStatic(int notSoStatic) {
		this.notSoStatic = notSoStatic;
	}
	
	
}

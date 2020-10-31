package singleton;

public class Person {
	
	//normal
//	private static Person instance = new Person("asdf", "Asdf");
	
	private static Person instance = null;
	
	private String fname;
	private String lname;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	private Person(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	
	// normal
	public static Person getInstance() {
		return instance;
	}
	
	// lazy initialization
	public static Person getLazyInstace() {
		if (instance == null ) {
			instance = new Person("asdf", "Asdf");
		}
		return instance;
	}
	
	
}

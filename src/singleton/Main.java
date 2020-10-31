package singleton;

public class Main {
	static Person p;
//	static PersonStatic p2;
//	PersonStatic p3;
	
	/// ... wuerde es Person instance 
	public static void main(String[] args) {
//		p = new Person("Sepp", "Huber");
//		System.out.println(p.getFname());
		
		Person pp1 = Person.getInstance(); /// da bei lazy
		
		Person pp10 = Person.getInstance();
	
		PersonStatic.setFname("sepp");
		PersonStatic p1 = new PersonStatic();
		PersonStatic p2 = new PersonStatic();
		
		p1.setNotSoStatic(4);
		p2.setNotSoStatic(5);
		p1.setFname("sepp");
		p2.setFname("Josef");
		
		System.out.println(p1 == p2);
		
		System.out.println(p1.getFname());
		System.out.println("====================");
		System.out.println(p1.getNotSoStatic());
		System.out.println(p2.getNotSoStatic());
	}

}

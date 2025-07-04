package Com.tnsif.dayfive.Demo;

public class HierachicalInheritanceDemo {
	
public static void main(String[] args) {
		
//		Person1 p = new Person1();
//		Student s = new Student();
//		Employee e = new Employee();
//		
//		System.out.println(p);
//		System.out.println(s);
//		System.out.println(e);
		
		Person1 p1 = new Person1();
		System.out.println("-------Person1 Details--------");
		System.out.println(p1);
		System.out.println("------------------------------");
		
		Person1 p;
		p = new Person1 ("Aniket", "Pune");
		System.out.println("Person1 Details: "+ p);
		
		p = new Student ("Datta", "Mumbai", "TE", 78.22f);
		System.out.println("Student Details "+p);
		
	    p = new Employee("Sahil", "Pune", "123", 116545, "Developer");
		System.out.println("Employee Details "+p);
	}


}

package Com.tnsif.dayfive.Demo;

public class Person1 {
	private String name;
	private String city;
	
//	Default Constructor
	public Person() {
		System.out.println("default value of Person class ");
		this.city = "Pune";
		this.name = "Rajesh";
		
		
	}
	
	

	public Person(String name, String city) {

	this.name = name;
	this.city = city;
}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}

}

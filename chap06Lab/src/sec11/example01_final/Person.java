package sec11.example01_final;

public class Person {
	final String nation = "Korean";
	final String ssn; //(���� null�� ������)
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	
}

package sec11.example01_final;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

		p1.name = "을지문덕";
		System.out.println(p1.name);  //계백이 을지문덕으로 바뀜
		//p1.nation = "을지문덕"; //The final field Person.nation cannot be 
		                      //assigned
		                      //final이라서 변경 불가
		
	}

}

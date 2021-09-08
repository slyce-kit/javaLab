package sec04.exam01_class_new;

//실행용 클래스
public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();  
		//Student 객체를 만들어 생성된 객체의 주소값을 s1 변수에 저장한다.
		//s1는 Student 객체를 참조하니까[즉 단순 변수가 아니다] s1는 생성된 Student 객체를 지칭한다.
		System.out.println("s1변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}
	
	//객체를 만드는 이유:데이터를 담기 위해서

}



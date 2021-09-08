package sec07.exam04_other_constructor_call;

public class Car {
      //클래스 구성멤버
	//1.필드
	String company = "현대 자동차";
	String model;
	String color;   //null
	int maxSpeed;     //0
	
	//2.생성자
	Car() {
		
	}
	
	//생성자 오버로딩(overloading)
	//this:자기 자신의 객체를 의미한다.
	//this(): 자기 자신의 객체를 다른 생성자를 의미한다.
	//super: 부모객체
	//super():부모 객체의 생성자
	Car(String model) {
		this(model,null,0);
	}
	
	//constructor overloading
	Car(String model, String color) {
		//this.model = model; ..this.는 자기 자신을 의미한다.
		//this.color = color;
		this(model, color, 0);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	
	
}

package sec07.exam04_other_constructor_call;

public class Car {
      //Ŭ���� �������
	//1.�ʵ�
	String company = "���� �ڵ���";
	String model;
	String color;   //null
	int maxSpeed;     //0
	
	//2.������
	Car() {
		
	}
	
	//������ �����ε�(overloading)
	//this:�ڱ� �ڽ��� ��ü�� �ǹ��Ѵ�.
	//this(): �ڱ� �ڽ��� ��ü�� �ٸ� �����ڸ� �ǹ��Ѵ�.
	//super: �θ�ü
	//super():�θ� ��ü�� ������
	Car(String model) {
		this(model,null,0);
	}
	
	//constructor overloading
	Car(String model, String color) {
		//this.model = model; ..this.�� �ڱ� �ڽ��� �ǹ��Ѵ�.
		//this.color = color;
		this(model, color, 0);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	
	
}

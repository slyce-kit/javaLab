package sec07.exam03_constructor_overloading;

public class Car {
      //Ŭ���� �������
	//1.�ʵ�
	String company = "���� �ڵ���";
	String model;
	String color;   //null
	int maxSeed;     //0
	
	//2.������
	Car() {
		
	}
	
	//constructor overloading
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSeed = maxSpeed;
		
	}
	
	
}

package sec10.exam04_singleton;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Singleton obj1 = new Singleton();
		//The constructor Singleton() is not visible
		//private���� �س��� �Ⱥ��δٰ� �ϴ°�.
		/*
		Singleton obj1 = new Singleton();  //������ ����
		Singleton obj2 = new Singleton();  //������ ����
		*/
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		//�ּҰ� ��
		if(obj1 == obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
		
		
	}

}

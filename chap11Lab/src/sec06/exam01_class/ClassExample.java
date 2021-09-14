package sec06.exam01_class;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		//getClass()�� ��ü���� Class ��ü�� ��´�.
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		try {
		     //forName()�� ���ڿ����� Class ��ü�� ��´�.
			Class clazz2 = Class.forName("sec06.exam01_class.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

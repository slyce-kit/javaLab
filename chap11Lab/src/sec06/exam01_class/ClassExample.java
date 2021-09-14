package sec06.exam01_class;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		//getClass()는 객체에서 Class 객체를 얻는다.
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		try {
		     //forName()는 문자열에서 Class 객체를 얻는다.
			Class clazz2 = Class.forName("sec06.exam01_class.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

package sec10.exam04_singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();
	//굳이 객체를 여러개 만들어서 서버과부하가 일어나는 것을 방지하기 위해 사용
	
	private Singleton() {}
	
	//정적메소드 //리턴타입 //메소드(?)  
	static Singleton getInstance() {
		return singleton;
		
	}
	
}

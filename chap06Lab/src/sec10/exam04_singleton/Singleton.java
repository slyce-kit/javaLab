package sec10.exam04_singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();
	//���� ��ü�� ������ ���� ���������ϰ� �Ͼ�� ���� �����ϱ� ���� ���
	
	private Singleton() {}
	
	//�����޼ҵ� //����Ÿ�� //�޼ҵ�(?)  
	static Singleton getInstance() {
		return singleton;
		
	}
	
}

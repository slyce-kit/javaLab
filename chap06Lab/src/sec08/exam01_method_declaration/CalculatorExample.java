package sec08.exam01_method_declaration;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1:"+result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y) ;
				//int(4) <-byte(1) 자동 형변환
				//x는 Calculator에 int로 정의되어 있음. 
				//따라서 myCalc.divide(여기에 int적어야됨)
				//근데 byte를 넣었으니 자동형변환이 일어남.
				//강제형변환:byte(1) <-int(4)
				//예) int num = 10;
				//byte b1 = (byte) num;
				System.out.println("result2:"+result2);
	
				myCalc.powerOff();
	}

}

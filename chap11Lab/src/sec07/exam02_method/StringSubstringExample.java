package sec07.exam02_method;

public class StringSubstringExample {
	public static void main(String[] args) {	
		String ssn = "880815-1234567 ";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);		
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
		String sex = ssn.substring(7,8);
		
		if(sex.equals("1")) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		
		int birthYear =Integer.parseInt("19"+ssn.substring(0,2));
		System.out.println("birthYear"+birthYear);
		
		int curYear = date.getYear();
		System.out.println("surYear="+carYear);
		
		
	} 
}


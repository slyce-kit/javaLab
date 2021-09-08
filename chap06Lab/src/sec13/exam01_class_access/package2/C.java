package sec13.exam01_class_access.package2;

import sec13.exam01_class_access.package1.*; 
                                 //package1에있는 모든것을 import해라       

public class C {
	//A a; 디폴트라서 안됨. 다른 패키지에 있는거 불러오기 불가능
	B b;   //public이라 import됨.다른 패키지에 있는거 불러오기 가능
}

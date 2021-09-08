package sec12.exam03_import_mycompany;

import sec12.exam03_import_hankook.*;
import sec12.exam03_import_hyundai.Engine;
import sec12.exam03_import_kumho.*;

public class Car {
	//필드
	Engine engine = new Engine();  // Engine cannot be resolved to a type문제 해결
    //위해 위에 import해줌
	SnowTire tire1 = new SnowTire();  //얘도 마찬가지
	BigWidthTire tire2 = new BigWidthTire();
	sec12.exam03_import_hankook.Tire tire3 = new sec12.exam03_import_hankook.Tire();
	sec12.exam03_import_kumho.Tire tire4 = new sec12.exam03_import_kumho.Tire();
}





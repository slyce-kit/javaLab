package sec12.exam03_import_mycompany;

import sec12.exam03_import_hankook.*;
import sec12.exam03_import_hyundai.Engine;
import sec12.exam03_import_kumho.*;

public class Car {
	//�ʵ�
	Engine engine = new Engine();  // Engine cannot be resolved to a type���� �ذ�
    //���� ���� import����
	SnowTire tire1 = new SnowTire();  //�굵 ��������
	BigWidthTire tire2 = new BigWidthTire();
	sec12.exam03_import_hankook.Tire tire3 = new sec12.exam03_import_hankook.Tire();
	sec12.exam03_import_kumho.Tire tire4 = new sec12.exam03_import_kumho.Tire();
}





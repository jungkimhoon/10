package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo {
	
	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		
		zoo.tiger();
//		zoo.giraffe();
//		zoo.elephant();
		//zoo.lion();     private ���� �Ұ�
		
		System.out.println("=====================");
		
		Safari safari = new Safari(); //protected �ڽ� Ŭ���� ���� ���� ( �ڽ� ��ü�� �����ؾ� �Ѵ�. )
		safari.tiger();
		safari.giraffe();
//		safari.elephant();
//		safari.lion();		
	
	}

}

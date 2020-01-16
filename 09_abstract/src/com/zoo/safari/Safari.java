package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo {
	
	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		
		zoo.tiger();
//		zoo.giraffe();
//		zoo.elephant();
		//zoo.lion();     private 접근 불가
		
		System.out.println("=====================");
		
		Safari safari = new Safari(); //protected 자식 클래스 참조 가능 ( 자식 객체를 생성해야 한다. )
		safari.tiger();
		safari.giraffe();
//		safari.elephant();
//		safari.lion();		
	
	}

}

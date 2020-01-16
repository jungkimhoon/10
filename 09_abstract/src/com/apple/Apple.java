package com.apple;

import com.zoo.Zoo;

public class Apple {

	public static void main(String[] args) {
		System.out.println("빨간 사과");
		Zoo zoo = new Zoo();
		
		zoo.tiger();
//		zoo.giraffe();
//		zoo.elephant();
//		zoo.lion();      접근 불가 (다른 패키지는 public 혹은 부모 protected만 가능
	}
	
}

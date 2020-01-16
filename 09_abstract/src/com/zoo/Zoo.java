package com.zoo;

public class Zoo { //다른 패키지에 있을땐 public으로만 참조 가능
		public void tiger() {
		System.out.println("무서운 호랑이");
		}
		
		protected void giraffe() {
			System.out.println("목이 긴 기린");
		}
		
		void elephant() {
			System.out.println("뚱뚱한 코끼리");
		}
		
		private void lion() {
			System.out.println("멋진 사자");
		}
}

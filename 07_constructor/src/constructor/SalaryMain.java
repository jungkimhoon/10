package constructor;

import java.text.DecimalFormat;

//직원들의 월급을 계산하는 프로그램을 작성하시오
//객체 배열로 작성하시오
//생성자를 통해서 데이터를 입력
//계산은 calc()
//name, position, basePay, benefit, taxRate, tax, salary
//
//세금 = (기본급 + 수당) * 세율;
//월급 = 기본급 + 수당 - 세금;
//
//세율은 200만원 이하 : 1%(0.01), 
//     400만원 이하 : 2%(0.02), 
//     400만원 초과 : 3%(0.03)으로 설정한다.
//
//[실행결과]
//이름		직급		기본급		수당		세율		세금		월급
//홍길동		부장		5000000		200000
//유재석		과장		3500000		150000
//박명수		사원		1800000		100000

public class SalaryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryDTO[] a = {new SalaryDTO("홍길동", "부장", 5000000, 200000), 
						 new SalaryDTO("유재석", "과장", 3500000, 150000), 
						 new SalaryDTO("박명수", "사원", 1800000, 100000)};
		DecimalFormat df = new DecimalFormat("#,###");
		
		
		System.out.println("이름\t직급\t기본급\t\t수당\t세율\t세금\t월급");
				
		for(SalaryDTO dto : a) {
		dto.calc();
		System.out.println(dto.getName()+"\t"+dto.getPosition()+"\t"+df.format(dto.getBasePay())+"\t"+dto.getBenefit()+"\t"+dto.getTaxRate()+"\t"+(int)dto.getTax()+"\t"+df.format(dto.getSalary()));
		}
		
	}

}

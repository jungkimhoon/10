package instance;	

public class CompTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 60;
		String result = score>=80 && score<=100 ? "합격" : "불합격" ;
		System.out.println("결과 = "+result);
		
		result = score%2 == 0 ? "짝수" : "홀수";
		System.out.println("결과 = "+result);
		
		int b = 50;
		result = score > b ? score+"" : b+""; //int형 score, b를 ""랑 더해서 string 처리함.
		System.out.println("큰 값 = "+result);
		
		int power = score < b ? score : b;
		System.out.println("작은 값 = "+power);
	}

}

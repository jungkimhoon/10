
public class dd {

	public static void main(String[] args) {
		dd ad = new dd();
		// TODO Auto-generated method stub
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i=0;i<scores.length; i++) {
			sum1 += scores[i];	
		}
		System.out.println("ÃÑÇÕ : " + sum1);
		
		int sum2 = add(scores);
		System.out.println("¸Þ¼Òµå ÃÑÇÕ : "+ sum2);
		
	}
	
	private static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
	
	

}

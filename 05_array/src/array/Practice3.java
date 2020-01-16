package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//[����3] �ζ� 
//ũ�Ⱑ 6���� ������ �迭�� ��Ƽ� 1~45������ ������ �߻��Ͽ� ���� �� ����Ͻÿ�
//��, ���ڰ� �ߺ��Ǹ� �ȵȴ�
//
//input() - ���� �߻�, �ߺ��� ���ڰ� ������ �ٽ� �߻�
//output() - ���


public class Practice3 {
	
	private int[] input(int[] lotto) {
			
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j])  {
					i--;
					break;
				}
			}
		}
		
		return lotto;
	}
	
	private void output(int[] lotto) {
		for(int i=0; i<lotto.length; i++) {
			System.out.print(String.format("%3d", lotto[i])+" ");		
		}
		System.out.println();
	}
	
	private void sort(int[] lotto) {
		//Selection Sort
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					int tmp = lotto[i] ;
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		Practice3 pr = new Practice3();
		int[] lotto = new int[6];
		System.out.print("���� �Է� : ");
		int money = Integer.parseInt(br.readLine());
		money = money / 1000;		
		
		for(int i=1; i<=money; i++) {
			pr.input(lotto);
			//Arrays.sort(lotto);
			pr.sort(lotto);
			pr.output(lotto);
			if(i % 5==0) System.out.println();
		}
		
	}
	}


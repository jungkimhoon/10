package array;

//�߱�����
//ũ�Ⱑ 3���� ������ �迭�� ��� 1~9������ ������ �߻��Ѵ�
//�߻��� ���� ���ߴ� ����
//�ߺ��� �����Ѵ�
//
//[������]
//������ �����Ͻðڽ��ϱ�(Y/N) : w
//������ �����Ͻðڽ��ϱ�(Y/N) : u
//������ �����Ͻðڽ��ϱ�(Y/N) : y
//
//������ �����մϴ�
//
//�����Է� : 123
//0��Ʈ����ũ 0��
//
//�����Է� : 567
//0��Ʈ����ũ 2��
//
//�����Է� : 758
//1��Ʈ����ũ 2��
//...
//
//�����Է� : 785
//3��Ʈ����ũ 0��


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("������ �����Ͻðڽ��ϱ�?(Y/N) : ");
			String YN = br.readLine();			
			boolean flag = false;
			if(YN.charAt(0) == 'N' || YN.charAt(0) == 'n') {
				System.out.println("����");
				break;
			}			
			else if(YN.charAt(0) == 'Y' || YN.charAt(0) == 'y') 
			{	
				int[] num = new int[3];
				int[] com = new int[3];
			
				
				for(int i=0; i<com.length; i++) {
					com[i] = (int)(Math.random()*9)+1;					
					
					for(int j=0; j<i; j++) {
						if(com[i] == com[j]) {
							i--;
							
						}
					}
					System.out.print(com[i]);
					
				}
				
				System.out.println("������ �����մϴ�.");	
				
				while(true) {
					int strike = 0;
					int ball = 0;
					System.out.println("�����Է�");
					System.out.print(">>");
					String comnum = br.readLine();
					
					
					for(int i=0; i<com.length; i++) {
						num[i] = comnum.charAt(i) - 48;
						System.out.println(num[i]);
					}
					
					for(int i=0; i<com.length; i++) {
						if(com[i] == num[i]) strike++;
					}
					for(int i=0; i<com.length; i++) {
						for(int j=0; j<com.length; j++ ) {
							if(i==j) continue;
							if(com[i] == num[j]) ball++;
						}
					}
					
					System.out.println(strike+"��Ʈ����ũ"+ball+ "��");
					
					if(strike == 3) {
						flag = !flag;
						break;	
					}
				}//game while
				if(flag == true) break;
			
			}
			else continue;
		
									
		}
		
		
		
	}

}

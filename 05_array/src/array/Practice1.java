package array;

//[����1]
//ũ�Ⱑ 50���� ���ڹ迭�� ��Ƽ� 65~90������ ������ �߻��Ͽ� ���� �� ����Ͻÿ�
//A ~ Z���� ����� ���
//�� 1�ٿ� 10���� ���
//
//[������]
//D F A G H I J K L T
//O P W E R F V A S B
//P Y R O L E E Z L I
//F E U Z T U P P P A
//S P G B F F O W J C
//
//A : 2
//B : 3
//...
//X : 0
//Y : 1
//Z : 0

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[50];
		
				
		for(int i=0;i<a.length;i++) {
			a[i] = (int)(Math.random()*26)+65;
			System.out.print((char)a[i]+" ");
			if((i+1) % 10 == 0) System.out.println();
			}
		
		System.out.println();
		
		for(int j=1; j<=26; j++) {
			int count = 0;
			for(int i=0;i<a.length;i++) {
				if(j+64 == a[i]) {
					count++;
				}
			}
			System.out.println((char)(j+64)+" : "+count);
		}
	}
}						



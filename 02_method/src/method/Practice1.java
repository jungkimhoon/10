package method;
	/*  ����(dec)�� �Է¹޾Ƽ� 2����(binary), 8����(octor), 16����(hexa) ��ȯ�Ͻÿ�
		 IntegerŬ���� �޼ҵ带 �̿��Ͻÿ�
		
		[������]
		10������ �Է��ϼ��� : 250
		
		2���� = 11111010
		8���� = 372
		16���� = fa */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("10������ �Է��ϼ��� : ");
		int dec = Integer.parseInt(br.readLine());
		
		String binary = Integer.toBinaryString(dec);
		String octa = Integer.toOctalString(dec);
		String hexa = Integer.toHexString(dec);
		
		System.out.println("2���� = "+ binary);
		System.out.println("8���� = "+ octa);
		System.out.println("16���� = "+ hexa);

	}

}

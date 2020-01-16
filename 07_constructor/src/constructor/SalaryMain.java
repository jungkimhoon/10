package constructor;

import java.text.DecimalFormat;

//�������� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
//��ü �迭�� �ۼ��Ͻÿ�
//�����ڸ� ���ؼ� �����͸� �Է�
//����� calc()
//name, position, basePay, benefit, taxRate, tax, salary
//
//���� = (�⺻�� + ����) * ����;
//���� = �⺻�� + ���� - ����;
//
//������ 200���� ���� : 1%(0.01), 
//     400���� ���� : 2%(0.02), 
//     400���� �ʰ� : 3%(0.03)���� �����Ѵ�.
//
//[������]
//�̸�		����		�⺻��		����		����		����		����
//ȫ�浿		����		5000000		200000
//���缮		����		3500000		150000
//�ڸ��		���		1800000		100000

public class SalaryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryDTO[] a = {new SalaryDTO("ȫ�浿", "����", 5000000, 200000), 
						 new SalaryDTO("���缮", "����", 3500000, 150000), 
						 new SalaryDTO("�ڸ��", "���", 1800000, 100000)};
		DecimalFormat df = new DecimalFormat("#,###");
		
		
		System.out.println("�̸�\t����\t�⺻��\t\t����\t����\t����\t����");
				
		for(SalaryDTO dto : a) {
		dto.calc();
		System.out.println(dto.getName()+"\t"+dto.getPosition()+"\t"+df.format(dto.getBasePay())+"\t"+dto.getBenefit()+"\t"+dto.getTaxRate()+"\t"+(int)dto.getTax()+"\t"+df.format(dto.getSalary()));
		}
		
	}

}

package abstract_1;

public  class AbstractMain extends AbstractTest { //�߻� �޼ҵ�� �޼ҵ� �������̵� �ʼ�


	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractTest at = new AbstractMain(); //error �߻� Ŭ������ ��ü ���� ���� ����. //��ӹ޾Ƽ� ���
		at.setName("ȫ�浿"); //ȣ��
		System.out.println("�̸� = "+at.getName());
	}
		
}

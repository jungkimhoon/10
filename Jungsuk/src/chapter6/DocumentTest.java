package chapter6;

class Document {
	static int count = 0;
	String name;
	
	Document(){
		this("�������"+ ++count);
		System.out.println("����.");
		}
	
	Document(String name) {
		this.name = name;
		System.out.println("���� " + this.name + "�� ������.");
	}
}

public class DocumentTest {

	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("�ڹ�.txt");
		Document d3 = new Document();
		Document d4 = new Document();
		// TODO Auto-generated method stub

	}

}

package test.method;

public class MethodTest {
	
	static void printHead(char c, int num) { //���� �������� (static)�� �־���� ���� �ȳ��� ȣ�Ⱑ��, ���� �ٸ������ ���������� ��ü���� �ؼ� ȣ���� �� �ֱ⵵ ��
		for (int i = 0; i < num; i++)
		{
			System.out.print(c);
		}
		System.out.println(); //�ٹٲ� ����
	}

	public static void main(String[] args) {
		printHead('��', 10);
		System.out.println("����� ���� �޼ҵ� ����");
		printHead('��', 20);
		System.out.println("����� ���� �޼ҵ� ȣ���ϰ���");
		printHead('��', 30);

	}

}

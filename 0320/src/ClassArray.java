import java.util.*;

public class ClassArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ��4 = { "������", "������", "�����", "�躽��", "�����", "��ä��", "������", "�ڼ���", "������", "��ä��", "�����", "���ϴ�", "��ä��",
				"������", "������", "������", "������", "������" };

//		for(int i=0;i<��4.length;i++) { 
//			System.out.println(��4[i]);
//		}
		for(String name:��4) {//for-each��  (�����ʿ� ������ ���� ����:������ ������)
			System.out.println(name);
		}
		
		
//		System.out.println("��ȣ�� �Է��ϼ���. �̸��� �˷��帳�ϴ�.");
//		while (true) {//for(;;)�̰Ŷ� while(true)�� ����
//			int number = sc.nextInt();
//			// 1<=number<=18
//			if (1 <= number && number <= ��4.length) {
//				System.out.println(��4[number - 1]);
//			} else {
//				break;
//			}
//		}
	}
}

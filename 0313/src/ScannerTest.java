import java.util.*;

public class ScannerTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("5,6,9,1,13�� ���� �߿��� �Է��ϼ���:");
		int member;

		/*while (true) {
			
			if (member == 5) {
				System.out.println("itzy");
			} else if (member == 7) {
				System.out.println("EXO");
			} else if (member == 9) {
				System.out.println("BTS");
			} else if (member == 1) {
				System.out.println("IU");
			} else if (member == 13) {
				System.out.println("����ƾ");
			} else {
				System.out.println("Ż��");
			}
			break;
		}*/
		
		for(member=0;member<=100000;member++) {
			member = sc.nextInt();
			if (member == 5) {
				System.out.println("itzy");
			} else if (member == 7) {
				System.out.println("EXO");
			} else if (member == 9) {
				System.out.println("BTS");
			} else if (member == 1) {
				System.out.println("IU");
			} else if (member == 13) {
				System.out.println("����ƾ");
			} else {
				System.out.println("Ż��");
			}
		}
		
	}
}

public class TestIf {
	public static void main(String[] args) {
		int member = 7;
		
		/*if(member==5) {
			System.out.println("itzy");
		}else if(member==7) {
			System.out.println("EXO");
		}else if(member==9) {
			System.out.println("BTS");
		}else if(member==1) {
			System.out.println("IU");
		}else if(member==13){
			System.out.println("����ƾ");
		}*/
		
		switch(member) {
		case 5:System.out.println("itzy");break;
		case 7:System.out.println("EXO");break;
		case 9:System.out.println("BTS");break;
		case 1:System.out.println("IU");break;
		case 13:System.out.println("����ƾ");break;
		}
		System.out.println("---------------------------");
		//for	
		int dan=2;
			for(int b=1;b<=9;b++) {
				System.out.println(dan+" X "+b+" = "+(dan*b));
			}
		System.out.println("---------------------------");
		//while
		int d=2; 
		int i=1;
		while(i<=9) {
			System.out.println(d+" X "+i+" = "+(d*i));
			i++;
			}
		System.out.println("---------------------------");
		//for - each
		int arr[]=new int[] {5,7,9,1,13};
		for(int a :arr) {   //arr�� �ִ°� �ӽ÷� int���� a���ٰ� �ϳ��� �ִ°�. 
			System.out.println(a+"");  //���ڸ� ���ڿ��̶� ���ϸ� ���ڿ��� �ٲ�.
			member=a;
			if(member==5) {
				System.out.println("itzy");
			}else if(member==7) {
				System.out.println("EXO");
			}else if(member==9) {
				System.out.println("BTS");
			}else if(member==1) {
				System.out.println("IU");
			}else if(member==13){
				System.out.println("����ƾ");
			}
			}
		System.out.println("-----------------------------------");
		//�Է¹���
		
	
		}
	}




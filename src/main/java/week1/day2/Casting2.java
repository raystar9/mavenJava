package week1.day2;

public class Casting2 {
	
	public static void main(String[] args) {
		int i3 = 97;
		char c1 = (char) i3;
		
		System.out.println("i3 ����Ÿ�� " + i3 + "�Դϴ�.");
		System.out.println("c1 ����Ÿ�� " + c1 + "�Դϴ�.");
		
		i3 = 65;
		c1 = (char)i3;
		
		System.out.println("i3 ����Ÿ�� " + i3 + "�Դϴ�.");
		System.out.println("c1 ����Ÿ�� " + c1 + "�Դϴ�.");
		
		System.out.printf("%c\n", 'A');
		System.out.printf("�����ڵ� 65�� ���� %c�� �ǹ��մϴ�. \n", 65);
		System.out.printf("����A�� �����ڵ�� %d�Դϴ�.", (int)'A');
	}
}


/* Report2_2: Add, Sub, Mul, Div Ŭ����
 * 
 *  �簢���� ���ο� ���θ� ���� double �ڷ��� ���� width, height, �� ����Ʈ ���� 1 �̴�.
 *	�簢���� ������ ���� ���ڿ� ������ �ʵ� color, ����Ʈ ���� while 
 *	����Ʈ ���� �簢���� ���� ������ ������
 *	�־��� ���ο� ������ �簢���� ���� ������
 *	�־��� �ϳ��� ����(���ο� ���η� ���)�� �簢���� ���� ������
 *	�簢���� ������ ����ϴ� getArea() �޼ҵ�
 *	�簢���� �ѷ��� ���̸� ����ϴ� getPerimeter() �޼ҵ�
 * 	1) Rectangle ��ü �迭(ũ�� 3)�� �����ϰ�, ������ �ٸ� �����ڸ� ȣ���Ͽ� ��ü�� �����ǵ��� �Ѵ�.
 *  2) ������ �Լ����� this()�� ����ϵ��� �Ѵ�.
 *  3) getArea() �޼ҵ�, getPerimeter() �޼ҵ带 ȣ���Ͽ� �簢���� ������ �ѷ��� ����Ѵ�.
 *  
 *  
 *  �ټ��� Ŭ������ ����� Ȱ���ϴ� ������ �غ���. ���ϱ�(+), ����(-), ���ϱ�(*) ������(/)�� �����ϴ� �� Ŭ���� Add, Sub, Mul, Div�� ������. �̵��� ��� ������ ���� �ʵ�� �޼ҵ���� ������. 
 *  	int Ÿ���� a, b �ʵ� : 2���� �ǿ����� 
 *  	void setValue(int a, int b) : �ǿ����� ���� ��ü ���� ����
 *  	int calculate() : Ŭ������ ������ �´� ������ �����ϰ� ����� �����Ѵ�.
 *  Calc Ŭ������ �ִ� main() �޼ҵ忡���� ���� ���� ��ʿ� ���� �� ������ �����ڸ� �Է¹ް� 
 *  Add, Sub, Mul, Div �߿��� �� ������ ������ �� �ִ� ��ü�� �����ϰ� 
 *  setValue()�� calculate()�� ȣ���Ͽ� ����ϵ��� �ۼ��϶�. 
 *   
 *  	���� ��� : 
 *      �������� �����ڸ� �Է��Ͻÿ�. >> 5 * 7 
 *      35
 *      �������� �����ڸ� �Է��Ͻÿ�. >> 5 - 7 
 *      -2
 *  	
 *  2) pkg1 ��Ű���� Calc Ŭ����, pkg2 ��Ű���� Add, Sub, Mul, Div Ŭ������ �������� �ۼ��϶�
 *
 *  �ۼ��� :2019�� 4�� 14��
 *  �ۼ���: ���ö
 */

import java.util.Scanner;

class Addi extends Calc {
	public int calculate() { return a+b; }
}

class Muli extends Calc {
	public int calculate() { return a*b; }
}

class Subi extends Calc {
	public int calculate() { return a-b; }
}

class Divi extends Calc {
	public int calculate() { return a/b; }
}

public class Calculator {
	public static void main (String args[])  {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
		int a = scanner.nextInt();
		char operator = scanner.next().charAt(0); // �����ڸ� ���ڷ� ��ȯ
		int b = scanner.nextInt();
		Calc exp;
		switch (operator) {
			case '+': exp = new Addi(); break;
			case '-': exp = new Subi(); break; 
			case '*': exp = new Muli(); break;
			case '/': exp = new Divi(); break;
			default:
				System.out.println("�߸��� �������Դϴ�.");
				scanner.close();
				return;
		}
		exp.setValue(a, b); // �ǿ����� a�� b ���� ��ü�� ����
		if(exp instanceof Divi && b == 0) //  0���� ������ ���
			 System.out.println("����� �� �����ϴ�.");
		else 
			System.out.println(exp.calculate());
		scanner.close();
	}
}

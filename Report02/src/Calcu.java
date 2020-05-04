
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
 *  1) default ��Ű���� �ϳ� ���Ͽ��� Calc, �ٸ� �ϳ��� ���Ͽ��� Add, Sub, Mul, Div Ŭ������ �����ϵ��� �ۼ��϶�.
 *
 *  �ۼ��� :2019�� 4�� 14��
 *  �ۼ���: ���ö
 */
import java.util.Scanner;

class Add {
	private int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calcu() {
		return a+b;
	}
}

class Mul {
	private int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calcu() {
		return a*b;
	}
}

class Sub {
	private int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calcu() {
		return a-b;
	}
}

class Div {
	private int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calcu() {
		int res=0;
		try {
			res = a/b;
		}catch(ArithmeticException e) {
			System.out.print("0���� ���� �� �����ϴ�.");
		}
		return res;
	}
}

public class Calcu {
	public static void main (String args[])  {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
		int a = scanner.nextInt();
		char operator = scanner.next().charAt(0); // �����ڸ� ���ڷ� ��ȯ		
		int b = scanner.nextInt();
		switch (operator) {
			case '+':
				Add add = new Add();
				add.setValue(a, b);
				System.out.println(add.calcu());
				break;
			case '-':
				Sub sub = new Sub();
				sub.setValue(a, b);
				System.out.println(sub.calcu());
				break;
			case '*':
				Mul mul = new Mul();
				mul.setValue(a, b);
				System.out.println(mul.calcu());
				break;
			case '/':
				Div div = new Div();
				div.setValue(a, b);
				System.out.println(div.calcu());
				break;
			default:
				System.out.println("�߸��� �������Դϴ�.");
		}
		
		scanner.close();
	}
}

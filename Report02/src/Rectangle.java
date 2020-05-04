
/* Report2_1: �簢���� ��Ÿ���� Rectangle Ŭ����
 * 
 *  	�簢���� ���ο� ���θ� ���� double �ڷ��� ���� width, height, �� ����Ʈ ���� 1 �̴�.
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
 *  �ۼ��� :2019�� 4�� 14��
 *  �ۼ���: ���ö
 */

public class Rectangle {
	private double width;
	private double height;
	private String color;
	
	public Rectangle() { 
		// �簢���� ���ο� ���θ� ���� double �ڷ��� ���� width, height, �� ����Ʈ ���� 1 �̴�.
		// �簢���� ������ ���� ���ڿ� ������ �ʵ� color, ����Ʈ ���� white
		// ����Ʈ ���� �簢���� ���� ������ ������
		
		width = 1;
		height = 1;
		color = "White";
	}

	/* ������ �Լ����� this()�� ����ϵ��� �Ѵ�. */

	public Rectangle (double width, double height) { // �־��� ���ο� ������ �簢���� ���� ������
		this.width = width;
		this.height = height;
		this.color  = "White";
	}
	
	public Rectangle (double width) { // �־��� �ϳ��� ����(���ο� ���η� ���)�� �簢���� ���� ������
		this.width = width;
		this.height = width;
		this.color = "White";
	}
	public Rectangle (double width, double height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public double getArea() { // �簢���� ������ ����ϴ� getArea() �޼ҵ�
		return width*height;
	}
	
	public double getPerimeter() { // �簢���� �ѷ��� ���̸� ����ϴ� getPerimeter() �޼ҵ�
		return 2*(width+height);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Rectangle ��ü �迭(ũ�� 3)�� �����ϰ�, �� ���� �ٸ� �����ڸ� ȣ���Ͽ� ��ü�� �����ǵ��� �Ѵ�.
		Rectangle [] r;
		r = new Rectangle[3];
		
		r[0] = new Rectangle (1,2);
		r[1] = new Rectangle (2);
		r[2] = new Rectangle (2,3, "Red");

		/* getArea() �޼ҵ�, getPerimeter() �޼ҵ带 ȣ���Ͽ� �簢���� ������ �ѷ��� ����Ѵ�.*/
		for (int i=0; i<r.length; i++)
			System.out.print("[" + i +"]th Rectangle Information Area: " + (double)(r[i].getArea()) + " Perimeter: " + (double)(r[i].getPerimeter()) + " " + "Color: " + (String)(r[i].color) + "\n" );
	}
}


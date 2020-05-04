
/* Report3_1
 * 
 *  1.	�߽��� ��Ÿ���� ���� x, y�� ������ radius �ʵ带 ������ Circle Ŭ������ �ۼ��϶�. equals() �޼ҵ�� �ΰ��� Circle ��ü�� �߽��� ������ ���� ������ �Ǻ��ϵ��� �Ѵ�. 
 *  ��Ʈ) ��ü�� ����ϱ� ���� toString()�� �񱳸� ���� equals() �޼ҵ带 ������ ��.
 *  public class CircleApp {
 *  
 *  	public static void main(String[] args) {
 *  		Circle a = new Circle(2,3,5); // �߽� (2,3)�� ������ 5�� ��
 *  		Circle b = new Circle(2,3,30); // �߽� (2,3)�� ������ 30�� ��
 *  		System.out.println("�� a : " + a);
 *  		System.out.println("�� b : " + b);
 *  		If (a.equals(b)) 
 *  			System.out.println("���� ��");
 *  		else 
 *  			System.out.println("���� �ٸ� ��");
 *  	}
 *  }	


������:
�� a : Circle(2,3) ������ 5
�� b : Circle(2,3) ������ 30
���� ��

 *  �ۼ��� :2019�� 5�� 12��
 *  �ۼ���: ���ö
 */

class Circle{ // Circle Ŭ���� ���� x,y, radius�� �����Ѵ�.
    int x;
    int y;
    int radius;
    public Circle(int x, int y, int radius) {
        // TODO Auto-generated constructor stub
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    
    // toStrind()�� �̿��Ͽ� ����� �� �� �ְ� �Ѵ�.
	public String toString() {
		return "Circle (" + x + "," + y + ") " + "������ " + radius;
	}
	
	// boolean �ڷ����� ����Ͽ� equals���� x�� y�� ������ ���� ������ ��ȯ�Ѵ�.
    public boolean equals(Circle obj) {
        return this.x == obj.x && this.y == obj.y;
    }

}

public class CircleApp {

	public static void main(String[] args) {
		Circle a = new Circle(2,3,5); // �߽� (2,3)�� ������ 5�� ��
		Circle b = new Circle(2,3,30); // �߽� (2,3)�� ������ 30�� ��
		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);
		if (a.equals(b)) 
			System.out.println("���� ��");
		else 
			System.out.println("���� �ٸ� ��");
	}
}	


/* Report3_1
 * 
 *  1.	중심을 나타내는 정수 x, y와 반지름 radius 필드를 가지는 Circle 클래스를 작성하라. equals() 메소드는 두개의 Circle 객체의 중심이 같으면 같은 것으로 판별하도록 한다. 
 *  힌트) 객체를 출력하기 위한 toString()과 비교를 위한 equals() 메소드를 만들어야 함.
 *  public class CircleApp {
 *  
 *  	public static void main(String[] args) {
 *  		Circle a = new Circle(2,3,5); // 중심 (2,3)에 반지름 5인 원
 *  		Circle b = new Circle(2,3,30); // 중심 (2,3)에 반지름 30인 원
 *  		System.out.println("원 a : " + a);
 *  		System.out.println("원 b : " + b);
 *  		If (a.equals(b)) 
 *  			System.out.println("같은 원");
 *  		else 
 *  			System.out.println("서로 다른 원");
 *  	}
 *  }	


실행결과:
원 a : Circle(2,3) 반지름 5
원 b : Circle(2,3) 반지름 30
같은 원

 *  작성일 :2019년 5월 12일
 *  작성자: 양명철
 */

class Circle{ // Circle 클래스 정의 x,y, radius를 정의한다.
    int x;
    int y;
    int radius;
    public Circle(int x, int y, int radius) {
        // TODO Auto-generated constructor stub
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    
    // toStrind()을 이용하여 출력을 할 수 있게 한다.
	public String toString() {
		return "Circle (" + x + "," + y + ") " + "반지름 " + radius;
	}
	
	// boolean 자료형을 사용하여 equals에서 x와 y가 같으면 같은 것으로 변환한다.
    public boolean equals(Circle obj) {
        return this.x == obj.x && this.y == obj.y;
    }

}

public class CircleApp {

	public static void main(String[] args) {
		Circle a = new Circle(2,3,5); // 중심 (2,3)에 반지름 5인 원
		Circle b = new Circle(2,3,30); // 중심 (2,3)에 반지름 30인 원
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if (a.equals(b)) 
			System.out.println("같은 원");
		else 
			System.out.println("서로 다른 원");
	}
}	

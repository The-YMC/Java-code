
/* Report2_1: 사각형을 나타내는 Rectangle 클래스
 * 
 *  	사각형의 가로와 세로를 위한 double 자료형 변수 width, height, 각 디폴트 값은 1 이다.
 *	사각형의 색깔을 위한 문자열 데이터 필드 color, 디폴트 값은 while 
 *	디폴트 값의 사각형을 위한 무인자 생성자
 *	주어진 가로와 세로의 사각형을 위한 생성자
 *	주어진 하나의 길이(가로와 세로로 사용)의 사각형을 위한 생성자
 *	사각형의 면적을 계산하는 getArea() 메소드
 *	사각형의 둘레의 길이를 계산하는 getPerimeter() 메소드
 * 	1) Rectangle 객체 배열(크기 3)을 선언하고, 세가지 다른 생성자를 호출하여 객체가 생성되도록 한다.
 *  2) 생성자 함수에서 this()를 사용하도록 한다.
 *  3) getArea() 메소드, getPerimeter() 메소드를 호출하여 사각형의 면적과 둘레를 출력한다.
 *
 *  작성일 :2019년 4월 14일
 *  작성자: 양명철
 */

public class Rectangle {
	private double width;
	private double height;
	private String color;
	
	public Rectangle() { 
		// 사각형의 가로와 세로를 위한 double 자료형 변수 width, height, 각 디폴트 값은 1 이다.
		// 사각형의 색깔을 위한 문자열 데이터 필드 color, 디폴트 값은 white
		// 디폴트 값의 사각형을 위한 무인자 생성자
		
		width = 1;
		height = 1;
		color = "White";
	}

	/* 생성자 함수에서 this()를 사용하도록 한다. */

	public Rectangle (double width, double height) { // 주어진 가로와 세로의 사각형을 위한 생성자
		this.width = width;
		this.height = height;
		this.color  = "White";
	}
	
	public Rectangle (double width) { // 주어진 하나의 길이(가로와 세로로 사용)의 사각형을 위한 생성자
		this.width = width;
		this.height = width;
		this.color = "White";
	}
	public Rectangle (double width, double height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public double getArea() { // 사각형의 면적을 계산하는 getArea() 메소드
		return width*height;
	}
	
	public double getPerimeter() { // 사각형의 둘레의 길이를 계산하는 getPerimeter() 메소드
		return 2*(width+height);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Rectangle 객체 배열(크기 3)을 선언하고, 세 가지 다른 생성자를 호출하여 객체가 생성되도록 한다.
		Rectangle [] r;
		r = new Rectangle[3];
		
		r[0] = new Rectangle (1,2);
		r[1] = new Rectangle (2);
		r[2] = new Rectangle (2,3, "Red");

		/* getArea() 메소드, getPerimeter() 메소드를 호출하여 사각형의 면적과 둘레를 출력한다.*/
		for (int i=0; i<r.length; i++)
			System.out.print("[" + i +"]th Rectangle Information Area: " + (double)(r[i].getArea()) + " Perimeter: " + (double)(r[i].getPerimeter()) + " " + "Color: " + (String)(r[i].color) + "\n" );
	}
}


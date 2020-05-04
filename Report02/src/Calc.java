
/* Report2_2: Add, Sub, Mul, Div 클래스
 * 
 *  사각형의 가로와 세로를 위한 double 자료형 변수 width, height, 각 디폴트 값은 1 이다.
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
 *  
 *  다수의 클래스를 만들고 활용하는 연습을 해보지. 더하기(+), 빼기(-), 곱하기(*) 나누기(/)를 수행하는 각 클래스 Add, Sub, Mul, Div를 만들어라. 이들은 모두 다음과 같은 필드와 메소드들을 가진다. 
 *  	int 타입의 a, b 필드 : 2개의 피연산자 
 *  	void setValue(int a, int b) : 피연산자 값을 객체 내에 저장
 *  	int calculate() : 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다.
 *  Calc 클래스에 있는 main() 메소드에서는 다음 실행 사례와 같이 두 정수와 연산자를 입력받고 
 *  Add, Sub, Mul, Div 중에서 이 연산을 실행할 수 있는 객체를 생성하고 
 *  setValue()와 calculate()를 호출하여 출력하도록 작성하라. 
 *   
 *  	실행 결과 : 
 *      두정수와 연산자를 입력하시오. >> 5 * 7 
 *      35
 *      두정수와 연산자를 입력하시오. >> 5 - 7 
 *      -2
 *  	
 *  2) pkg1 패키지에 Calc 클래스, pkg2 패키지에 Add, Sub, Mul, Div 클래스를 가지도록 작성하라
 *
 *  작성일 :2019년 4월 14일
 *  작성자: 양명철
 */
public abstract class Calc { // 추상 클래스
	protected int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public abstract int calculate(); // 추상 메소드, 서브 클래스에서 적절히 구현
}
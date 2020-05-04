
/* Report3_2
 * 
 *  MyString 클래스의 구현: String 클래스와 유사한 나만의 문자열 클래스로써 MyString 클래스를 만들고, MyStringEx 클래스를 이용하여 실행되도록 구현하시오.
 *   
public class MyStringEx {

   public static void main(String[] args) {
	MyString s = new MyString(new char[] {'a', 'B', 'c', 'D'});
	MyString s1 = new MyString(new char[] {'a', 'B', 'c', 'D'});
	MyString s2 = new MyString(new char[] {'a', 'b', 'c', 'd'});

	System.out.print("s = ");
	MyString.println(s);  // aBcD
	System.out.print("s1 = ");
	MyString.println(s1);  // aBcD
	System.out.print("s2 = ");
	MyString.println(s2);  // abcd
		    
	System.out.println("s.length = " + s.length());  
	System.out.println("s.equals(s1) = " + s.equals(s1)); // true
	System.out.println("s.equals(s2) = " + s.equals(s2)); // false
	System.out.println("s.charAt(1) = " + s.charAt(1));  // B
		    		   
	MyString s3 = s.toUppercase();
	System.out.print("s.toUppercase() = ");
	MyString.println(s3);                // ABCD
			
	MyString s4 = s.substring(1, 2);
	System.out.print("s.substring(1, 2) = ");
	MyString.println(s4);   // Bc
			
	System.out.print("MyString.valueOf(345) = ");
	MyString.println(MyString.valueOf(345));  // 325
				
	System.out.print("MyString.valueOf(true) = ");
	MyString.println(MyString.valueOf(true));   // true	
   }
}


 *  작성일 :2019년 5월 12일
 *  작성자: 양명철
 */

class MyString {
	private char[] myString;

	// 생성자 myString 배열을 초기화한다.
	public MyString(char[] chars) {
		myString = new char[chars.length + 1];
		for (int i = 0; i < chars.length; i++) {
			myString[i] = chars[i];

		}
		myString[chars.length] = 0; // 마지막 문자는 NULL
	}

	// Override를 통해서 str에 myString 문자열 저장
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < myString.length; ++i)
			str.append(myString[i]);
		return str.toString();
	}
	
	// static을 사용하여 println함수로 문자열 출력
	public static void println(MyString s) {
		System.out.println(s);		
	}
	
	// myString의 길이를 반환한다.
	public int length() { 
		int length = 0;
		while(myString[length] != 0){
			length++;
		}
		return length;
	}
	
	// myString의 입력 인덱스의 문자를 반환한다. 
	public char charAt(int index) {
		if(index < length()) {
			return myString[index];
			}
		else { // 만약 없으면 NULL을 반환한다.
			return 0;
		}
	}
	
	// myString과 다른 문자열을 비교하기 위한 boolean 함수
	public boolean equals(MyString str)	
	{
		if(str.length() == length()) // 두 문자열의 길이가 같으면
		{
			for(int i = 0; i < str.length(); i++)
			{
				if(myString[i] != str.charAt(i)) { // 문자열 비교
					return false; // 문자가 다르면 false
				} 
			}
			return true; // myString과 같은 문자열이면 true를 반환
		}
		else {
			return false; // myString과 다른 문자열이면 false를 반환
		}
	}

	//문자를 대문자로 바꾸는 함수
    public MyString toUppercase(){

        char[] upper = new char[myString.length]; // myString과 같은 새로운 문자열을 만든다.

        for (int i = 0; i < myString.length ; i++) {
            upper[i] = (myString[i]); // myString의 문자를 upper에 저장한다.
        }
        
		int i = 0;
		while(upper[i] != 0){
			if(upper[i] >= 'a' && upper[i] <= 'z') { // upper 문자열에 있는 문자를 대문자로 만든다
				upper[i] -= 32;
			}
			i++;
		}

        return new MyString(upper); //upper을 반환한다.
    }

	
    // Substring 함수, 시작 지점과 종료 지점을 받아서 표시한다.
    public MyString substring(int beginIndex, int endIndex) throws IndexOutOfBoundsException {
        if (beginIndex < 0) { // 시작 지점이 0보다 작으면 에러를 표시한다.
            throw new IndexOutOfBoundsException();
        }
        if (endIndex > myString.length) { //종료 지점이 문자열의 길이보다 길면 에러를 표시한다.
            throw new IndexOutOfBoundsException();
        }
        int sublength = (endIndex - beginIndex + 1); // substring의 길이를 구한다.
        char[] subchars = new char[sublength]; // substring의 길이 만큼 새로운 문자를 할당한다.
        System.arraycopy(myString, beginIndex, subchars, 0, sublength); // mystring에서 시작 지점에서 sublenths만큼 subchars에 복사한다.
        return new MyString(subchars); // 새로운  subchar를 반환한다.
    }
    
    // MyString 데이터를 숫자에서 MyString으로 변환하여 반환한다.
	public static MyString valueOf(int number){
		int length = 1, testNumber = number; 
		while(testNumber/10 > 0){ //length를 count
			testNumber /= 10;
			length ++;
		}
	
		char [] tempc = new char[length]; //length만큼 문자열 배열 생성
		for(int i = length-1; i >= 0; i--){ //tempc에 생성
			int temp = number % 10;
			tempc[i] = (char)(temp + 48);
			number /= 10;
		}
		MyString returnString = new MyString(tempc);
		
		return returnString;
	}
	
	// MyString을 Boolean 타입으로 왔을 떄
	public static MyString valueOf(boolean a) {
		if (a == true ) { //같으면 true를 출력
			return  new MyString(new char[]{ 't', 'r', 'u', 'e' }); 
		}
		else //다르면 false를 출력
			return new MyString(new char[]{ 'f', 'a', 'l', 's', 'e' }); 
			
	}

}
// 메인 함수
public class MyStringEx {
	public static void main(String[] args) {
		MyString s = new MyString(new char[] {'a', 'B', 'c', 'D'});
		MyString s1 = new MyString(new char[] {'a', 'B', 'c', 'D'});
		MyString s2 = new MyString(new char[] {'a', 'b', 'c', 'd'});

		System.out.print("s = ");
		MyString.println(s);  // aBcD
		System.out.print("s1 = ");
		MyString.println(s1);  // aBcD
		System.out.print("s2 = ");
		MyString.println(s2);  // abcd
			    
		System.out.println("s.length = " + s.length());  
		System.out.println("s.equals(s1) = " + s.equals(s1)); // true
		System.out.println("s.equals(s2) = " + s.equals(s2)); // false
		System.out.println("s.charAt(1) = " + s.charAt(1));  // B
			    		   
		MyString s3 = s.toUppercase();
		System.out.print("s.toUppercase() = ");
		MyString.println(s3);                // ABCD
				
		MyString s4 = s.substring(1, 2);
		System.out.print("s.substring(1, 2) = ");
		MyString.println(s4);   // Bc
		  
				
		System.out.print("MyString.valueOf(345) = ");
		MyString.println(MyString.valueOf(345));  // 345
					
		System.out.print("MyString.valueOf(true) = ");
		MyString.println(MyString.valueOf(true));   // true	

	}
}

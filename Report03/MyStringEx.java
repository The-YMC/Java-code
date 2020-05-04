
/* Report3_2
 * 
 *  MyString Ŭ������ ����: String Ŭ������ ������ ������ ���ڿ� Ŭ�����ν� MyString Ŭ������ �����, MyStringEx Ŭ������ �̿��Ͽ� ����ǵ��� �����Ͻÿ�.
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


 *  �ۼ��� :2019�� 5�� 12��
 *  �ۼ���: ���ö
 */

class MyString {
	private char[] myString;

	// ������ myString �迭�� �ʱ�ȭ�Ѵ�.
	public MyString(char[] chars) {
		myString = new char[chars.length + 1];
		for (int i = 0; i < chars.length; i++) {
			myString[i] = chars[i];

		}
		myString[chars.length] = 0; // ������ ���ڴ� NULL
	}

	// Override�� ���ؼ� str�� myString ���ڿ� ����
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < myString.length; ++i)
			str.append(myString[i]);
		return str.toString();
	}
	
	// static�� ����Ͽ� println�Լ��� ���ڿ� ���
	public static void println(MyString s) {
		System.out.println(s);		
	}
	
	// myString�� ���̸� ��ȯ�Ѵ�.
	public int length() { 
		int length = 0;
		while(myString[length] != 0){
			length++;
		}
		return length;
	}
	
	// myString�� �Է� �ε����� ���ڸ� ��ȯ�Ѵ�. 
	public char charAt(int index) {
		if(index < length()) {
			return myString[index];
			}
		else { // ���� ������ NULL�� ��ȯ�Ѵ�.
			return 0;
		}
	}
	
	// myString�� �ٸ� ���ڿ��� ���ϱ� ���� boolean �Լ�
	public boolean equals(MyString str)	
	{
		if(str.length() == length()) // �� ���ڿ��� ���̰� ������
		{
			for(int i = 0; i < str.length(); i++)
			{
				if(myString[i] != str.charAt(i)) { // ���ڿ� ��
					return false; // ���ڰ� �ٸ��� false
				} 
			}
			return true; // myString�� ���� ���ڿ��̸� true�� ��ȯ
		}
		else {
			return false; // myString�� �ٸ� ���ڿ��̸� false�� ��ȯ
		}
	}

	//���ڸ� �빮�ڷ� �ٲٴ� �Լ�
    public MyString toUppercase(){

        char[] upper = new char[myString.length]; // myString�� ���� ���ο� ���ڿ��� �����.

        for (int i = 0; i < myString.length ; i++) {
            upper[i] = (myString[i]); // myString�� ���ڸ� upper�� �����Ѵ�.
        }
        
		int i = 0;
		while(upper[i] != 0){
			if(upper[i] >= 'a' && upper[i] <= 'z') { // upper ���ڿ��� �ִ� ���ڸ� �빮�ڷ� �����
				upper[i] -= 32;
			}
			i++;
		}

        return new MyString(upper); //upper�� ��ȯ�Ѵ�.
    }

	
    // Substring �Լ�, ���� ������ ���� ������ �޾Ƽ� ǥ���Ѵ�.
    public MyString substring(int beginIndex, int endIndex) throws IndexOutOfBoundsException {
        if (beginIndex < 0) { // ���� ������ 0���� ������ ������ ǥ���Ѵ�.
            throw new IndexOutOfBoundsException();
        }
        if (endIndex > myString.length) { //���� ������ ���ڿ��� ���̺��� ��� ������ ǥ���Ѵ�.
            throw new IndexOutOfBoundsException();
        }
        int sublength = (endIndex - beginIndex + 1); // substring�� ���̸� ���Ѵ�.
        char[] subchars = new char[sublength]; // substring�� ���� ��ŭ ���ο� ���ڸ� �Ҵ��Ѵ�.
        System.arraycopy(myString, beginIndex, subchars, 0, sublength); // mystring���� ���� �������� sublenths��ŭ subchars�� �����Ѵ�.
        return new MyString(subchars); // ���ο�  subchar�� ��ȯ�Ѵ�.
    }
    
    // MyString �����͸� ���ڿ��� MyString���� ��ȯ�Ͽ� ��ȯ�Ѵ�.
	public static MyString valueOf(int number){
		int length = 1, testNumber = number; 
		while(testNumber/10 > 0){ //length�� count
			testNumber /= 10;
			length ++;
		}
	
		char [] tempc = new char[length]; //length��ŭ ���ڿ� �迭 ����
		for(int i = length-1; i >= 0; i--){ //tempc�� ����
			int temp = number % 10;
			tempc[i] = (char)(temp + 48);
			number /= 10;
		}
		MyString returnString = new MyString(tempc);
		
		return returnString;
	}
	
	// MyString�� Boolean Ÿ������ ���� ��
	public static MyString valueOf(boolean a) {
		if (a == true ) { //������ true�� ���
			return  new MyString(new char[]{ 't', 'r', 'u', 'e' }); 
		}
		else //�ٸ��� false�� ���
			return new MyString(new char[]{ 'f', 'a', 'l', 's', 'e' }); 
			
	}

}
// ���� �Լ�
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


/* Report4_1
 * 
 *   1.	����ڷκ��� �Է°� ��� ���ϸ��� �Է� �ް�, �Է� ���Ͽ� ��� �ִ� �ؽ�Ʈ�� ���ڼ�, �ܾ��, ������� count�Ͽ� ����ϴ� ���α׷��� ���ÿ�. ��°���� ��� ���Ͽ� ����ǵ��� �Ѵ�.
 *  	���� : ������ �ƴ� ��� ����
 *  	�ܾ� : ���ĺ��̳� ���ڷ� �̷���� �������� ����
 *  	���� :  ������ ����(.  ?  ! )�� ������ �ϳ��� �����̴�.
 *  	�Է� ���� ���� : input.txt
 *  
 *  	��� ���� : output.txt (���ٿ� ���ڼ�, �ܾ��, ������� ����Ѵ�)
 * 
 *  �ۼ��� :2019�� 5�� 29��
 *  �ۼ���: ���ö
 */
import java.io.*; 
  
public class WordCount { 
    public static void main(String[] args) throws IOException { 
    	// txt ���� �ҷ�����
        File file = new File("C:\\temp\\input.txt"); 
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 

        String line; 
          
        // counter���� �ʱ�ȭ
        int countWord = 0; 
        int sentenceCount = 0; 
        int characterCount = 0; 
          
        // ���Ͽ��� NULL�� �� ������ line by line�� �д´�.
        while((line = reader.readLine()) != null) { 
            if(!(line.equals(""))) { 
                  
                characterCount += line.length(); 
                  
                // \\s+�� ���� delimiter
                String[] wordList = line.split("\\s+"); 
                  
                countWord += wordList.length; 
                  
                // [!?.]+�� sentence delimiter�̴�.
                String[] sentenceList = line.split("[.?!]+"); 
                  
                sentenceCount += sentenceList.length; 
            } 
        } 
        System.out.println("Total number of characters = " + characterCount); 

        System.out.println("Total word count = " + countWord); 
        System.out.println("Total number of sentences = " + sentenceCount); 
        
        //����
    	try {
    	    OutputStream output = new FileOutputStream("c:\\temp\\output.txt");
    	    String str = "Total number of characters = " + characterCount + "\n" + "Total word count = " + countWord + "\n" + "Total number of sentences = " + sentenceCount;

    	    byte[] by=str.getBytes();
    	    output.write(by);
    			
    	} catch (Exception e) {
                e.getStackTrace();
    	}
        reader.close();
    }
} 
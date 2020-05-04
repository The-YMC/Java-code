
/* Report4_1
 * 
 *   1.	사용자로부터 입력과 출력 파일명을 입력 받고, 입력 파일에 들어 있는 텍스트의 문자수, 단어수, 문장수를 count하여 출력하는 프로그램을 쓰시오. 출력결과는 출력 파일에 저장되도록 한다.
 *  	문자 : 공백이 아닌 모든 문자
 *  	단어 : 알파벳이나 숫자로 이루어진 연속적인 문자
 *  	문장 :  세가지 문자(.  ?  ! )로 끝나면 하나의 문장이다.
 *  	입력 파일 샘플 : input.txt
 *  
 *  	출력 파일 : output.txt (각줄에 문자수, 단어수, 문장수를 출력한다)
 * 
 *  작성일 :2019년 5월 29일
 *  작성자: 양명철
 */
import java.io.*; 
  
public class WordCount { 
    public static void main(String[] args) throws IOException { 
    	// txt 파일 불러오기
        File file = new File("C:\\temp\\input.txt"); 
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 

        String line; 
          
        // counter들을 초기화
        int countWord = 0; 
        int sentenceCount = 0; 
        int characterCount = 0; 
          
        // 파일에서 NULL이 올 떄까지 line by line을 읽는다.
        while((line = reader.readLine()) != null) { 
            if(!(line.equals(""))) { 
                  
                characterCount += line.length(); 
                  
                // \\s+는 공간 delimiter
                String[] wordList = line.split("\\s+"); 
                  
                countWord += wordList.length; 
                  
                // [!?.]+는 sentence delimiter이다.
                String[] sentenceList = line.split("[.?!]+"); 
                  
                sentenceCount += sentenceList.length; 
            } 
        } 
        System.out.println("Total number of characters = " + characterCount); 

        System.out.println("Total word count = " + countWord); 
        System.out.println("Total number of sentences = " + sentenceCount); 
        
        //저장
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
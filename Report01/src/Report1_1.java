
/* Report1_1: W패턴
 * W 패턴(가로 15, 세로 5)을 “w” 문자로 총 3회 출력하는 프로그램을 쓰시오
 * 
 * '\', '/' 의 패턴을 사용하여 6번 그리고, 불필요한 첫번째 열을 지운다.
 *  
 *  작성일 :2019년 3월 25일
 *  작성자: 양명철
 */
public class Report1_1
{
	public static void main(String[] args)
	{
		char[][] pattern = new char[5][50];
		int width = 6; // 
		
		// W 패턴 그리기
		for(int i = 0; i < 5; i++) // 세로 5번 for 문 새용
		{
			for(int j = 0; j < 6; j++)
			{
				pattern[i][i + width * j + (j / 2) * 4]='W'; // '\' 패턴 그리기
				pattern[i][width + 2 - i + width * j + (j / 2) * 4]='W'; //  '/' 패턴  그리기
			}
		}
		// 불필요한 첫번 열 문자 삭제 (pattern[0])
		for(int excepti = 0; excepti < 3; excepti++)
		{
			pattern[0][width + excepti * 16]=0;
			pattern[0][width + 2 + excepti * 16]=0;
		}
		// 출력 결과
		for(int k = 0; k < 5; k++)
		{
			for(int l = 0; l < 50; l++)
			{
				System.out.print(pattern[k][l]);
			}
			System.out.println("");
		}
	}
}

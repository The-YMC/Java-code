
/* Report1_1: W����
 * W ����(���� 15, ���� 5)�� ��w�� ���ڷ� �� 3ȸ ����ϴ� ���α׷��� ���ÿ�
 * 
 * '\', '/' �� ������ ����Ͽ� 6�� �׸���, ���ʿ��� ù��° ���� �����.
 *  
 *  �ۼ��� :2019�� 3�� 25��
 *  �ۼ���: ���ö
 */
public class Report1_1
{
	public static void main(String[] args)
	{
		char[][] pattern = new char[5][50];
		int width = 6; // 
		
		// W ���� �׸���
		for(int i = 0; i < 5; i++) // ���� 5�� for �� ����
		{
			for(int j = 0; j < 6; j++)
			{
				pattern[i][i + width * j + (j / 2) * 4]='W'; // '\' ���� �׸���
				pattern[i][width + 2 - i + width * j + (j / 2) * 4]='W'; //  '/' ����  �׸���
			}
		}
		// ���ʿ��� ù�� �� ���� ���� (pattern[0])
		for(int excepti = 0; excepti < 3; excepti++)
		{
			pattern[0][width + excepti * 16]=0;
			pattern[0][width + 2 + excepti * 16]=0;
		}
		// ��� ���
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

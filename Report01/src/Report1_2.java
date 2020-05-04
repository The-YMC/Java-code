
/* Report1_2: 종합소득 세율 계산
 * 아래 종합소득 세율표에 있는 2018년 귀속 종합소득세율표를 참고하여 소득 금액별 세부담(소득세, 지방소득세)를 계산하시오.
	사용자가 소득 금액을 입력하면, 소득세와 지방세를 계산하여 출력한다.
	지방세는 소득세의 10%이다. 
	종합소득세율표: https://blog.naver.com/oktax13/221212481844
	
 * 실행예: 
    	소득금액을 천원단위로 입력하시오> 100000
		100000천원의 소득세는 20100천원이고, 지방세는 2010천원 입니다.
 * 
 * 이 프로그램은 세율에 따른 소득세와 지방세를 보여준다.
 * long 타입으로 작성이 되었고, '천 원' 단위로 소득금액을 입력하면 된다.
 *  
 *  작성일 :2019년 3월 25일
 *  작성자: 양명철
 */

import java.util.Scanner;

public class Report1_2
{	
	public static void main(String args[])
	{
		long income, incomeTax, deduction = 0;
		int taxRate;
		Scanner input = new Scanner(System.in);
		
		System.out.print("소득금액을 천원단위로 입력하시오: ");
		income = input.nextLong(); // 소득 금액 입력
		
		// 종합소득 세율에 맞춰서 세율 계산
		if(income <= 12000000) {taxRate = 6;}
		else if(income <= 46000000) {taxRate = 15; deduction = 1080000;}
		else if(income <= 88000000) {taxRate = 24; deduction = 5220000;}
		else if(income <= 150000000) {taxRate = 35; deduction = 14900000;}
		else if(income <= 300000000) {taxRate = 38; deduction = 19400000;}
		else if(income <= 500000000) {taxRate = 40; deduction = 25400000;}
		else {taxRate = 42; deduction = 35400000;}
		
		incomeTax = income * taxRate / 100 - deduction;
		// 결과 출력
		System.out.println("세율 : " + taxRate + "%\n공제: " + deduction);
		
		System.out.println(income + "천원의 소득세는 " + incomeTax + "이고  지방세는" + incomeTax /10);		
		
	}
}

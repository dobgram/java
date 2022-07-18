package reviewGit;

import java.util.Scanner;

// alt + shifr + r 클래스 이름 바꾸기
public class InputTask {
	public static void main(String[] args) {
//	 // 두 정수를 입력한 뒤 덧셈 결과 출력 단,next()만 사용
//		String firstNumber = "";
//		String lastNumber = "";
//		int result = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("두 개의 정수를 입력하시오.");
//		firstNumber = sc.next();
//		lastNumber = sc.next();
//		result = Integer.parseInt(firstNumber) + Integer.parseInt(lastNumber);
//		
//		System.out.print("두 정수의 덧셈 결과는 : ");
//		System.out.println(result);
		
		 int firstNumber = 0, lastNumber = 0, result = 0;
	      String firstNumberMsg = "첫번째 정수 : ", lastNumberMsg = "두번째 정수 : ";
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print(firstNumberMsg);
	      firstNumber = Integer.parseInt(sc.next());
	      
	      System.out.print(lastNumberMsg);
	      lastNumber = Integer.parseInt(sc.next());
	      
	      result = firstNumber + lastNumber;
	      
	      System.out.printf("%d + %d = %d", firstNumber, lastNumber, result);

		
		
	}

}

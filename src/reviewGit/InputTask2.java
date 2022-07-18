package reviewGit;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
		//3개의 정수를 한 번에 입력받은 후, 3개 정수의 곱 출력, next() 한 번만 이용
		Scanner sc = new Scanner(System.in);
		
		int firstNumber = 0, secondNumber = 0, lastNumber = 0, result = 0;
		System.out.println("3개의 정수를 한 번에 입력하시오.예시)3 4 5");
		
		firstNumber = Integer.parseInt(sc.next());
		secondNumber = Integer.parseInt(sc.next());
		lastNumber = Integer.parseInt(sc.next());
		
		result = firstNumber * secondNumber * lastNumber;
		System.out.println("3개 정수의 곱은 " + result);
	}
}

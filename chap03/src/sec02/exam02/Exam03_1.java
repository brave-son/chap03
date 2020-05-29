package sec02.exam02;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Exam03_1 {
	public static void main(String[] args) {
		int 피제수 = 23;
		int 제수 = 5;

		int 몫 = 피제수 / 제수;
		int 나머지 = 피제수 % 제수;

		/* 몫 구하기 */
		/* 나머지 구하기 */
		System.out.println("몫 : " + 몫);
		System.out.println("나머지 : " + 나머지);

		int num = 456;
		System.out.println((num / 100) * 100);

		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int n = scanner.nextInt();

		if (n % 11 == 0) {
			System.out.println(true);

		} else {
			System.out.println(false);

		}

		int num1 = 12345;
		int total = 0;

		while (num1 != 0) {
			total += num1 % 10;
			num1 /= 10;

		}
		/* 코드 작성 */
		System.out.println("각 자리 숫자의 합 : " + total);

		int num2 = 10;

		System.out.println((num2 > 0) ? "양수" : "음수"); // 삼항 연산자

		Scanner Scanner = new Scanner(System.in);
		
		String input = Scanner.nextLine();

		char[] arr;
		arr = input.toCharArray();

		for (int i = 0; i < arr.length; ++i) {
			if (97 <= arr[i] && arr[i] <= 122) {
				arr[i] = (char) (arr[i] - 32);
			}
		}

		System.out.print(arr);
	}
}
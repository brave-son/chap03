package sec02.exam02;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Exam03_1 {
	public static void main(String[] args) {
		int ������ = 23;
		int ���� = 5;

		int �� = ������ / ����;
		int ������ = ������ % ����;

		/* �� ���ϱ� */
		/* ������ ���ϱ� */
		System.out.println("�� : " + ��);
		System.out.println("������ : " + ������);

		int num = 456;
		System.out.println((num / 100) * 100);

		Scanner scanner = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
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
		/* �ڵ� �ۼ� */
		System.out.println("�� �ڸ� ������ �� : " + total);

		int num2 = 10;

		System.out.println((num2 > 0) ? "���" : "����"); // ���� ������

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
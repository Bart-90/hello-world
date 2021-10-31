import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
//		System.out.println("구구단 중 출력할 단은?");
//		
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		
//		System.out.println(number + " * 1 = " + number * 1);
//		System.out.println(number + " * 2 = " + number * 2);
//		System.out.println(number + " * 3 = " + number * 3);
//		System.out.println(number + " * 4 = " + number * 4);
//		System.out.println(number + " * 5 = " + number * 5);
//		System.out.println(number + " * 6 = " + number * 6);
//		System.out.println(number + " * 7 = " + number * 7);
//		System.out.println(number + " * 8 = " + number * 8);
//		System.out.println(number + " * 9 = " + number * 9);
//		
//		System.out.println("구구단 중 출력할 단은?");
//		
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		int i = 1;
//		
//		if(number < 2) {
//			System.out.println("2 이상, 9 이하의 값만 입력할 수 있습니다.");
//		} else if(number > 9) {
//				System.out.println("2 이상, 9 이하의 값만 입력할 수 있습니다.");
//		} else {
//			while(i < 10) {
//			System.out.println(number + " * " + i + " = " + number * i);
//			i = i + 1;
//		}
//			for(int n = 1; n < 10; n++) {
//				System.out.println(number + " * " + n + " = " + number * n);
//			}
//			
//		}
		
//		System.out.println("구구단 중 출력할 단은?");
//		
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		
//		int[] result = new int[9];
//		
//		for(int i = 0; i < result.length; i++) {
//			result[i] = number * (i + 1);
//		}
//		
//		for(int i = 0; i < result.length; i++) {
//			System.out.println(number + " * " + i + " = " + result[i]);
//		}
		
	
		
		
		
		
	}
	
	public static int[] calculate(int times) {
		
		int[] result = new int[9];
		
		for(int i = 0; i < result.length; i++) {
		result[i] = times * (i + 1);
		}
		
		return result;
	}

	
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
}

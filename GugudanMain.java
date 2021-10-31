import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은?");
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int[] result = Gugudan.calculate(number);
		
		
		Gugudan.print(result);
		

	}

}

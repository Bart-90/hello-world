import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		System.out.println("������ �� ����� ����?");
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int[] result = Gugudan.calculate(number);
		
		
		Gugudan.print(result);
		

	}

}

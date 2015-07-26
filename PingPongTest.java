import java.io.Console; 

public class PingPongTest {
	public static void main(String[] args) {
		Console myConsole = System.console();

		System.out.println("Give me a number between 1 and 100");
		String stringNumberInput = myConsole.readLine();
		Integer numberInput = Integer.parseInt(stringNumberInput);

		for (Integer i = 0 ; i <= numberInput ; i++ ) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("ping pong");
			} else if (i % 5 == 0 ) {
				System.out.println("pong");
			} else if (i % 3 == 0 ) {
				System.out.println("ping");
			} else {
				System.out.println(i);
			}
		}
	}
}

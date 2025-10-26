import java.util.Scanner;

public class App {
	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos Minutos Você Deseja Contar por sessão?: ");
		int minutos = sc.nextInt() - 1;
		sc.nextLine();
		System.out.print("\nQuantos minutos de descanso após cada sessão?: ");
		int minutosDescanso = sc.nextInt() - 1;
		sc.nextLine();
		new Pomodoro(minutos, minutosDescanso);
	}
}
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("Quantos minutos você deseja contar por período?: ");
			int minutos = sc.nextInt() - 1;
			sc.nextLine();
			System.out.print("Quantos minutos de descanso após cada período?: ");
			int minutosDescanso = sc.nextInt() - 1;
			sc.nextLine();
			System.out.println("");
			new Pomodoro(minutos, minutosDescanso);
		} catch(Exception e){
			System.out.println("Entrada Inválida.");
		}
		
	}
}
public class Pomodoro {
	private int sessao;

	Pomodoro(int minutos, int minutosDescanso){
		contador(minutos, minutosDescanso);
	}

	void contador(int minutos, int minutosDescanso){	
		int seguraMins = minutos;
		try {
			while(sessao < 4){
				for(int i = 59; i >= 0; i--){
					String minutosZero = minutos < 10 ? "0" + minutos : "" + minutos;
					String segundosZero = i < 10 ? "0" + i : "" + i;
					System.out.printf("\rEstudando  : %s:%s | Sessoes: %d", minutosZero, segundosZero, sessao);
					Thread.sleep(1000);
					if(minutos == 0 && i == 0){	
						System.out.printf("\r                                             ");
						descanso(minutosDescanso);
						minutos = seguraMins;
					} else if(i == 0){
						minutos--;
					}
				}
			}
		} catch(Exception e){
			System.out.printf("\nErro");
		}
		System.out.printf("\nDeu por hoje!");
	}

	void descanso(int minutosDescanso){
		try {
			while(true){
				for (int i = 59; i >= 0; i--) {
					String minutosZero = minutosDescanso < 10 ? "0" + minutosDescanso : "" + minutosDescanso;
					String segundosZero = i < 10 ? "0" + i : "" + i;
					System.out.printf("\rDescansando: %s:%s | Sessoes: %d", minutosZero, segundosZero, sessao);
					Thread.sleep(1000);
					if(minutosDescanso == 0 && i == 0){
						System.out.printf("\r                                         ");
						sessao++;
						break;
					} else if(i == 0){
						minutosDescanso--;
					}
				}
				break;
			}
		} catch (Exception e){
			System.out.printf("\nErro");
		}
	}
}
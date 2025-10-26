
public class Pomodoro {
	private int sessao;

	Pomodoro(int minutos, int minutosDescanso){
		contador(minutos, minutosDescanso);
	}

	void contador(int minutos, int minutosDescanso){	
		int seguraMins = minutos;
		try {
			while(true){
				for(int i = 59; i >= 0; i--){
					String minutosZero = minutos < 10 ? "0" + minutos : "" + minutos;
					String segundosZero = i < 10 ? "0" + i : "" + i;
					System.out.printf("\rEstudando  : %s:%s", minutosZero, segundosZero);
					Thread.sleep(1000);
					if(minutos == 0 && i == 0){	
						sessao++;
						descanso(minutosDescanso);
						minutos = seguraMins;
					} else if(i == 0){
						minutos--;
					}
				}
			}
		} catch(Exception e){
			System.out.printf(\n"Erro");
		}
	}

	void descanso(int minutosDescanso){
		if(sessao == 4) {
			System.out.printf("\nDeu por hoje!");
		}
		
		try {
			while(minutosDescanso > 0){
				for (int i = 59; i >= 0; i--) {
					String minutosZero = minutosDescanso < 10 ? "0" + minutosDescanso : "" + minutosDescanso;
					String segundosZero = i < 10 ? "0" + i : "" + i;
					System.out.printf("\rDescansando: %s:%s", minutosZero, segundosZero);
					Thread.sleep(1000);
					if(minutosDescanso == 0 && i == 0){
						break;
					} else if(i == 0){
						minutosDescanso--;
					}
				}
			}
		} catch (Exception e){
			System.out.printf("\nerro");
		}
	}
}
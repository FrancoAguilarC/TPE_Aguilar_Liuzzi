import java.util.ArrayList;
import java.util.List;

public class Backtracking {
	
	private List<List<Maquina>> solucionF;
	private List<Maquina> maquina;
	private int objetivo;
	
	
	
	public List<List<Maquina>> getSolucion(int objetivo){
		List<Maquina> solucionP = new ArrayList<Maquina>();
		int suma = 0;
		int num = 99999999;
		getSolucionB(solucionP, objetivo, suma);
		return solucionF;
	}
	
	private void getSolucionB(List<Maquina> solucionP, int objetivo, int suma) {
		if(suma >= objetivo) {
			if(suma == objetivo) {
				//Reemplazo o agregar mejor solucion
			}
		}
		//Probando con todo
				//Agrego elemento
				//Backtracking
				//Saco elemento
	}
	
}

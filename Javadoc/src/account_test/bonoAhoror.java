package account_test;

/**
 * Esta clase define los campos nombre (cadena de texto), saldo (números con decimales), plazo (números enteros), mesesRestantes (números enteros) y interes (números con decimales), y los métodos definirIntereses para definir el interes, y vencimiento para obtener las ganancias del bono.
 */
public class bonoAhoror {
	String nombre;
	double saldo;
	int plazo;
	int mesesRestantes;
	double interes;
	
	/**
	 * Método que devuelve el tipo de interes dependiendo del plazo del bono ( 1-60  meses ).
	 * @return devuelve el interes como un double.
	 */
	public void definirInteres() {
		if (plazo >= 0 && plazo <= 60) {
			if (plazo >= 1 && plazo <= 11 ) {
				interes = 0.005;
				System.out.println("Te corresponde " + interes + " de interes para el bono de " + plazo + " meses");
			}
			if (plazo >= 12 && plazo <= 23 ) {
				interes = 0.01;
				System.out.println("Te corresponde " + interes + " de interes para el bono de " + plazo + " meses");
			}
			if (plazo >= 24 && plazo <= 35 ) {
				interes = 0.015;
				System.out.println("Te corresponde " + interes + " de interes para el bono de " + plazo + " meses");
			}
			if (plazo >= 36 && plazo <= 47 ) {
				interes = 0.02;
				System.out.println("Te corresponde " + interes + " de interes para el bono de " + plazo + " meses");
			}
			if (plazo >= 48 && plazo <= 60 ) {
				interes = 0.025;
				System.out.println("Te corresponde " + interes + " de interes para el bono de " + plazo + " meses");
			}
		}
	}	

	/**
	 * Método que devuelve las ganancias obtenidas del bono calculando un tipo de interes compuesto mensual.
	 * @return devuelve las ganancias como un double.
	 */
	public void vencimiento() {
		double saldoCalc = saldo;
		for (int x = 1; plazo >= x ; x++) {
			saldo = saldoCalc + (saldoCalc * interes );
			saldoCalc = saldo;
		}
		System.out.println("Obtendras un interes de " + saldoCalc + "$");
	}
}


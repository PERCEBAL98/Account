/**
 * Esta clase define los campos balance (números con decimales) y nombre (cadena de texto), y el método sacar para obtener respuesta sobre las operaciones.
 */
public class checkingAccount {
	double balance;
	String nombre;

  /**
   * Método que devuelve 3 posibles respuestas dependiendo del valor de x [Opc1. si x es mayor al balance, Opc2. si x es negativo, Opc3. si x es válido.]
   * @param x El parámetro x define la cantidad de dinero que se quiere extraer.
   * @return Devuelve si es válida o no x
   */
	public void sacar(double x) {
		if (balance < x) {
			System.out.println("¡Advertencia, saldo insuficiente!");
		}
		else if (x < 0) {
			System.out.println("¡Advertencia, no puedes sacar dinero negativo xd!");
		}
		else {
			balance -= x;
			System.out.println("Saldo actual " + balance + "$");
		}
	}
}

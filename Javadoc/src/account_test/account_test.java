package account_test;

/**
 * Esta clase define el método main.
 * @author: David Ferrer Moya.
 * @version: 1.0.0
 */
public class account_test {
	/**
	 * Método que interactua con las demas clases. Se da valor a las variables y llama a los métodos.
	 * @return respuestas de los metodos de las clases chekingAccount y bonoAhoror
	 */
	public static void main(String[] args) {
		checkingAccount Acunt = new checkingAccount();
		Acunt.balance = 1266.21;
		Acunt.nombre = "Fede";
		System.out.println("La cuenta pertenence a " + Acunt.nombre + " y tiene " + Acunt.balance + "$");

		Acunt.sacar(5000);
		Acunt.sacar(-21);
		Acunt.sacar(100);	
		
		bonoAhoror Bono = new bonoAhoror();
		Bono.saldo = 1000;
		Bono.plazo = 60;
		
		Bono.definirInteres();
		Bono.vencimiento();
		
	}	
}
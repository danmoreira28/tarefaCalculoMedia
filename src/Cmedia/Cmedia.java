/**
 * 
 */
package Cmedia;

/**
 * @danilo.moreira
 */
public class Cmedia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		recebeNota1();

	}
	
	
	private static void recebeNota1() {
		System.out.println("*****Suas Notas são;*****");
		int portugues = 10;
		int matematica = 5;
		int historia = 7;
		int geografia = 9;
		
		
		System.out.println("Português: " + portugues + "!");
		System.out.println("Matemática: " + matematica + "!");
		System.out.println("História: " + historia + "!");
		System.out.println("Geografia: " + geografia + "!");
		
		
		int nota = portugues + matematica + historia + geografia;
		int mediaFinal = nota / 4;
		
	
		
		System.out.println("\nSua média final é: " + mediaFinal + "!");
	}

}

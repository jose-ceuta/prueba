package elementosprogramacion;
import temperatura.Temperatura;
// También sería valido.
// import temperatura.*;

public class ElementosProgramacion{
	public static void main(String[] args) {
		byte a = 1;
		short b, c = 3;
		int d=30;
		long e = 45988;

		// indicamos que es un 5 de tipo long, pero no modifica el tipo, solo sirve para la legibilidad.
		long x =5L; 
		
		// char representa el número unicode del simbolo imprimible
		char letra='a'; 
		char letra2=126;


		float pi = 3.14f;
		float pi2 = 3.14F;

		float medio = 1/2f;

		double millon = 1e10; // e significa 10 elevado a .. , en este caso 10 elevado a 10
		double medio2 = 4.5666447777d;

		String y = "35";

		System.out.println("El valor de pi es: "+pi);
		System.out.println(y+d);

		boolean adivina = (99=='c'==true);

		//intercambio de variables
		// cambiar el valor de a con el de c
		short intermedia = a;
		a = (byte) c;
		c = (short) intermedia;		

		// version con XOR
		System.out.println ("El valor de a es:"+a);
		System.out.println ("El valor de c es:"+c);
		a = (byte)((short)a^c);
		c = (short)((short)a^c);
		a = (byte)((short)a^c);
		System.out.println ("El valor de a es:"+a);
		System.out.println ("El valor de c es:"+c);

		//para llamar al metodo estatico no necesitamos importar
		System.out.println ("15ºC son " + Temperatura.celciusAFarenheit(15) + "ºF");

	}
}
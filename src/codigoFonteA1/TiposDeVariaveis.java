package codigoFonteA1;

public class TiposDeVariaveis {

	public static void main(String[] args) {
		
		char caractereComEntradaAscii = 'A';
		
		//Letra A inserida atrav�s do valor ASCII correspondente
		char caractereComEntradaNumerica = 65; 
		
		//Letra A inserida atrav�s do valor UNICODE correspondente
		char caractereComEntradaUnicode = '\u0041';
		
		System.out.println("\nImprimindo a vari�vel caractereComEntradaAscii: " + caractereComEntradaAscii);
		
		System.out.println("\nImprimindo a vari�vel caractereComEntradaNumerica: " + caractereComEntradaNumerica);
		
		System.out.println("\nImprimindo a vari�vel caractereComEntredaUnicode: " + caractereComEntradaUnicode);
		
		System.out.println("\nImprimindo a convers�o da vari�vel caractereEntradaAscii para inteiro: " + (int)caractereComEntradaAscii);
		
		boolean valorBooleano = true;
		
		System.out.println("\nImprimindo a vari�vel booleana valorBoleano: " + valorBooleano);
		
		int inteiroComEntradaDecimal = 15;
		int inteiroComEntradaHexadecimal = 0xF;
		
		//Para se utilizar uma constante long se faz necess�rio colocar a letra l na frente da mesma
		long inteiroLongo = 15l;
		
		//Para se utilizar uma constante long se faz necess�rio colocar a letra f na frente da mesma
		float realComEntradaFloat = 15.1f;
		double realComEntradaDouble = 15.1;
		
		System.out.println("\nImprimindo a vari�vel inteira inteiroComEntradaDecimal: " + inteiroComEntradaDecimal);
		
		System.out.println("\nImprimindo a vari�vel inteira inteiroComEntradaHexadecimal: " + inteiroComEntradaHexadecimal);
		
		System.out.println("\nImprimindo a vari�vel inteira inteiroLongo: " + inteiroLongo);
		
		System.out.println("\nImprimindo a vari�vel inteira realComEntradaFloat: " + realComEntradaFloat);
		
		System.out.println("\nImprimindo a vari�vel inteira realComEntradaDouble: " + realComEntradaDouble);
		
	}
}

package codigoFonteA1;

public class TiposDeVariaveis {

	public static void main(String[] args) {
		
		char caractereComEntradaAscii = 'A';
		
		//Letra A inserida através do valor ASCII correspondente
		char caractereComEntradaNumerica = 65; 
		
		//Letra A inserida através do valor UNICODE correspondente
		char caractereComEntradaUnicode = '\u0041';
		
		System.out.println("\nImprimindo a variável caractereComEntradaAscii: " + caractereComEntradaAscii);
		
		System.out.println("\nImprimindo a variável caractereComEntradaNumerica: " + caractereComEntradaNumerica);
		
		System.out.println("\nImprimindo a variável caractereComEntredaUnicode: " + caractereComEntradaUnicode);
		
		System.out.println("\nImprimindo a conversão da variável caractereEntradaAscii para inteiro: " + (int)caractereComEntradaAscii);
		
		boolean valorBooleano = true;
		
		System.out.println("\nImprimindo a variável booleana valorBoleano: " + valorBooleano);
		
		int inteiroComEntradaDecimal = 15;
		int inteiroComEntradaHexadecimal = 0xF;
		
		//Para se utilizar uma constante long se faz necessário colocar a letra l na frente da mesma
		long inteiroLongo = 15l;
		
		//Para se utilizar uma constante long se faz necessário colocar a letra f na frente da mesma
		float realComEntradaFloat = 15.1f;
		double realComEntradaDouble = 15.1;
		
		System.out.println("\nImprimindo a variável inteira inteiroComEntradaDecimal: " + inteiroComEntradaDecimal);
		
		System.out.println("\nImprimindo a variável inteira inteiroComEntradaHexadecimal: " + inteiroComEntradaHexadecimal);
		
		System.out.println("\nImprimindo a variável inteira inteiroLongo: " + inteiroLongo);
		
		System.out.println("\nImprimindo a variável inteira realComEntradaFloat: " + realComEntradaFloat);
		
		System.out.println("\nImprimindo a variável inteira realComEntradaDouble: " + realComEntradaDouble);
		
	}
}

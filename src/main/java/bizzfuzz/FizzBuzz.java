package bizzfuzz;

public class FizzBuzz {
	
	public static void main (String[] args) {
		for (int i=1; i<=100; i++) {
		System.out.println(resultado(i));
		}
	}
	
	public static String resultado(int numero) {
		String buzz =  "buzz", fizz = "fizz", message="";//Inicializamos las variables para regresar el mensaje
			if (numero % 15 == 0) //Validamos para los multiplos de tres y cinco y asi no repetimos resultados
				{
				message = fizz+buzz;			
				}
			else if (numero % 3 == 0){
				message = fizz;						
				}
			else if (numero % 5 == 0){
				message = buzz;						
				} else {
				message = String.valueOf(numero);						
			}
		return message;		
	}

}

import java.util.Scanner;

public class Calculadora {
	

	public static void main(String[] args){            
		Integer a;            
		Integer b;           
		Integer opcion;            
		Integer resultado;
		Scanner teclado;
		
		teclado = new Scanner(System.in);
		
		
		
		do{            
			System.out.println("Ingrese su operación /n 1 para sumar /n 2 pararestar /n 3 para multiplicar /n 4 para dividir");            
			
			opcion = teclado.nextInt();            
			}while(opcion < 1 && opcion > 4);   
			
		System.out.println("Ingrese el primer numero");            
		a = teclado.nextInt();  
		
		System.out.println("Ingrese el segundo numero");            
		b = teclado.nextInt();
		
		switch(opcion)
		{
		case 3:
			resultado = a * b;
			break;
		case 4:
			resultado = a/b;
			break;
		default:
			System.out.println("Error de opcion.");
		}
		
		
		
		System.out.println("El resultado es " + resultado.toString());    
		}
}

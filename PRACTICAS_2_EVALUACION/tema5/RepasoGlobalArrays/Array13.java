package RepasoGlobalArrays;

/* Array13.java
 * 
 * Escribe un método que se llame fechaValida() que recibe tres valores numéricos correspondiente al
 * día, mes y año. Devuelve el valor true si la fecha es válida y false en caso de que la fecha no sea válida.
 * 
 * El método debe tener en cuenta los meses de 28, 30 y 31 días, además de los febreros de 29 días de los años
 * bisiestos. La implementación del método debe hacerse mediante expresiones regulares y/o control manual, sin
 * hacer uso de objetos de tipo fecha que proporciona Java.
 * 
 * Prueba el método pedido desde main().
 * Deben seguirse los principios y estilo del código limpio.
 * 
 * 23/01/2024
 * 
 * Adrián Peñalver Fernández
 * 
 */

public class Array13{
	
	public static void main(String[] args) {
		
		if(fechaValida(11,05,1995)) {
			System.out.println("Fecha valida");
		}else {
			System.err.println("Fecha NO valida");
		}
	
	}
	
	public static boolean fechaValida(int dia, int mes, int year) {
		
		String fecha = ""+dia+"/"+mes+"/"+year;
		String regex = "^(0?[1-9]{1}|[12]{1}[0-9]{1}|3[01]{1})/(0?[1-9]{1}|1[0-2]{1})/([12]{1}[0-9]{3})$";
		
		if(fecha.matches(regex)) {
			
			
			
		}else {
			
			return false;
			
		}
		
	}
	
	

}
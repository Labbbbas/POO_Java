public class TryCatchFinally2{

	public static void main(String[] args){
		
		try{
			float equis = 5/0;
			// float equis = 5/2;
			System.out.println("Equis = " + equis);
		}
		catch(ArithmeticException e){
			System.out.println("Error: division entre cero.");
		}
		catch(Exception e){
			System.out.println("Error: excepcion general.");
		}
		finally{
			System.out.println("A pesar de todo, se ejecuta el bloque finally.");
		}
	}
}

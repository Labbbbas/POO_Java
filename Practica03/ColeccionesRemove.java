import java.util.Hashtable;

public class ColeccionesRemove{
    public static void main(String[] args){
	Hashtable<Integer, String> miTabla = new Hashtable<Integer, String>();
	miTabla.put(1,"uno");
	miTabla.put(2,"dos");
	miTabla.put(5,"cinco");
	
	System.out.println("Contiene a cuatro? " + miTabla.containsKey("cuatro"));

	for (Integer valor : miTabla.keySet()){
	    System.out.println(valor);	
        }

	for(String valor : miTabla.values()){
	    System.out.println(valor);
	}

	System.out.println("\nELIMINANDO 5:cinco");
	miTabla.remove(5);

	for (Integer valor : miTabla.keySet()){
            System.out.println(valor);
        }

    }
}

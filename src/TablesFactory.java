import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


/**
 * @author Pareja 9 Hugo Elvira 15249 y Edgar Ramírez 15236
 * @version 28/08/2016
 * @Description: devuelve el objeto de tipo Set indicado por el usuario en el main
 */
public class TablesFactory<E> {

    public Set getTable(int tipo){
    	
        switch (tipo){
            case 0:
                return new HashSet<E>();
            case 1: 
                return new TreeSet<E>();
            case 2:
                return new LinkedHashSet<E>();
                
        }
		return null;

    }
}

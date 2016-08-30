
/**
 * @author Pareja 9 Hugo Elvira 15249 y Edgar Ramírez 15236
 * @version 28/08/2016
 * @Description 
 */
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DBDesarrolladores {
    Set D_Java, D_Celulares, D_Web;
    
    /**
     * @Description crea el objeto con el tipo de implementacion indicada por el usuario en el main
     */   
    public  DBDesarrolladores(int table){
        TablesFactory<String> factory=new TablesFactory<String>();
        D_Java=factory.getTable(table);
        D_Web=factory.getTable(table);
        D_Celulares=factory.getTable(table);
    }
    
    /**
     * @Description añade un desarrolador a la tabla
     */   
    public void addDesarrollador(String nombre, int profesion){
    	
	switch(profesion){
		case 1:
			D_Java.add(nombre);
                        break;
		case 2:
			D_Web.add(nombre);
                    break;
		case 3:
			D_Celulares.add(nombre);
                    break;
}
        
    }

    /**
     * @Description permite imprimir el listado de desarrolladores de cualquier area segun lo desee el usuario
     */   
    public void imprimir(Set conjunto){
	String[] arreglo=new String[conjunto.size()];
        arreglo=(String[])conjunto.toArray(new String[0]);
	for(String elemento:arreglo){
            System.out.println(elemento);
	}
	
	System.out.println(" \n"); //Enter
}
    
    /**
     * @Description determina, indica y muestra en pantalla la interseccion que el usuario desea revisar
     */   
    public void interseccion(boolean java, boolean web, boolean cel){
    Set C_interseccion;
    
	if(java && web && cel){
        C_interseccion=D_Java;
		C_interseccion.retainAll(D_Web);
		C_interseccion.retainAll(D_Celulares);
		if(C_interseccion.size()==0){System.out.println("No hay desarrolladores que pertenezcan a las tres areas \n");}
		else{
		System.out.println("Los Desarroladores de las 3 areas son: \n");
		imprimir(C_interseccion);}
		
	}else if(java && web){
		C_interseccion=D_Java;
		C_interseccion.retainAll(D_Web);
		if(C_interseccion.size()==0){System.out.println("No hay desarrolladores que pertenezcan a Java y Web a la vez \n");}
		else{
		System.out.println("Los Desarroladores Java y Web son: \n");
		imprimir(C_interseccion);}
		
	}else if(java && cel){
		C_interseccion=D_Java;
		C_interseccion.retainAll(D_Celulares);
		if(C_interseccion.size()==0){System.out.println("No hay desarrolladores que pertenezcan a Java y Celulares a la vez \n");}
		else{
		System.out.println("Los Desarroladores Java y Celulares son: \n");
		imprimir(C_interseccion);}
		
	}else if(web && cel){
		C_interseccion=D_Web;
		C_interseccion.retainAll(D_Celulares);
		if(C_interseccion.size()==0){System.out.println("No hay desarrolladores que pertenezcan a Celulares y Web a la vez \n");}
		else{
		System.out.println("Los Desarroladores Celulares y Web son: \n");
		imprimir(C_interseccion);}
	}
	
	
    }
    
    /**
     * @Description determina si los desarrolladores Java son o no subconjunto de los desarrolladores Web
     */   
    public void SubConj_SN(){
	boolean si_es;

	Set subconjunto = D_Java;
	subconjunto.removeAll(D_Web);
	si_es=subconjunto.isEmpty();

	if(si_es == true){
		System.out.println("Los desarroladores Java SI son subconjunto de desarrolladores Web");
        }
        else{
                System.out.println("Los desarroladores Java NO es subconjunto de desarrolladores Web");
        }
	
    }
    
    /**
     * @Description Determina que conjunto de desarrollares es mayor
     */   
    public void Conjunto_mayor(){

	if (D_Java.size() > D_Web.size() && D_Java.size() > D_Celulares.size()){
            System.out.println("Java tiene el conjunto mas grande de desarrolladores\nNombre(s):");
            imprimir(D_Java);
        }
        else{
            if(D_Web.size() > D_Java.size() && D_Web.size() > D_Celulares.size()){
                System.out.println("Web tiene el conjunto mas grande de desarrolladores\nNombre(s):");
                imprimir(D_Web);
            }
            else{
                System.out.println("Celulares tiene el conjunto mas grande de desarrolladores\nNombre(s):"); 
                imprimir(D_Celulares);
            }
            
        }
    }
    
}
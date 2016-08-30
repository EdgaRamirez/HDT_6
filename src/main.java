
/**
 * @author Pareja 9 Hugo Elvira 15249 y Edgar Ramírez 15236
 * @version 28/08/2016
 * @Description: permite la interaccion entre el usuario y el computador
 */
	import java.util.Scanner;

	public class main {
	    public static void main(String[] args){
	        
	        boolean termino=false;
	        System.out.println("Bienvenido: \n");
	        Scanner entrada=new Scanner(System.in);
	        int err=1,err2=1,desarrolla=0,err3=1;
	        int table=0;
	        
	        while(err==1){// programacion de defensiva, en caso de que el usuario introduzca una opcion fuera del rango
	        System.out.println("Por favor seleccione un tipo de implementacion\n0. Hashset \n1. Treeset \n2. Linkedhashset \n");
	        table=entrada.nextInt();
	        entrada.nextLine();
	        
	        	if(table<0 || table>2){
	        		err=1;
	        		System.out.println("Ingrese una opcion valida por favor\n");
	        	}
	        	else{
	        		err=0;
	        	}
	        }
	        
	        DBDesarrolladores desarrollador=new  DBDesarrolladores(table);
	        
	        
	        Scanner entrada1=new Scanner(System.in);
	        while(!termino){
	            System.out.println("Elija una opcion: \n 1. Añadir desarrolador\n 2. Conjunto interseccion\n 3. J-> W (Subconjunto)\n 4. Conjunto mas grande\n 5. Salir");
	            int opcion1=entrada1.nextInt();
	            entrada1.nextLine();
	            if(opcion1==1){
	                System.out.println("Nombre:");
	                String nombre=entrada1.next();
	                while(err2==1){ // programacion de defensiva, en caso de que el usuario introduzca una opcion fuera del rango
	                System.out.println("¿"+nombre+" es desarrolador de? \n1. Java\n2. Web\n3. Celulares");
	                desarrolla=entrada1.nextInt();
	                if(desarrolla<1 || desarrolla>3){
	                	err2=1;
		        		System.out.println("Ingrese una opcion valida por favor\n");
	                }
	                else{err2=0;}
	                }
	                err2=1;
	                desarrollador.addDesarrollador(nombre, desarrolla);
	            }else if(opcion1==2){
	            	int intersec=0;
	            	
	            	while(err3==1){
	                System.out.println("Elija la interseccion que desea verificar\n 1. Java & Web\n 2. Java & Cel\n 3. Cel & Web\n 4. Java, web y cel");
	                intersec=entrada1.nextInt();
	                
	                if(intersec<1 || intersec>4){// programacion de defensiva, en caso de que el usuario introduzca una opcion fuera del rango
	                	err3=1;
		        		System.out.println("Ingrese una opcion valida por favor\n");
	                }
	                else{err3=0;}
	                
	            	}
	                err3=1;
	                if(intersec==1){
	                	desarrollador.interseccion(true, true, false);
	                }else if(intersec==2){
	                	desarrollador.interseccion(true, false, true);
	                }else if(intersec==3){
	                	desarrollador.interseccion(false, true, true);
	                }else if(intersec==4){
	                	desarrollador.interseccion(true, true, true);
	                }
	            }else if(opcion1==3){
	            	desarrollador.SubConj_SN();
	            }else if(opcion1==4){
	            	desarrollador.Conjunto_mayor();
	            }else if(opcion1==5){
	                termino=true;
	            }
	        	if(opcion1<1 || opcion1>5){// programacion de defensiva, en caso de que el usuario introduzca una opcion fuera del rango
	        		System.out.println("Ingrese una opcion valida por favor\n");
	        	}
	        }
	    }
	}




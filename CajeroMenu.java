package Cajero;

import java.util.List;
import java.util.Scanner;

import Cajero.Usuario;
import Cajero.Cajero;

public class CajeroMenu {

	public static void main(String[] args) {
		
		
		
		Scanner tecladito = new  Scanner(System.in);
	
		 int resultado=0;
		  int deposito = 0;
		 int resultados=0;
		 int fonditos = 0;
		Scanner tecladito2 = new  Scanner(System.in);
		Scanner tecladito3 = new Scanner(System.in);
        int menu=0;
        int menu2=0;
        int tarjeta=0;
        int nip=0;
        Cajero c = new Cajero();
     		Usuario u = new Usuario();
     
		
        System.out.println("Bienvenido que deseas hacer ");
        System.out.println(" 1- Administrar  2-Cajero");
        menu = tecladito2.nextInt();
        switch(menu) {
        case 1:
        	
		    //Nos muestra el menu
        	  System.out.println("------------------------------ ");
        	  System.out.println("--                          -- ");
			  System.out.println("-- ADMINISTRADOR BANQUITOUT -- ");
			  System.out.println("--                          -- ");
			  System.out.println("------------------------------ ");
			  System.out.println("--    Nombre del Usuario    -- ");
			  u.setNombreUsuario(tecladito3.nextLine());
			  System.out.println("--                          -- ");
			  System.out.println("--    Apellido  Paterno     -- ");
			  u.setApellidoPUsuario(tecladito3.nextLine());
			  System.out.println("--                          -- ");
			  System.out.println("--    Apellido  Materno     -- ");
			  u.setApellidoMUsuario(tecladito3.nextLine());
			  System.out.println("--                          -- ");
			  System.out.println("--    Numero de tarjeta     -- ");
			  u.setNtarjeta(tecladito.nextInt());
			  System.out.println("--                          -- ");
			  System.out.println("--    Numero de Nip         -- ");
			  u.setNip(tecladito.nextInt());
			  System.out.println("--                          -- ");
			  System.out.println("-- Inserta un monto inicial --");
			  u.setFondos(tecladito.nextInt());
			  System.out.println("--                          -- ");
			  System.out.println("------------------------------ ");
			  c.insertarRegistro(u);
			  System.out.println("El registro fue correcto");
			  System.out.println(u);
			  
		   
        case 2:     
        
        	
        	System.out.println("--  iNSERTA TU NUMERO DE TARJETA --");
        	tarjeta = tecladito2.nextInt(); 
        	
            System.out.println("-- INSERTA TUS NUMEROS DE SEGURIDAD --");
            nip =tecladito2.nextInt();
            
          //enlistar los registros del READ
        	List<Usuario> lu = c.seleccionarUsuarios();
        	for(Usuario usuario : lu) {
        		if(u.getNtarjeta()==tarjeta&&u.getNip()==nip) {
        			//System.out.println(u);
        		 
        		}
        		
        		
        	}
        	break;
        
       // c.iniciarCajero(u);
       }
		  System.out.println("----------------------------------");
		  System.out.println("----------------------------------");
   	      System.out.println("----                          ---- ");
		  System.out.println("---- BIENVENIDO A  BANQUITOUT ---- ");
		  System.out.println("----                          ---- ");
		  System.out.println("----------------------------------");
		 System.out.println("-----------------------------------");
		 System.out.println("----  1-Retirar fondos         ----");
		 System.out.println("----                           ----");
		 System.out.println("---- 2- realizar Deposito      ----");
		 System.out.println("----                           ----");
		 System.out.println("---- 3- ver estado             ----");
		 System.out.println("----                           ----");
		 System.out.println("---- 4-cerrar sesion           ----");
		 System.out.println("----                           ----");
		 System.out.println("-----------------------------------");
		 System.out.println("-----------------------------------");
		 menu2 = tecladito2.nextInt();
		 

		  
		 switch (menu2) {
		 
		  case 3:
		    //Nos muestra los fondos
			  System.out.println("Los Fondos con los que cuenta son : ");
			
			  fonditos = u.getFondos();
			  System.out.println(fonditos);
			  break;
			  
		  
		  case 1:
		    //Declaraciones ejecutadas cuando el resultado de expresión coincide con el valor2
			  System.out.println("Cuentas con:");
			  System.out.println(u.getFondos());
			  System.out.println("¿Cuanto deseas retirar?");
			  int retiro = tecladito2.nextInt();
			   resultado=( u.getFondos()-retiro);
		      System.out.println(resultado);
		  break;
		  case 2:
			  System.out.println("Cuentas con:");
			  System.out.println(u.getFondos());
			  System.out.println("¿Cuanto deseas depositar?");
			   deposito = tecladito2.nextInt();
			   resultados=(u.getFondos()+deposito);
			  System.out.println(resultados);
		    //Declaraciones ejecutadas cuando el resultado de expresión coincide con valor3
		    break;
		  default:
			  System.out.println("Elije una de las opciones porfavor");
		    //Declaraciones ejecutadas cuando ninguno de los valores coincide con el valor de la expresión
         break;
		}
		 System.out.println("");
           System.out.println("");
		  System.out.println("----------------------------------");
		  System.out.println("----------------------------------");
  	      System.out.println("----                          ---- ");
		  System.out.println("---- BIENVENIDO A  BANQUITOUT ---- ");
		  System.out.println("----                          ---- ");
		  System.out.println("----------------------------------");
		 System.out.println("-----------------------------------");
		 System.out.println("---- 1-Retirar   fondos        ----");
		 System.out.println("----                           ----");
		 System.out.println("---- 2-Depositar fondos        ----");
		 System.out.println("----                           ----");
		 System.out.println("---- 3-Visualizar fondo        ----");
		 System.out.println("----                           ----");
		 System.out.println("---- 4-cerrar sesion           ----");
		 System.out.println("----                           ----");
		 System.out.println("-----------------------------------");
		 System.out.println("-----------------------------------");
		 menu2 = tecladito2.nextInt();
		 

		  
		 switch (menu2) {
		  case 3:
		    //Nos muestra los fondos
			  System.out.println("Los Fondos con los que cuenta son : ");
			
			  //fonditos = u.getFondos();
			  System.out.println(fonditos);
			  break;
		  
		  case 1:
		    //Declaraciones ejecutadas cuando el resultado de expresión coincide con el valor2
			  System.out.println("Cuentas con:");
			  System.out.println(fonditos);
			  System.out.println("¿Cuanto deseas retirar?");
			  int retiro = tecladito2.nextInt();
			  System.out.println("fondos=");
			   resultado=( fonditos-retiro);
		      System.out.println(resultado);
		  break;
		  case 2:
			  System.out.println("¿Cuanto deseas depositar?");
			  deposito = tecladito2.nextInt();
			   resultados=(resultado+deposito);
			  System.out.println(resultados);
		    //Declaraciones ejecutadas cuando el resultado de expresión coincide con valor3
		    break;
		
        
		}
		 
         
	
	}
        
        }
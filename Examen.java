import java.util.Scanner;
public class Examen{


	public static void main (String args[]){

		Scanner teclado=new Scanner(System.in);
		int cant_juegos;
		String categotia;
		int suma1=0;
		int suma2=0;
		int suma3=0;
		System.out.println("Ingrese la cantidad de juegos");
		cant_juegos=teclado.nextInt();

		for (int contador=1; contador<cant_juegos; contador++){
			 System.out.println("Ingrese tipo de consola");
			 categotia=teclado.next();

			 if (categotia =="XBOX"){
			 	suma1=suma1+1;
			 	if (categotia=="PS3"){
			 		suma2=suma2+1;
			 		if (categotia=="WII"){
			 			suma3=1+suma3;
			 		}

			 	}
			 }else
			 System.out.println("opcion incorrecta");
			 Examen.main(null);


			 	
			 }

			 System.out.println("XBOX"+suma1);
			 System.out.println("PS3"+suma2);
			 System.out.println("WII"+suma3);


			}
			}


	
import java.util.Scanner;
public class Examnn3{


	public static void main (String args[]){

		Scanner teclado=new Scanner(System.in);
		int nombre;

		int kilovatios=0;
		String zonaA;
		String zonaB;
		String zonaC;


		System.out.println("Ingrese nombre del cliente");
		nombre=teclado.nextLine();
		System.out.println("Ingrese Zona");
		String zona=teclado.next();

		System.out.println("Ingrese Diplomatico:1; Cuidadano:2");
		int categotia=teclado.nextInt();
		System.out.println("Ingrese Kilovatios");
		kilovatios=teclado.nextInt();

			 if (kilovatios <=100){
			 	zonaA=kilovatios+50;
			 	zonaB=kilovatios+30;
			 	zonaC=kilovatios+20;

			 if (kilovatios >100 && <=100){
			 	zonaA=kilovatios+100;
			 	zonaB=kilovatios+60;
			 	zonaC=kilovatios+40;
			 }
			  if (kilovatios >1000){
			 	zonaA=kilovatios+200;
			 	zonaB=kilovatios+120;
			 	zonaC=kilovatios+80;
			 		}

			 	}
			  if (kilovatios >100 && <=100){
			 	zonaA=kilovatios+100;
			 	zonaB=kilovatios+60;
			 	zonaC=kilovatios+40;
			 	if (categotia =1){

			 	}


//Crear una clase mascota que tenga como atributos:
//- Nombre (String)
//- Edad (int)
//
//Y crear una clase perro que herede de la clase mascota y que tenga adicionalmente los atributos
//- Raza (String)
//- Longitud (Double)
//- G�nero (Boolean, true para hembra y false para macho)
//
//Leer de teclado con la clase `Scanner` los atributos de un perro
//y asignarselos con m�todos _setter_ a un objeto de la clase Perro.
//Crear un m�todo `toString()` con m�todo _getters_ en la clase perro para imprimir sus atributos en consola.
//Imprimir con la palabra perra o perro de acuerdo a la evaluaci�n del atributo G�nero
//
//Subir el proyecto a un repositorio personal en _Github_
//Mandarme la liga de ese repositorio a mi Slack personal



package org.tareados;

import java.util.Scanner;

public class TareaDos {

	public static void main(String[] args) {
		
		Perro perro1 = new Perro();
		
			System.out.println("Por favor introduzaca en sexo del perro(a)"
					+ " f = Femenino � m = Masculino ");
			Scanner sex = new Scanner(System.in);
						
			if(sex.nextLine() == "f") {
				perro1.setSexo(true);
				
				System.out.println("Por favor introduzca el nombre de la perra");
				Scanner nom = new Scanner(System.in);
				perro1.setNombre(nom.nextLine());
				
				System.out.println("Por favor introduzca la edad de la perra en a�os");
				Scanner ed = new Scanner(System.in);
				perro1.setEdad(ed.nextInt());
				
				System.out.println("Por favor introduzca la raza de la perra");
				Scanner ra = new Scanner(System.in);
				perro1.setRaza(ra.nextLine());
				
				System.out.println("Por favor introduzca el tama�o de la perra en cent�metros");
				Scanner lo = new Scanner(System.in);
				perro1.setLongitud(lo.nextInt());
				
				
			}else {
				perro1.setSexo(false);
				System.out.println("Por favor introduzca el nombre del perro");
				Scanner nom = new Scanner(System.in);
				perro1.setNombre(nom.nextLine());
				
				System.out.println("Por favor introduzca la edad del perro en a�os ");
				Scanner ed = new Scanner(System.in);
				perro1.setEdad(ed.nextInt());
				
				System.out.println("Por favor introduzca la raza del perro ");
				Scanner ra = new Scanner(System.in);
				perro1.setRaza(ra.nextLine());
				
				System.out.println("Por favor introduzca el tama�o del perro en cent�metros");
				Scanner lo = new Scanner(System.in);
				perro1.setLongitud(lo.nextInt());
				
			}
			
			
			System.out.println(perro1);
			
	}

}

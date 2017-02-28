package com.company;

import java.util.*;



public class menu {
    static Scanner scanner = new Scanner(System.in);
    static int select = -1;
    static List<Persona> personaList = new ArrayList<>();

    public static void main(String[] args) {
        while(select != 0){
            try{
                System.out.println("Elige opción:\n1.- Paso de frontera" +
                        "\n2.- Mostrar todas las personas\n" +
                        "3.- Busqueda por nombre\n" +
                        "4.- Busqueda por DNI\n" +
                        "0.- Salir");
                select = Integer.parseInt(scanner.nextLine());

                switch(select){
                    case 1:
                        Persona nuevaPersona = pasoFrontera();
                        personaList.add(nuevaPersona);
                        System.out.println("Eres " +nuevaPersona.getName()+ " y tienes el dni" +nuevaPersona.getDni()+ " .");
                        System.out.println("Tus datos se han añadido al paso");
                        break;

                    case 2:
                        System.out.println(personaList);
                        break;
                    case 3:
                        System.out.println("Dime un nombre");
                        String nombre = scanner.nextLine();
                        for (Persona persona : personaList
                             ) {
                            if (persona.getName().equals(nombre)){
                                System.out.println(persona);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Dime un DNI");
                        String dnibusca = scanner.nextLine();
                        for (Persona persona : personaList){
                            if (persona.getDni().equals(dnibusca));
                            System.out.println(persona);
                        }
                        break;
                    case 0:
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Número no reconocido");break;
                }

                System.out.println("\n");

            }catch(Exception e){
                System.out.println("Uoop! Error!");
            }
        }

    }

    public static Persona pasoFrontera(){
        System.out.println("Introduce tu nombre:");
        String name= scanner.nextLine();

        System.out.println("Introduce tu dni:");
        String dni = scanner.nextLine();

        return new Persona(name,dni);

    }

}




/**
 * Created by 46995932d on 21/02/2017.
 */

package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("A continuación ingrese nombre:");
 String nombre = scanner.nextLine();
        System.out.println("A continuación ingrese apellido");
        String apellido = scanner.nextLine();
        System.out.println("A continuación ingrese fecha de nacimiento");
        String fecha = scanner.nextLine();
        scanner.close();
Persona persona = new Persona();
persona.setNombre(nombre);
persona.setApellido(apellido);
persona.setFechadenacimiento(fecha);
persona.agregarPersona(persona);

System.out.println("Has agregado a:" + persona.getPersonas().toString());
    }
}
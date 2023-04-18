import Uno.Persona;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Scanner scan= new Scanner (System.in);
        System.out.println("Por favor, ingrese su nombre: ");
        String nombre=scan.next();
        persona.setNombre(nombre);




    }
}
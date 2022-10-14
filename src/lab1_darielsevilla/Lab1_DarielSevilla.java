package lab1_darielsevilla;

import java.util.Scanner;

public class Lab1_DarielSevilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Inicio
        System.out.println("-- Bienvenido al sistema de calculo de promedio --");
        System.out.print("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        
        //Notas de 4 classes
        System.out.print("Ingrese nota final de primera clase: ");
        double nota1 = leer.nextDouble();
        
        System.out.print("Ingrese nota final de segunda clase: ");
        double nota2 = leer.nextDouble();
        
        System.out.print("Ingrese nota final de tercer clase: ");
        double nota3 = leer.nextDouble();
        
        System.out.print("Ingrese nota final de cuarta clase: ");
        double nota4 = leer.nextDouble();
        
        //calculo de promedio
        double suma = nota1 + nota2 + nota3+nota4;
        double promedio = suma/4;
        
        //Impresión de resultado
        System.out.println("---- " + nombre + " el promedio de las cuatro clases es: " + promedio);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Berserker
 */
public class Reemplazo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "Hola cómo están?";
        System.out.println("Frase sin números");
        System.out.println(frase);
        String [] cadena = frase.split(" ");
        reemplaza(cadena);
    }
    
    public static void reemplaza(String [] cadena){
        int contador = 1;
        String resultado = "";
        for (String parte : cadena) {
            resultado += parte+contador;
            //parte += contador;
            contador++;
        }
        System.out.println("\nFrase con números");
        System.out.println(resultado);
    }
    
}

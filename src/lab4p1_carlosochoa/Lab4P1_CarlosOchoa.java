/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_carlosochoa;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Lab4P1_CarlosOchoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcionMenu = 0;

        while (opcionMenu != 4) {

            System.out.println("Menu de Opciones:");
            System.out.println("1. Analizador de contrasenas");
            System.out.println("2. Cascada y simetria");
            System.out.println("3. Cifrado Cesar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcionMenu = entrada.nextInt();
            entrada.nextLine();

            switch (opcionMenu) {

                case 1: {
                    System.out.println("");
                    System.out.println("ANALIZADOR DE CONTRASENAS");

                    char respuestaAnalisis = 's';

                    while (respuestaAnalisis == 's' || respuestaAnalisis == 'S') {

                        String contraseniaUsuario = "";

                        while (contraseniaUsuario.length() == 0) {
                            System.out.print("Ingrese su contrasena: ");
                            contraseniaUsuario = entrada.nextLine();

                            if (contraseniaUsuario.length() == 0) {
                                System.out.println("Error: La entrada no puede ser vacia.");
                            }
                        }

                        boolean cumpleLongitud = false;
                        boolean tieneNumero = false;
                        boolean tieneEspecial = false;
                        boolean tieneMayuscula = false;

                        if (contraseniaUsuario.length() >= 8) {
                            cumpleLongitud = true;
                        }

                        int posicionCaracter = 0;

                        while (posicionCaracter < contraseniaUsuario.length()) {

                            char caracterActual = contraseniaUsuario.charAt(posicionCaracter);

                            if (caracterActual >= '0' && caracterActual <= '9') {
                                tieneNumero = true;
                            }

                            if (caracterActual == '!' || caracterActual == '#'
                                    || caracterActual == '$' || caracterActual == '%') {
                                tieneEspecial = true;
                            }

                            if (caracterActual >= 'A' && caracterActual <= 'Z') {
                                tieneMayuscula = true;
                            }

                            posicionCaracter++;
                        }

                        if (cumpleLongitud && tieneNumero && tieneEspecial && tieneMayuscula) {
                            System.out.println("Contrasena Segura.");
                        } else {
                            System.out.println("Contrasena Insegura. Fallo en:");

                            if (!cumpleLongitud) {
                                System.out.println("-Minimo 8 caracteres");
                            }

                            if (!tieneMayuscula) {
                                System.out.println("-Falta una Mayuscula");
                            }

                            if (!tieneNumero) {
                                System.out.println("-Falta un numero");
                            }

                            if (!tieneEspecial) {
                                System.out.println("-Falta un caracter especial");
                            }
                        }

                        String repetirTexto = "";

                        while (repetirTexto.length() == 0) {
                            System.out.print("Desea analizar otra contrasena? (S/N): ");
                            repetirTexto = entrada.nextLine();

                            if (repetirTexto.length() == 0) {
                                System.out.println("Error: La entrada no puede ser vacia.");
                            }
                        }

                        respuestaAnalisis = repetirTexto.charAt(0);
                    }

                    System.out.println("");
                    break;
                }

                case 2: {
                    System.out.println("");
                    System.out.println("CASCADA Y SIMETRIA");

                    String palabraCascada = "";
                    boolean palabraTieneEspacio = true;

                    while (palabraCascada.length() == 0 || palabraTieneEspacio) {

                        System.out.print("Ingrese una palabra sin espacios: ");
                        palabraCascada = entrada.nextLine();

                        if (palabraCascada.length() == 0) {
                            System.out.println("Error: La entrada no puede ser vacia");
                        } else {

                            palabraTieneEspacio = false;

                            int posicionPalabra = 0;

                            while (posicionPalabra < palabraCascada.length()) {

                                char caracterPalabra = palabraCascada.charAt(posicionPalabra);

                                if (caracterPalabra == ' ') {
                                    palabraTieneEspacio = true;
                                }

                                posicionPalabra++;
                            }

                            if (palabraTieneEspacio) {
                                System.out.println("Error: La entrada no puede cometer espacios");
                            }
                        }
                    }

                    String lineaActual = "";
                    int contadorLetras = 0;

                    while (contadorLetras < palabraCascada.length()) {
                        lineaActual = lineaActual + palabraCascada.charAt(contadorLetras);
                        System.out.println(lineaActual);
                        contadorLetras++;
                    }

                    

                    System.out.println("");
                    break;
                }

                case 3: {
                    System.out.println("");
                    System.out.println("CIFRADO CESAR");
                    System.out.println("");
                    break;
                }

                case 4: {
                    System.out.println("Saliendo del programa :v");
                    break;
                }

                default: {
                    System.out.println("Opcion no valida");
                    System.out.println("");
                    break;
                }
            }

        } //chiste: (leer rapido) --> habia un pollito que respiraba por el culito, se sentó y se murió. xdxdxdxdx Israel, Netanyahu, Epstein.
            

            
        
    } //fin del main
    
} //fin dela clase

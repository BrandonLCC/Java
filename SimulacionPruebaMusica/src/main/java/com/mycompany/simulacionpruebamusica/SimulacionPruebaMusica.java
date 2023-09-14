/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simulacionpruebamusica;
import java.util.Scanner; //Importar el scanner para que podamos ingresar valores desde la terminal
/**
 *
 * @author Brandon Casas 
 */
public class SimulacionPruebaMusica {
 
    public static void main(String[] args) {
        int Opciones = 0;
        Scanner teclado = new Scanner(System.in);
        Cancion Cancion1 = null;

        do {
            // Menú de opciones
            System.out.println("------------------------------------");
            System.out.println("---- Bienvenido a la aplicacion ----");
            System.out.println("            LaMejorMUsica           ");
            System.out.println("------------------------------------");
            System.out.println("(1). Ingresar una musica nueva.     ");
            System.out.println("(2). Buscar una musica.             ");
            System.out.println("(3). Modificar una musica.          ");
            System.out.println("(4). Guardar en favoritos.          ");
            System.out.println("(5). Descargar Musica.              ");
            System.out.println("(6). Salir del programa.            ");
            System.out.println("------------------------------------");
            System.out.print("Opcion: ");
            Opciones = teclado.nextInt();

            switch (Opciones) {
                case 1:
                    // Ingresar una nueva canción
                    Cancion1 = new Cancion();

                    System.out.println("------------------------------------");
                    System.out.println("Agrega valores correspondientes");
                    System.out.println("------------------------------------");
                    teclado.nextLine(); // Limpia el buffer
                    System.out.println("Ingrese el nombre del artista: ");
                    String artista = teclado.nextLine();
                    Cancion1.setArtista(artista);

                    System.out.println("------------------------------------");
                    System.out.println("Ingrese el título de la canción: ");
                    String titulo = teclado.nextLine();
                    Cancion1.setTitulo(titulo);

                    System.out.println("------------------------------------");
                    System.out.println("Ingrese la duración de la música en segundos: ");
                    int duracion = teclado.nextInt();
                    Cancion1.setDuracion(duracion);

                    System.out.println("Canción ingresada correctamente.");
                    break;

                case 2:
                    // Buscar una canción
                    if (Cancion1 != null) {
                        System.out.println("Canción encontrada:");
                        System.out.println(Cancion1);
                        Cancion1.CalculoMusica();
                        System.out.println(Cancion1.DuracionMUsica());
                        Cancion1.AdelantarMUsica(10);
                    } else {
                        System.out.println("No se ha ingresado una canción.");
                    }
                    break;

                case 3:
                    // Modificar la canción
                    if (Cancion1 != null) {
                        System.out.println("Ingrese nuevos valores para la canción:");

                        System.out.println("Nuevo nombre del artista: ");
                        teclado.nextLine(); // Limpia el buffer
                        String nuevoArtista = teclado.nextLine();
                        Cancion1.setArtista(nuevoArtista);

                        System.out.println("Nuevo título de la canción: ");
                        String nuevoTitulo = teclado.nextLine();
                        Cancion1.setTitulo(nuevoTitulo);

                        System.out.println("Nueva duración de la música en segundos: ");
                        int nuevaDuracion = teclado.nextInt();
                        Cancion1.setDuracion(nuevaDuracion);

                        System.out.println("¿Nueva descarga de la música? true/false");
                        boolean nuevaDescargado = teclado.nextBoolean();
                        Cancion1.setDescargado(nuevaDescargado);

                        System.out.println("¿Ingresar la canción a la lista de favoritos? true/false ");
                        boolean nuevoFavorito = teclado.nextBoolean();
                        Cancion1.setFavorito(nuevoFavorito);

                        System.out.println("Canción modificada correctamente.");
                    } else {
                        System.out.println("No se ha ingresado una canción.");
                    }
                    break;

                case 4:
                    // Guardar en favoritos
                    if (Cancion1 != null) {
                        Cancion1.setFavorito(true);
                        System.out.println("Canción agregada a favoritos.");
                    } else {
                        System.out.println("No se ha ingresado una canción.");
                    }
                   
                    break;

                case 5:
                    // Descargar Música
                    if (Cancion1 != null) {
                        Cancion1.setDescargado(true);
                        System.out.println("Canción descargada.");
                    } else {
                        System.out.println("No se ha ingresado una canción.");
                    }
                    break;

                case 6:
                    System.out.println("Ha salido del programa");
                    break;

                default:
                    System.out.println("¡Esta opcion no existe!");
                    break;
            }
        } while (Opciones != 6);
    }
}

            



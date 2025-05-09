package com.methaporce.vista;

import com.methaporce.modelo.GestorPelicula;
import com.methaporce.modelo.Pelicula;

public class Main {

    public static void main (String [] args){

        //Gestor para las peliculas y sus acciones
        GestorPelicula gestor = new GestorPelicula ();

        //Crear peliculas peliculas a la lista
        Pelicula p1 = new Pelicula (1,"El Pianista",true);
        Pelicula p2 = new Pelicula (2, "10 things I hate about you",true);
        Pelicula p3 = new Pelicula (3,"Notting Hill",false);
        Pelicula p4 = new Pelicula (4,"Pride and predjuice",true);
        Pelicula p5 = new Pelicula (5,"Dunkerque",false);

        //Agregar peliculas a la lista creada
        System.out.println("Agregando peliculas...");
        gestor.agregarPelicula (p1);
        gestor.agregarPelicula (p2);
        gestor.agregarPelicula (p3);
        gestor.agregarPelicula (p4);
        gestor.agregarPelicula (p5);

        //Comprobar peliculas disponibles
        System.out.println("Peliculas disponibles hasta ahora: \n");
        System.out.println(gestor.obtenerPeliculasDisponibles ());

        //Establecer pelicula como disponible
        gestor.marcarPeliculaDisponible (5);
        System.out.println("\nMarcando pelicula como disponible...");
        System.out.println("Peliculas disponibles ahora: \n");
        System.out.println(gestor.obtenerPeliculasDisponibles ());

        //Eliminar una pelicula
        System.out.println("Eliminando peliculas...");


    }
}

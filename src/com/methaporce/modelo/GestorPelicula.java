package com.methaporce.modelo;

import java.util.ArrayList;

public class GestorPelicula {

    ArrayList<Pelicula> peliculas = new ArrayList<>();

    public void agregarPelicula (Pelicula pelicula){
        peliculas.add (pelicula);
    }

    public void eliminarPelicula(int id){
        peliculas.removeIf(p->(p.getId() == id));
    }

    public void obtenerPeliculas (){
        for (Pelicula pelicula : peliculas){
            System.out.println(pelicula);
        }
    }

    public ArrayList<Pelicula> obtenerPeliculasDisponibles() {
        ArrayList<Pelicula> disponibles = new ArrayList <>();
            for (Pelicula pe : peliculas){
                if (pe.isDisponible()){
                    disponibles.add (pe);
                }
        }
            return disponibles;
    }

    public ArrayList<Pelicula> obtenerPeliculasNoDisponibles (){
        ArrayList<Pelicula> disponibles = new ArrayList <>();
        for (Pelicula pe : peliculas){
            if (!pe.isDisponible()){
                disponibles.add (pe);
            }
        }
        return disponibles;
    }

    public void marcarPeliculaDisponible(int id){
        for (Pelicula p : peliculas){
            if (p.getId() == id){
                p.setDisponible (true);
                break;
            }
        }
    }
}


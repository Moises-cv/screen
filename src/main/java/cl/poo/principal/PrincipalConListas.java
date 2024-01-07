package cl.poo.principal;

import cl.poo.modelos.Pelicula;
import cl.poo.modelos.Serie;
import cl.poo.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalConListas {
    public static void main(String[] args) {

        var miPelicula = new Pelicula("Jhon Wick", 2021);
        miPelicula.evalua(9);
        var otraPelicula = new Pelicula("Avatar", 2023);
        otraPelicula.evalua(6);
        var peliculaMoises = new Pelicula("El señor de los añillos", 2001);
        peliculaMoises.evalua(10);
        var casaDragon = new Serie("La casa del Dragon", 2022);

        /* al agregar series al arrayList de peliculas lo cambiamos a titulo
        * de esta manera utilizaremos la super clase titulos que abarca series y peliculas*/
        /* de esta manera programamos orientado a las interfacez
        * ya que la interface de List se utiliza tanto en ArrayList, LinkedList, Stack, vector, etc
        * de esta manera al necesitar cambiarlo no tendriamos problema
        * podria ser List<Titulo> lista = new LinkedList<>(); y seguiria funcionando*/
        List<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaMoises);
        lista.add(casaDragon);

        // utilizamos forEach para recorrer el toString de cada pelicula
        /* lado derecho colocamos nuestra lista a iterar
        * y del lado izquierdo como queremos llamar a cada uno de esos item que tiene esa lista*/
        for (Titulo item:lista) {
            System.out.println("Nombre: " + item.getNombre());
            // item es del tipo pelicula
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println(pelicula.getClasificacion());
            }
        }

        // orden de List
        ArrayList<String> listaArtistas = new ArrayList<>();
        listaArtistas.add("Penélope Cruz");
        listaArtistas.add("Antonio Banderas");
        listaArtistas.add("Ricardo Darín");

        // orden por letras
        Collections.sort(listaArtistas);
        System.out.println("Lista de artistas ordenada " + listaArtistas);

        // deberemos implementar en titulos el comparable ya que al ser objetos no se compararan
        Collections.sort(lista);
        System.out.println(" lista de titulos ordenados: " + lista);

        // comparamos por fecha de lanzamiento
        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha" + lista);
    }
}

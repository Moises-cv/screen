package cl.poo.modelos;

import cl.poo.Calculos.Clasificacion;

// Para utilizar herencia utilizamos extends
// pelicula es un titulo

// en este caso la pelicula extiende de titulo e implementa la clasificacion (firma contrato para utilizar metodos dentro de clasificacion)
public class Pelicula extends Titulo implements Clasificacion {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + " (" + getFechaDeLanzamiento() +")";
    }
}

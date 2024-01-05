package cl.poo.Calculos;

import cl.poo.modelos.Titulo;

public class CalculadoraTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    /* al tener que crear dos metodos uno para series y peliculas incluye
    * mejor utilizamos el polimorfismo ya que las series y peliculas son titulos */
    public void incluye(Titulo titulo) {
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}

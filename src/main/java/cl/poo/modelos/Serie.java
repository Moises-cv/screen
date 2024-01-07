package cl.poo.modelos;

// Para utilizar herencia utilizamos extends
// serie es un titulo
public class Serie extends Titulo{
    int temporadas;
    int episodiosTemporadas;
    int minutosEpisodio;

    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    // sobreescritura de metodos esto se debe que desde titulo no se sabe los minutos para series
    // por lo tanto sobreescribimos el metodo con @Override de titulos aqui en series para poder utilizarlo segun las reglas de negocios de series
    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosTemporadas * minutosEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosTemporadas() {
        return episodiosTemporadas;
    }

    public void setEpisodiosTemporadas(int episodiosTemporadas) {
        this.episodiosTemporadas = episodiosTemporadas;
    }

    public int getMinutosEpisodio() {
        return minutosEpisodio;
    }

    public void setMinutosEpisodio(int minutosEpisodio) {
        this.minutosEpisodio = minutosEpisodio;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNombre() + " (" + this.getFechaDeLanzamiento() + ")";
    }
}

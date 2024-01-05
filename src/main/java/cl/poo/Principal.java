package cl.poo;

import cl.poo.Calculos.CalculadoraTiempo;
import cl.poo.Calculos.FiltroRecomendaciones;
import cl.poo.modelos.Episodio;
import cl.poo.modelos.Pelicula;
import cl.poo.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        // Creamos nueva instancia de la clase pelicula con el new
        // TipodeDato nombre = creamos nueva instancia que creara un nuevo espacio en la memoria para este objeto con atributo y su valor;
        Pelicula miPelicula = new Pelicula();
        //utilizamos set para asignar valores a las variables
        miPelicula.setNombre("Jhon Wick");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(160);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.7);
        miPelicula.evalua(6.0);
        // en vez de acceder a un atributo lo hacemos desde un metodo con el permiso de este
        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del Dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosEpisodio(50);
        casaDragon.setEpisodiosTemporadas(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        CalculadoraTiempo calculadoraTiempo = new CalculadoraTiempo();
        // al utilizar el polimorfismo podemos utilizar en incluye tanto una pelicula como una serie
        calculadoraTiempo.incluye(miPelicula);
        calculadoraTiempo.incluye(casaDragon);
        System.out.println(calculadoraTiempo.getTiempoTotal());

        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
        filtroRecomendaciones.filtrar(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa de dragones");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);
        filtroRecomendaciones.filtrar(episodio);

    }
}

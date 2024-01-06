package cl.poo;

import cl.poo.Calculos.CalculadoraTiempo;
import cl.poo.Calculos.FiltroRecomendaciones;
import cl.poo.modelos.Episodio;
import cl.poo.modelos.Pelicula;
import cl.poo.modelos.Serie;

import java.util.ArrayList;

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


        /* creamos nueva pelicula pero en vez de llamar a la clase
        *  pero java nos va a permitir cambiar el pelicula del lado izquierdo por la palabra (var)
        * lo que hace una inferencia del tipo de dato del objeto nuevo del lado derecho*/
        // clase variablereferencia = que es una nueva pelicula;
        var peliculaMoises = new Pelicula();
        peliculaMoises.setNombre("El señor de los añillos");
        peliculaMoises.setDuracionEnMinutos(180);
        peliculaMoises.setFechaDeLanzamiento(2001);

        /* como creamos un ArrayList
        * importamos ArrayList de java.util
        * dentro de estos <> ira el tipo de dato que va a tener cada uno de los objeto que iran dentro del ArrayList*/
        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(peliculaMoises);

        System.out.println("Tamaño de la lista es " + listaDePeliculas.size());
        System.out.println("La primera pelicula es " + listaDePeliculas.get(0).getNombre());

        System.out.println("Lugar en memoria: " + listaDePeliculas);

        System.out.println("toString de ArrayList: " + listaDePeliculas.toString());

        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());
    }
}

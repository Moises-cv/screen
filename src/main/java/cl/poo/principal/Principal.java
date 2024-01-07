package cl.poo.principal;

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
                        /*  = estos metodos new pelicula() no son metodos son realmente constructores
                        * estos nos sirven para reservar espacios en la memoria que nosotros le podamos colocar atributos a esa pelicula
                        * estos no solo sirven para reservar espacios, ademas en ves de setiar los parametros de la clase
                        * se los pasaremos como argumentos a la nueva instancia de pelicula*/
        Pelicula miPelicula = new Pelicula("Jhon Wick", 2021);
        //utilizamos set para asignar valores a las variables
        miPelicula.setDuracionEnMinutos(160);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.7);
        miPelicula.evalua(6.0);
        // en vez de acceder a un atributo lo hacemos desde un metodo con el permiso de este
        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calculaMedia());



        Serie casaDragon = new Serie("La casa del Dragon", 2022);
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
        var peliculaMoises = new Pelicula("El señor de los añillos", 2001);
        peliculaMoises.setDuracionEnMinutos(180);

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

package cl.poo.modelos;

// Creamos clase (objeto) pelicula y sus atributos
public class Titulo {
    // encapsulamiento (modificadores de acceso) se realiza para que el usuario no sepa como funciona nuestro proyecto en logica de tal manera de solo mostrar el producto final
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    /* modificamos el acceso a private
     * de esta manera el acceso sera privado y no podremos acceder a este atributo ni modificarlo
     * siendo privado para otras clases pero no para si mismo*/
    private double sumaDeLasEvaluaciones;
    private int totalEvaluaciones;

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    // AL COLOCAR LOS ATRIBUTOS PRIVATE DEBEREMOS CREAR LOS SET PARA PODER INGRESAR VALORES A ESTAS VARIABLES
    public void setNombre(String nombre) {
        // this indica que nos referimos al atributo de esta clase y no al valor que el usuario va a pasarnos
        //this.atributoclase = valorintroducido
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    // al ser privado el atriburo totalEvaluaciones crearemos un metodo para poder retornar el valor de totalEvaluaciones
    public int getTotalEvaluaciones() {
        return totalEvaluaciones;
    }

    // en el mercado se esta utilizando los verbos imperativos para los metodos
    public void muestraFichaTecnica() {
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("La fecha de lanzamiento es: " + fechaDeLanzamiento);
        // modificamos la duracion y minutos ya que estabamos llamando al atributo,
        // ahora llamaremos al metodo getDuracionEnMinutos y el identificara si es de mi propia clase titulo o de la clase series
        System.out.println("La duracion en minutos: " + getDuracionEnMinutos());
    }

    public void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
        totalEvaluaciones++;
    }

    public double calculaMedia() {
        return sumaDeLasEvaluaciones / totalEvaluaciones;
    }
}

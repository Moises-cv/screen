package cl.poo.principal;

import cl.poo.modelos.Titulo;
import cl.poo.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el nombre de la pelicula: ");
        var busqueda = sc.nextLine();
        String clave = "6ca9d3a2";
        String direccion = "https://www.omdbapi.com/?t=" + busqueda + "&apikey=" + clave;

        // cliente para hacer request
        HttpClient client = HttpClient.newHttpClient();
        // request de lo que le vamos a pedir al servidor
        // patron de diseño Builder sirve para construir algo que tiene muchas formas
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        // recivimos los datos con httpresponse
                            // response llama a client
        HttpResponse<String> response = client
                // enviando un request con un mensaje que vamos a recibir
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();// con esto le indicamos

        TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        // al imprimir no leera las variables debido a que estan en minusculas pero podemos hacer una conversion de estas con gjson
        System.out.println(miTituloOmdb);
        Titulo miTitulo = new Titulo(miTituloOmdb);
        System.out.println(miTitulo);
    }
}
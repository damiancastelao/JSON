package damw.danielcastelao.org;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 Utilización de la libreria para parseo de JSON
 https://github.com/google/gson
 Volcamos a un fichero los datos y recuperamos de otro fichero
*/
public class Main {

    public static void main(String[] args) throws IOException {
        // objeto para trabajar con el parseo de json
        Gson gson = new Gson();
        // Cadena json
        String json_original;


        // creamos nuestro objeto inicial
        Persona persona_original = new Persona();
        System.out.println(persona_original);

        // lo pasamos a json
        json_original = gson.toJson(persona_original, Persona.class);
        System.out.println(json_original);


        // Creamos un fichero y guardamos json
        FileWriter file = new FileWriter("output.json");
        file.write(json_original);
        file.close();

        // Leemos de un fichero y lo pasamos a un nuevo objeto Persona
        String json_recuperado = "";
        FileReader fileReader = new FileReader("guardados.json");
        int valor=fileReader.read();
        // recorremos el fichero y lo guardamos en una string
        while(valor!=-1){
            // System.out.print((char)valor);
            json_recuperado += (char) valor;
            valor=fileReader.read();
        }
        // Cerramos el stream
        fileReader.close();

        // pasamos el string json a un nuevo objeto persona
        Persona persona_recuperada = gson.fromJson(json_recuperado, Persona.class);
        System.out.println(json_recuperado);
        System.out.println(persona_recuperada.toString());
    }
}

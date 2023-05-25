package damw.danielcastelao.org;

import java.util.ArrayList;

/**
 * Clase de datos
 * Estos son los datos que quiero guardar
 * en formato json en un fichero
 * para luego recuperarlos
 */
public class Persona {

    private String nombre;
    private int edad;
    private ArrayList<String> hobbies = new ArrayList<>();

    /**
     * Constructor por defecto con datos
     */
    public Persona() {
        this.nombre = "Anonimo";
        this.edad = 33;
        this.hobbies.add("origami");
        this.hobbies.add("surf");
        this.hobbies.add("haikus");
    }

    public Persona(String nombre, int edad, ArrayList<String> hobbies) {
        this.nombre = nombre;
        this.edad = edad;
        this.hobbies = hobbies;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Para poder comprobar los datos
     * @return informacion de la persona
     */
    @Override
    public String toString() {
        StringBuilder info;
        info = new StringBuilder(nombre + " de " + edad + ", tiene por hobbies:");
        for (String hobby: hobbies)
            info.append(" ").append(hobby);
        return info.toString();
    }

}

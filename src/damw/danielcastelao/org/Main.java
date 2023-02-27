package damw.danielcastelao.org;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        String json = "{\n" +
                "    \"nombre\": \"Fernando\",\n" +
                "    \"edad\": 30\n" +
                "}";
        Gson gson = new Gson();
        Persona p = gson.fromJson(json, Persona.class);
        System.out.println(p);
    }
}

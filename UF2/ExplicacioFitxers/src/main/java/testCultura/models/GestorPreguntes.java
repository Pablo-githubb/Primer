package testCultura.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class GestorPreguntes {
    /**
     * Aquest mètode serveix per poder importar les preguntes de l'arxiu preguntesTest.json a l'aplicació del Pojo.
     * @param fitxerJSON Utilitzem la variable fitxerJSON per marcar la ruta de l'arxiu preguntesTest.json
     * @return retorna la ruta de l'arxiu .json que hem marcat. A més, hem importat aquestes dates en la clase testCultura on les tractem per aplicarles a l'aplicació.
     * @throws IOException
     */
    public static testCultura carregarPreguntes(String fitxerJSON) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = GestorPreguntes.class.getClassLoader().getResourceAsStream("preguntesTest.json");
        if (inputStream == null) {
            throw new RuntimeException("El fitxer .json no s'ha trobat");
        }
        return objectMapper.readValue(inputStream, testCultura.class);
    }

    public static class Pregunta {
        @JsonProperty("pregunta")
        public String pregunta;

        @JsonProperty("correcta")
        public String correcta;

        @JsonProperty("opcions")
        public String[] opcions;

        @JsonProperty("punts")
        public int punts;
    }

    public static class testCultura {
        @JsonProperty("categoria")
        public Pregunta[] categoria;

        @JsonProperty("pregunta")
        public String pregunta;

        @JsonProperty("correcta")
        public String correcta;

        @JsonProperty("opcions")
        public String[] opcions;

        @JsonProperty("punts")
        public int punts;
    }
}
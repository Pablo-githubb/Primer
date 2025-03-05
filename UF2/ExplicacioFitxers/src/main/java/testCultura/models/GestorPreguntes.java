package testCultura.models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestorPreguntes {
    private static final String RUTA_PREGUNTES = "preguntesTest.json";

    public static List<Pregunta> carregarPreguntes() {
        List<Pregunta> preguntes = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(RUTA_PREGUNTES));
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }
            reader.close();

            String jsonString = jsonContent.toString().trim();

            int arrayStart = jsonString.indexOf("[");
            int arrayEnd = findMatchingBracket(jsonString, arrayStart);
            String preguntesContent = jsonString.substring(arrayStart + 1, arrayEnd).trim();

            List<String> preguntaObjects = splitJsonObjects(preguntesContent);

            for (String pregJson : preguntaObjects) {
                Pregunta pregunta = new Pregunta();
                pregunta.pregunta = extractJsonValue(pregJson, "pregunta");
                pregunta.correcta = extractJsonValue(pregJson, "correcta");

                int opcionsKeyIndex = pregJson.indexOf("\"opcions\"");
                int opcionsArrayStart = pregJson.indexOf("[", opcionsKeyIndex);
                int opcionsArrayEnd = findMatchingBracket(pregJson, opcionsArrayStart);
                String opcionsContent = pregJson.substring(opcionsArrayStart + 1, opcionsArrayEnd).trim();
                String[] opcions = opcionsContent.split(",");
                for (int k = 0; k < opcions.length; k++) {
                    opcions[k] = opcions[k].replace("\"", "").trim();
                }
                pregunta.opcions = opcions;

                String puntsStr = extractJsonValue(pregJson, "punts");
                pregunta.punts = Integer.parseInt(puntsStr);

                preguntes.add(pregunta);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al carregar les preguntes.");
        }
        return preguntes;
    }

    private static int findMatchingBracket(String s, int start) {
        char openBracket = s.charAt(start);
        char closeBracket = (openBracket == '{') ? '}' : ']';
        int count = 0;
        for (int i = start; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == openBracket) {
                count++;
            } else if (c == closeBracket) {
                count--;
                if (count == 0) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static List<String> splitJsonObjects(String s) {
        List<String> objects = new ArrayList<>();
        int length = s.length();
        int start = 0;
        int braceCount = 0;
        boolean inQuotes = false;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == '"') {
                inQuotes = !inQuotes;
            }
            if (!inQuotes) {
                if (c == '{') {
                    if (braceCount == 0) {
                        start = i;
                    }
                    braceCount++;
                } else if (c == '}') {
                    braceCount--;
                    if (braceCount == 0) {
                        objects.add(s.substring(start, i + 1));
                    }
                }
            }
        }
        return objects;
    }

    private static String extractJsonValue(String json, String key) {
        String searchKey = "\"" + key + "\":";
        int index = json.indexOf(searchKey);
        if (index < 0) {
            return "";
        }
        int valueStart = index + searchKey.length();
        while (valueStart < json.length() && (json.charAt(valueStart) == ' ' || json.charAt(valueStart) == '\n' || json.charAt(valueStart) == '\r')) {
            valueStart++;
        }
        char firstChar = json.charAt(valueStart);
        if (firstChar == '"') {
            int end = json.indexOf("\"", valueStart + 1);
            return json.substring(valueStart + 1, end);
        } else {
            int end = valueStart;
            while (end < json.length() && json.charAt(end) != ',' && json.charAt(end) != '}' && json.charAt(end) != ']') {
                end++;
            }
            return json.substring(valueStart, end).trim();
        }
    }

    public static class Pregunta {
        public String pregunta;
        public String correcta;
        public String[] opcions;
        public int punts;

        public String getPregunta() {
            return pregunta;
        }

        public void setPregunta(String pregunta) {
            this.pregunta = pregunta;
        }

        public String getCorrecta() {
            return correcta;
        }

        public void setCorrecta(String correcta) {
            this.correcta = correcta;
        }

        public String[] getOpcions() {
            return opcions;
        }

        public void setOpcions(String[] opcions) {
            this.opcions = opcions;
        }

        public int getPunts() {
            return punts;
        }

        public void setPunts(int punts) {
            this.punts = punts;
        }
    }
}
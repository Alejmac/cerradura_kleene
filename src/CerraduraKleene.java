import java.util.ArrayList;
import java.util.List;

public class CerraduraKleene {
    private List<String> lenguaje = new ArrayList<>();

    // Constructor que recibe las palabras del lenguaje
    public CerraduraKleene(List<String> lenguaje) {
        this.lenguaje = lenguaje;
    }

    public List<String> obtenerCerradura(int nivel) {
        List<String> cerradura = new ArrayList<>(lenguaje);

        for (int i = 1; i < nivel; i++) {
            List<String> nuevasPalabras = new ArrayList<>();

            for (String palabra : cerradura) {
                for (String l : lenguaje) {
                    nuevasPalabras.add(palabra + l);
                }
            }
            cerradura.addAll(nuevasPalabras);
        }

        return cerradura;
    }

}

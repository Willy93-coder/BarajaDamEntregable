/**
 * @author Guillermo Cifre González
 * @version 1.0
 * */
public class Carta {
    // Atributos
    private String[] coll = {"OROS", "COPAS", "BASTOS", "ESPADAS"};
    private int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    // Constructor por defecto
    public Carta() {
    }

    /**
     * Método para devolver el array de coll
     */
    public String[] getColl() {
        return coll;
    }

    /**
     * Método para devolver el array de num
     */
    public int[] getNum() {
        return num;
    }
}

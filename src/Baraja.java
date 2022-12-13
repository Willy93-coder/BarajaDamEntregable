import java.util.Arrays;

/**
 * @author Guillermo Cifre González
 * @version 1.0
 * */
public class Baraja {
    // Atributos
    private Carta carta = new Carta();

    // Constructor
    public Baraja (){

    }

    /**
     * Método para crear la baraja
     * Usamos los metodos getColl y getNum para obtener el length de ambos arrays
     * Pintamos el atributo baraja*/
    public void mostrarBaraja(){
        String [] coll = carta.getColl();
        int collLength = carta.getColl().length;
        int numLength = carta.getNum().length;
        int[][] baraja = new int[collLength][numLength];
        for (int i = 0; i < collLength; i ++) {
            String palo = coll[i];
            for (int j = 0; j < numLength; j ++) {
                int numero = j + 1;
                baraja[i][j] = numero;
                System.out.println(numero + " de " + palo);
            }
        }
    }
}

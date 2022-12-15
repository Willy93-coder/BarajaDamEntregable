import java.util.Arrays;

/**
 * @author Guillermo Cifre González
 * @version 1.0
 * */
public class Baraja {
    // Atributos
    private final Carta carta = new Carta();
    private final String[] coll = {"OROS", "COPAS", "BASTOS", "ESPADAS"};
    private final int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    // Constructor
    public Baraja (){

    }
    /**
     * Método para crear la baraja
     * Usamos los metodos setColl y setNum para crear cada carta
     * Usamos los metodos getColl y getNum para guardar los valores de cada carta
     * Pintamos la baraja*/
    public void mostrarBaraja(){
        int collLength = coll.length;
        int numLength = num.length;
        for (int i = 0; i < collLength; i ++) {
            // Le asignamos el palo
            carta.setColl(this.coll[i]);
            // Guardamos el palo
            String palo = carta.getColl();
            for (int j = 0; j < numLength; j ++) {
                // Le asignamos el numero
                carta.setNum(this.num[j]);
                // Guardamos el numero
                int numero = carta.getNum();
                System.out.println(numero + " de " + palo);
            }
        }
    }
}

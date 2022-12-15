/**
 * @author Guillermo Cifre González
 * @version 1.0
 * */
public class Carta {
    // Atributos
    private String coll;
    private int num;

    // Constructor por defecto
    public Carta() {
    }

    // Métodos para obtener los valores

    public String getColl() {
        return coll;
    }

    public int getNum() {
        return num;
    }

    // Métodos para cambiar el valor de la carta
    public void setColl(String coll) {
        this.coll = coll;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

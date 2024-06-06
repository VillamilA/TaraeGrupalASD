
import java.util.Scanner;

public class Regulares extends _2D {
    // Atributos
    Scanner sc = new Scanner(System.in);
    String Figura;

    // Constructor
    public Regulares(int nlados, String nombre, String figura) {
        super(nlados, nombre);
        this.Figura = figura;
    }

    // Métodos
    public void mostrar_datos() {
        System.out.println("Tipo de figura: " + Figura + " Numero de lados: " + getNlados());
    }
}

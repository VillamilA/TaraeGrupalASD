
import java.util.Scanner;
public class Circulo extends Regulares {

    Scanner sc3 = new Scanner(System.in);
    public Circulo(int nlados, String nombre, String figura) {
        super(nlados, nombre, figura);
    }

    public void metodo_personalizado_circulo() {
        System.out.println("Método personalizado de Círculo");
    }

    public double Calcular_AreaC(){
        System.out.println("Ingrese el radio: ");
        double radio = sc3.nextDouble();
        return((3.1416)*(radio* radio));
    }

    public double Calcular_PerimetroC(){
        System.out.println("Ingrese el radio: ");
        double radio = sc3.nextDouble();
        return (2*3.1416*radio);
    }
}

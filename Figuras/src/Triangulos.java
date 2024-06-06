import java.util.*;
public class Triangulos extends Regulares {
    Scanner sc2 = new Scanner(System.in);
    public Triangulos(int nlados, String nombre,String figura) {
        super(nlados, nombre, figura);
    }

    public void metodo_personalizado_triangulo() {
        System.out.println("Método personalizado de Triángulo");
    }
    public double Calcular_Area(){
        System.out.println("Ingrese la base: ");
        double base = sc2.nextDouble();
        System.out.println("Ingrese la Altura: ");
        double Altura = sc2.nextDouble();
        return  ((base * Altura)/2);
    }
    public double Calcular_Perimetro(){
        System.out.println("Ingrese la lado A: ");
        double Lado1 = sc2.nextDouble();
        System.out.println("Ingrese la lado B: ");
        double Lado2 = sc2.nextDouble();
        System.out.println("Ingrese la lado B: ");
        double Lado3 = sc2.nextDouble();
        return (Lado1 +Lado2 +Lado3);

    }
}

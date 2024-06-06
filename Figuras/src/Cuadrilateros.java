import java.util.Scanner;

public class Cuadrilateros extends Regulares {
    // Atributos
    Scanner sc1 = new Scanner(System.in);

    // Constructor
    public Cuadrilateros(int nlados, String nombre,String figura) {
        super(nlados, nombre, figura);
    }

    // Métodos
    public void Eleccion() {
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectángulo");
        System.out.println("3. Rombo");
        System.out.println("4. Romboide");
        System.out.println("5. Trapecio");
        System.out.println("Elige una opción: ");
        int eleccion = sc1.nextInt();
        switch (eleccion) {
            case 1:
                // Cuadrado
                calcularCuadrado();
                break;
            case 2:
                // Rectángulo
                calcularRectangulo();
                break;
            case 3:
                // Rombo
                calcularRombo();
                break;
            case 4:
                // Romboide
                calcularRomboide();
                break;
            case 5:
                // Trapecio
                calcularTrapecio();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    private void calcularCuadrado() {
        mostrar_datos();
        System.out.println("Ingrese el lado del cuadrado: ");
        double Lado1 = sc1.nextDouble();
        double area = Lado1 * Lado1;
        double perimetro = 4 * Lado1;
        System.out.println("Área del cuadrado: " + area);
        System.out.println("Perímetro del cuadrado: " + perimetro);
    }

    private void calcularRectangulo() {
        mostrar_datos();
        System.out.println("Ingrese el lado A: ");
        double Lado1 = sc1.nextDouble();
        System.out.println("Ingrese el lado B: ");
        double Lado2 = sc1.nextDouble();
        double area = Lado1 * Lado2;
        double perimetro = 2 * (Lado1 + Lado2);
        System.out.println("Área del rectángulo: " + area);
        System.out.println("Perímetro del rectángulo: " + perimetro);
    }

    private void calcularRombo() {
        mostrar_datos();
        System.out.println("Ingrese el ladoA: ");
        double Lado1 = sc1.nextDouble();
        System.out.println("Ingrese el ladoB: ");
        double Lado2 = sc1.nextDouble();
        System.out.println("Ingrese el Angulo: ");
        double Angulo = sc1.nextDouble();
        double area = Lado1 * Lado2 * Math.sin(Math.toRadians(Angulo));
        double perimetro = 4 * Lado1;
        System.out.println("Área del rombo: " + area);
        System.out.println("Perímetro del rombo: " + perimetro);
    }

    private void calcularRomboide() {
        mostrar_datos();
        System.out.println("Ingrese el lado A: ");
        double Lado1 = sc1.nextDouble();
        System.out.println("Ingrese el lado B: ");
        double Lado2 = sc1.nextDouble();
        double area = Lado1 * Lado2;
        double perimetro = 2 * (Lado1 + Lado2);
        System.out.println("Área del romboide: " + area);
        System.out.println("Perímetro del romboide: " + perimetro);
    }

    private void calcularTrapecio() {
        mostrar_datos();
        System.out.println("Ingrese el lado A: ");
        double Lado1 = sc1.nextDouble();
        System.out.println("Ingrese el lado B: ");
        double Lado2 = sc1.nextDouble();
        double area = ((Lado1 + Lado2) / 2) * Lado1; // Calculando el área con los lados calculados
        System.out.println("Ingrese la altura: ");
        double Altura = sc1.nextDouble();
        double perimetro = ((Lado1 + Lado2)* Altura);
        System.out.println("Área del trapecio: " + area);
        System.out.println("Perímetro del trapecio: " + perimetro);
    }
}
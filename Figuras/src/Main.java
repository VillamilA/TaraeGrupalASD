import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. Cuadrilátero");
            System.out.println("2. Triángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Otros");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Cuadrilateros cuadrado = new Cuadrilateros(4, "Cuadrado", "Cuadrado");
                    cuadrado.Eleccion();
                    break;

                case 2:
                    System.out.print("Ingrese el lado del triángulo: ");
                    Triangulos triangulo = new Triangulos(3,"Triangulo","Triangulo");
                    System.out.println("Área: " + triangulo.Calcular_Area());
                    System.out.println("Perímetro: " + triangulo.Calcular_Perimetro());
                    break;

                case 3:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radioCirculo = scanner.nextDouble();
                    Circulo circulo = new Circulo(0,"Circunferencia","Circulo");
                    System.out.println("Área: " + circulo.Calcular_AreaC());
                    System.out.println("Perímetro: " + circulo.Calcular_PerimetroC());
                    circulo.metodo_personalizado_circulo();
                    break;

                case 4:
                    System.out.print("Ingrese el lado del otro: ");
                    double ladoOtro = scanner.nextDouble();
                    Otros otro = new Otros(5, "Otro", 0, 0);
                    otro.metodo_personalizado_otros();
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 5.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
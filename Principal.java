import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el color de la figura: ");
        String color = scanner.nextLine();

        System.out.println("Ingrese el tipo de figura (1: Círculo, 2: Rectángulo, 3: Triángulo): ");
        int tipoFigura = scanner.nextInt();
        /**
         *Complejidad temporal: 0(1) tiempo constante
         */
        if (tipoFigura == 1) {
            System.out.println("Ingrese el radio del círculo: ");
            double radio = scanner.nextDouble();

            Circulo circulo = new Circulo(nombre, color, radio);

            System.out.println("Área del círculo: " + circulo.obtenerArea());
            System.out.println("Perímetro del círculo: " + circulo.obtenerPerimetro());
        } else if (tipoFigura == 2) {
            System.out.println("Ingrese el valor del lado 1 del rectángulo: ");
            double lado1 = scanner.nextDouble();
            System.out.println("Ingrese el valor del lado 2 del rectángulo: ");
            double lado2 = scanner.nextDouble();

            Rectangulo rectangulo = new Rectangulo(nombre, color, lado1, lado2);

            System.out.println("Área del rectángulo: " + rectangulo.obtenerArea());
            System.out.println("Perímetro del rectángulo: " + rectangulo.obtenerPerimetro());
        } else if (tipoFigura == 3) {
            System.out.println("Ingrese el valor de la base del triángulo: ");
            double lado1 = scanner.nextDouble();
            System.out.println("Ingrese el valor de la altura del triángulo: ");
            double lado2 = scanner.nextDouble();

            Triangulo triangulo = new Triangulo(nombre, color, lado1, lado2);

            System.out.println("Área del triángulo: " + triangulo.obtenerArea());
            System.out.println("Perímetro del triángulo: " + triangulo.obtenerPerimetro());
        } else {
            System.out.println("Tipo de figura no válido.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class CalculadoraDeAreas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione la figura para calcular el área:");
            System.out.println("1. Círculo");
            System.out.println("2. Triángulo");
            System.out.println("3. Cuadrado");
            System.out.println("4. Rectangulo");
            System.out.println("5. Salir ");
           

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularAreaCirculo();
                    break;
                case 2:
                    calcularAreaTriangulo();
                    break;
                case 3:
                    calcularAreaCuadrado();
                    break;
                 case 4:
                    calcularAreaRectangulo();
                    break;
                case 5:
                    System.out.println("¡buen dia ");
                    System.exit(0);
                    break;
               
               
                
            }
        }
    }

    private static void calcularAreaCirculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el radio del círculo:");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
    }

    private static void calcularAreaTriangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la base del triángulo:");
        double base = scanner.nextDouble();
        System.out.println("Introduce la altura del triángulo:");
        double altura = scanner.nextDouble();

        double area = 0.5 * base * altura;
        System.out.println("El área del triángulo es: " + area);
    }

    private static void calcularAreaCuadrado() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el lado del cuadrado:");
        double lado = scanner.nextDouble();

        double area = Math.pow(lado, 2);
        System.out.println("El área del cuadrado es: " + area);
    }
    public static void calcularAreaRectangulo() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce la base del rectangulo");
        double base=scanner.nextDouble();
        System.out.println("Introduce la altura del rectangulo:");
        double altura = scanner.nextDouble();

        double area = base * altura;
        System.out.println("El área del rectangulo es: " + area);
    }
        
    }

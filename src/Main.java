import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite radius(1) Kruga: ");
        Circle circle = new Circle(scanner.nextInt());
        System.out.println(circle.getPerimeter());
        System.out.println("-------------------------------------------");

        System.out.println("Vvedite parametr(1) Kvadrata: ");
        Square square = new Square(scanner.nextInt());
        System.out.println(square.getPerimeter());
        System.out.println("-------------------------------------------");

        System.out.println("Vvedite parametry(2) Pryamougolnika: ");
        Rectangle rectangle = new Rectangle(scanner.nextInt(), scanner.nextInt());
        System.out.println(rectangle.getPerimeter());
        System.out.println("-------------------------------------------");

        System.out.println("Vvedite parametry(3) Triugolnika: ");
        Triangle triangle = new Triangle(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(triangle.getPerimeter());
        System.out.println("-------------------------------------------");

        System.out.println("Vvedite parametry(3) Trapecii: ");
        Trapezoid trapezoid = new Trapezoid(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(trapezoid.getPerimeter());
    }
}
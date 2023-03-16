package area_perimeter_calculation;

public class Runner {

    public static void main(String[] args) {


      Triangle triangle = new Triangle();
      Shape square = new Square();
      Rectangle rectangle = new Rectangle();
      Shape shape = new Circle();

        System.out.println(String.format("%.0f", triangle.ucgenAlan(5, 10, 15)));
        System.out.println(triangle.ucgenCevre(5, 10, 15));

        System.out.println();

        System.out.println(square.alan(10));
        System.out.println(square.cevre(10));

        System.out.println();

        System.out.println(rectangle.alan(5, 10));
        System.out.println(rectangle.cevre(5, 10));

        System.out.println();

        System.out.println(shape.cevre(10));
        System.out.println(shape.alan(10));


    }








}

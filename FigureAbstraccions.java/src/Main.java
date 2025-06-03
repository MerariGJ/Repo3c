import Model.Circle;
import Model.FigureAbstraccions;
import Model.Square;
import Model.Triangle;

public class Main {
    public static void main(String[] args) {
        public class App {
            public static void main (String[] args) throws Exception {

                FigureAbstraccions sq = new Square(10);
                FigureAbstraccions cir = new Circle(10);
                FigureAbstraccions triangle = new Triangle(20, 25, 20);

                FigureAbs[] figures = { sq, cir, triangle };

                for (FigureAbs figureAbs : figures) {
                    System.out.println("La clase es: " + figureAbs.getClass().getSimpleName());
                    System.out.println("El area es: " + figureAbs.getArea());
                    System.out.println("El perimetro es: " + figureAbs.getPerimeter());
                    System.out.println("----------------------------------------------------");
                }

            }
        }

    }
}

package Module8;

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape cone = new Cone();
        Shape cube = new Cube();
        Shape octagon = new Octagon();
        Shape pentagon = new Pentagon();
        ShapePrint shapePrint = new ShapePrint();

        shapePrint.printName(circle);
        shapePrint.printName(cone);
        shapePrint.printName(octagon);
        shapePrint.printName(cube);
        shapePrint.printName(pentagon);

    }
}

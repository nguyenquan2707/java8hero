package quan;


interface Shape {
    void draw();
}

public class Lambda {
    public static void main(String[] args) {
            Shape rectangle = () -> System.out.println("Rectangle....");
//            rectangle.draw();

//            print(rectangle);

        //put implement directly
        print(() -> System.out.println("Rectangle..."));
    }

    private static void print(Shape shape) {
        shape.draw();
    }
}

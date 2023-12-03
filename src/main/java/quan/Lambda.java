package quan;


interface Shape {
    void draw();
}

public class Lambda {
    public static void main(String[] args) {
            Shape rectangle = () -> System.out.println("Rectangle....");
            rectangle.draw();
    }
}

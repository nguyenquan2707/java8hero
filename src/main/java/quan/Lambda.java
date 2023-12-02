package quan;


interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle....");
    }
}class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square....");
    }
}

public class Lambda {
    public static void main(String[] args) {
            Shape rectangle = () -> System.out.println("Rectangle....");
            rectangle.draw();
    }
}

package quan.defaultMethod;


interface Shape {
    void draw();

    //no need to modify the implementation class
    default void newMethod() {
        System.out.println("new method");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Cicle");
    }
}

class Retangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Retangle....");
    }
}

public class Lambda {
    public static void main(String[] args) {

        new Retangle().draw();

        //call new method
        new Retangle().newMethod();
    }

    private static void print(Shape shape) {
        shape.draw();
    }
}

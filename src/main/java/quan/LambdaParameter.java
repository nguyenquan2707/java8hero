package quan;


interface Addable {
    int add(int a, int b);
}

class AddableImpl implements Addable {

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
public class LambdaParameter {

    public static void main(String[] args) {
//        Addable addResult = (a, b) -> a + b;
//
//        int add = addResult.add(1, 2);
//        System.out.println(add);

        Addable addResult = (a, b) -> {
            int c = a + b;
            return c;
        };

        System.out.println(addResult.add(1, 2));

    }

}

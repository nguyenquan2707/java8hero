package quan;


class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("....");
    }
}

class RunnableMethodReference {
    public static void run() {
        System.out.println("Method reference.....");
    }
    public void runFromInstance() {
        System.out.println("Method reference is called from instance");
    }
}

public class RunnableLambdaEx {

    public static void main(String[] args) {
        new Thread(new ThreadDemo()).start();

        //
        new Thread(() -> {
            System.out.println("....");
            System.out.println("...........");
        }).start();

        //Method reference way.
        new Thread(RunnableMethodReference::run).start();

        //Method reference way from object
        RunnableMethodReference runnableMethodReference = new RunnableMethodReference();
        new Thread(runnableMethodReference::runFromInstance).start();
    }
}

package quan;


class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("....");
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
    }
}

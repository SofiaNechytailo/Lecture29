import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(() -> foo());
        pool.submit(() -> bar());
    }

    static void foo() {
        for (int i = 1; i<=10; i++){
            System.out.println("foo:" + i);
        }
    }
    static void bar() {
        for (int i = 1; i<=10; i++){
            System.out.println("bar:" + i);
        }
    }

}
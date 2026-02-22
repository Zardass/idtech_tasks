package month2;

import java.util.concurrent.*;

public class task23 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 1;i <= 5;i++) {
            int number = i;
            Callable<Integer> task = () -> {
                return number * number;
            };

            Future<Integer> result = executorService.submit(task);
            System.out.println(result.get());
        }
        executorService.shutdown();
    }
}

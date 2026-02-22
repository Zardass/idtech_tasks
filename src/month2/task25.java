package month2;

import java.util.List;
import java.util.concurrent.*;

public class task25 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        Callable<Integer> task = ()->
        {
            int fact = numbers.stream().reduce(1,(a,b)->(a*b));
            return fact;
        };
        Future<Integer> result = executorService.submit(task);
        System.out.println(result.get());
        executorService.shutdown();
    }
}

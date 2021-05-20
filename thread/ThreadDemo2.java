package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName:ThreadDemo2
 * Package:thread
 * Description:
 *
 * @Author:HP
 * @date:2021/5/20 21:21
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        //创建带缓存的线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

    }
}

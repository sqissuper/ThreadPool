package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName:ThreadDemo1
 * Package:thread
 * Description:
 *
 * @Author:HP
 * @date:2021/5/19 19:34
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        //创建固定个数的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);//创建10个线程

        //执行任务
        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

    }
}

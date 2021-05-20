package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * ClassName:ThreadDemo3
 * Package:thread
 * Description:
 *
 * @Author:HP
 * @date:2021/5/20 21:29
 */
public class ThreadDemo3 {
    private static int count = 1;
    //自定义线程工厂
    static class  MyThreadFactory implements ThreadFactory {

        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            //自定义线程池的名称
            thread.setName("myPool-" + count++);

            //设置优先级
            thread.setPriority(10);
            return thread;
        }
    }
    public static void main(String[] args) {
        //创建线程工厂
        ThreadFactory threadFactory = new MyThreadFactory();
        ExecutorService executorService = Executors.newFixedThreadPool(10,threadFactory);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名" + Thread.currentThread().getName() + ",优先级：" + Thread.currentThread().getPriority());
                }
            });
        }
    }
}

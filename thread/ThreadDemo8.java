package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName:ThreadDemo8
 * Package:thread
 * Description:
 *
 * @Author:HP
 * @date:2021/5/20 22:37
 */
public class ThreadDemo8 {
    static  class MyOOMClass {
        private byte[] bytes = new byte[1024 * 1024 * 1];
    }
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int finalI = i;
            service.execute(new Runnable() {
                @Override
                public void run() {
                    MyOOMClass oomClass = new MyOOMClass();
                    System.out.println("任务：" + finalI);
                }
            });
        }
    }
}

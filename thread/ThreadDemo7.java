package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName:ThreadDemo7
 * Package:thread
 * Description:
 *
 * @Author:HP
 * @date:2021/5/20 22:25
 */
public class ThreadDemo7 {
    public static void main(String[] args) {
        //创建一个异步（根据当前CPU生成的线程池）
        ExecutorService service = Executors.newWorkStealingPool();
        for (int i = 0; i < 10; i++) {
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程池：" + Thread.currentThread().getName());
                }
            });
        }
        //等待线程池执行完成
        while(!service.isTerminated()) {
        }
    }
}

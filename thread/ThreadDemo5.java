package thread;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ClassName:ThreadDemo5
 * Package:thread
 * Description:
 *
 * @Author:HP
 * @date:2021/5/20 22:12
 */
public class ThreadDemo5 {
    public static void main(String[] args) {
        //创建单个执行定时任务的线程池
        //是第三种的单机版本
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行任务：" + new Date());
            }
        },1,2, TimeUnit.SECONDS);
    }
}

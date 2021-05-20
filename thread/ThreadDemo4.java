package thread;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ClassName:ThreadDemo4
 * Package:thread
 * Description:
 *
 * @Author:HP
 * @date:2021/5/20 21:42
 */
public class ThreadDemo4 {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
        //方法一：每三秒执行一次
//        service.scheduleAtFixedRate(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("执行任务:" + new Date());
//            }
//        },1,3, TimeUnit.SECONDS);//1,线程执行的任务 2.延迟执行 3.定时任务执行的频率 4.配合2，3使用的，规定了时间的单位

        //方法二：
//        service.schedule(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("执行任务：" + new Date());
//            }
//        },1,TimeUnit.SECONDS);//只会执行一次

        //方法三：每三秒执行一次
        service.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行任务：" + new Date());
            }
        },1,3,TimeUnit.SECONDS);
    }
}

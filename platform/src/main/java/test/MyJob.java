package test;


import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.*;
import java.util.Calendar;

/**
 * @author xiaobianchen
 * @version 1.0 2016/1/22
 * @link https://github.com/xiaobianchen/DMC
 *
 * spring quartz test cases
 */
public class MyJob  implements Job {


    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println(new Date() + "  do something....");
    }

    public static void main(String[] args) {

        JobDetail jobDetail = new JobDetail();
        jobDetail.setJobClass(MyJob.class);
        jobDetail.setName("MyJob");
        jobDetail.setGroup("JobGroup");

        SimpleTrigger trigger = new SimpleTrigger();
        trigger.setName("trigger1");
        trigger.setGroup("trigger_group_1");
        trigger.setStartTime(new Date());

        java.util.Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis() + 1000 * 1L);
        trigger.setEndTime(calendar.getTime());

        trigger.setFireInstanceId("Trigger_id_001");
        trigger.setRepeatInterval(1000 * 1L);
        trigger.setRepeatCount(3);

        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = null;

        try {
            scheduler = schedulerFactory.getScheduler();
            scheduler.scheduleJob(jobDetail, trigger);
            //start scheduler
            scheduler.start();
//          scheduler.shutdown(true);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}

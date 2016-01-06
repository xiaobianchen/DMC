package com.dmc.infrastructure.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author xiaobianchen
 * @version 1.0 2016/1/4
 * @link https://github.com/xiaobianchen/DMC
 */
public class JobLaunch {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_batch.xml");

        JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("helloworldJob");
//        Job job = (Job) context.getBean("simpleFileImportJob");

        try {
            JobExecution result = (JobExecution) launcher.run(job, new JobParameters());
            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

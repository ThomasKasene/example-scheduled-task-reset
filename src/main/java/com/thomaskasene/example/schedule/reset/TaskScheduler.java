package com.thomaskasene.example.schedule.reset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Thomas Kåsene
 */
@Component
public class TaskScheduler {

    @Autowired
    private ApplicationContext applicationContext;

    @Scheduled(cron = "0/5 * * * * *")
    public void scheduleTask() {
        ScheduledTask task = applicationContext.getBean(ScheduledTask.class);
        task.execute();
    }
}

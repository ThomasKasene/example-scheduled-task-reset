package com.thomaskasene.example.schedule.reset;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

/**
 * @author Thomas Kåsene
 */
@Component
@Scope(SCOPE_PROTOTYPE)
class ScheduledTask {

    private double randomNumber = Math.random();

    void execute() {
        System.out.printf("Executing task from %s. Random number is %f%n", this, randomNumber);
    }
}

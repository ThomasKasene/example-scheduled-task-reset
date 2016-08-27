# Resetting Spring Schedule State
This example shows a barebones way to use the `@Scheduled` annotation in Spring Boot, and how one can configure it to reset the state of the executing task between each execution.

The background for this example is covered by the following blog post: http://stackoverflow.com/questions/39150879/reset-state-before-each-spring-scheduled-scheduled-run/

## How to Get

To check out the project, open Git Bash and enter the following:
```
git clone https://github.com/ThomasKasene/example-scheduled-task-reset.git
```

## Contents

This project contains the following:

* `Application`, which is annotated with `@SpringBootApplication` and, more importantly, `@EnableScheduling`
* `ScheduledTask`, which defines what should happen every time a task is executed. It's annotated with prototype scope so it's not a singleton bean
* `TaskScheduler`, which schedules the task for execution every 5 seconds
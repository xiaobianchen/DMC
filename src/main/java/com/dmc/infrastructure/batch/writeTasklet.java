package com.dmc.infrastructure.batch;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * @author xiaobianchen
 * @version 1.0 2016/1/4
 * @link https://github.com/xiaobianchen/DMC
 */
public class writeTasklet implements Tasklet {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        System.out.println(message);
        return RepeatStatus.FINISHED;
    }
}

package com.dmc.quartz;


import com.dmc.DBUtils;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author xiaobianchen
 * @version 1.0 2015/10/19
 * @link https://github.com/xiaobianchen/DMC
 * CallProcedure Job
 *
 */
public class CallProcedureJob extends QuartzJobBean {

    private DBUtils dbUtils;

    public void setDbUtils(DBUtils dbUtils) {
        this.dbUtils = dbUtils;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
         callProcedure();
    }

    @SuppressWarnings("static-access")
	public void callProcedure() {
        dbUtils.callProcedure();
    }
}

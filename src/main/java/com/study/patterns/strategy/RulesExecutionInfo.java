package com.study.patterns.strategy;

import java.util.Date;

public class RulesExecutionInfo {
	
	private Date businessDate;
	private long projectId;
	private String runStrategy;
	
	public Date getBusinessDate() {
		return businessDate;
	}
	public void setBusinessDate(Date businessDate) {
		this.businessDate = businessDate;
	}
	public long getProjectId() {
		return projectId;
	}
	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	public String getRunStrategy() {
		return runStrategy;
	}
	public void setRunStrategy(String runStrategy) {
		this.runStrategy = runStrategy;
	}
	
	
	
}

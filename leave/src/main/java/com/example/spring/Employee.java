package com.example.spring;

import java.util.Date;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

@Document
public class Employee {

	@Id
	private long empId;
	private String empName;
	private int totalLeave;
	private long bossId;
	private int jobLevel;
	private int remainingLeave;
	private boolean leaveAllocation;
	private int leaveDays;
	//Constructor 
	public Employee() {
	}
	//Getter Setter
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getTotalLeave() {
		return totalLeave;
	}
	public void setTotalLeave(int totalLeave) {
		this.totalLeave = totalLeave;
	}
	public long getBossId() {
		return bossId;
	}
	public void setBossId(long bossId) {
		this.bossId = bossId;
	}
	public int getJobLevel() {
		return jobLevel;
	}
	public void setJobLevel(int jobLevel) {
		this.jobLevel = jobLevel;
	}
	public int getRemainingLeave() {
		return remainingLeave;
	}
	public void setRemainingLeave(int remainingLeave) {
		this.remainingLeave = remainingLeave;
	}
	public boolean isLeaveAllocation() {
		return leaveAllocation;
	}
	public void setLeaveAllocation(boolean leaveAllocation) {
		this.leaveAllocation = leaveAllocation;
	}
	public int getLeaveDays() {
		return leaveDays;
	}
	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}
	
	
}

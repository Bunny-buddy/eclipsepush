package com.sujuka.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passport {
	@Id
	@GeneratedValue
	private Integer pid;
	private String pnum;
	private Date pissuedate;
	private Date pexpdate;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public Date getPissuedate() {
		return pissuedate;
	}
	public void setPissuedate(Date pissuedate) {
		this.pissuedate = pissuedate;
	}
	public Date getPexpdate() {
		return pexpdate;
	}
	public void setPexpdate(Date pexpdate) {
		this.pexpdate = pexpdate;
	}
	@Override
	public String toString() {
		return "pid=" + pid + ", pnum=" + pnum + ", pissuedate=" + pissuedate + ", pexpdate=" + pexpdate
				;
	}
	
	

}

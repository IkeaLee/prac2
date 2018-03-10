/**
 * 
 */
package com.neusoft.ssm.bean;

import java.util.Date;

/**
 * @author 1.jar
 * 2018年1月20日
 */
public class Feedback {
	private int fid; //反馈单编号
	private String fname; //反馈者姓名
	private String ftype; //反馈类别（意见、批评、表扬）
	private String[] temp_fname2; // 被投诉对象(数组类型的中间量，不是数据库中的实体）
	
	public String[] getTemp_fname2() {
		return temp_fname2;
	}
	public void setTemp_fname2(String[] temp_fname2) {
		this.temp_fname2 = temp_fname2;
	}
	private String fname2; //被批评或表扬的部门
	private String fcontent;//反馈内容
	private Date ftime;//反馈日期
	private String fstate;//反馈状态（已处理、未处理）
	private String fname3;//处理的客服姓名
	private String fnumber;//反馈者联系方式
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFtype() {
		return ftype;
	}
	public void setFtype(String ftype) {
		this.ftype = ftype;
	}
	public String getFname2() {
		return fname2;
	}
	public void setFname2(String fname2) {
		this.fname2 = fname2;
	}
	public String getFcontent() {
		return fcontent;
	}
	public void setFcontent(String fcontent) {
		this.fcontent = fcontent;
	}
	public Date getFtime() {
		return ftime;
	}
	public void setFtime(java.util.Date dtime) {
		this.ftime = dtime;
	}
	public String getFstate() {
		return fstate;
	}
	public void setFstate(String fstate) {
		this.fstate = fstate;
	}
	public String getFname3() {
		return fname3;
	}
	public void setFname3(String fname3) {
		this.fname3 = fname3;
	}
	public String getFnumber() {
		return fnumber;
	}
	public void setFnumber(String fnumber) {
		this.fnumber = fnumber;
	}
	@Override
	public String toString() {
		return "Feedback [fid=" + fid + ", fname=" + fname + ", ftype=" + ftype + ", objs=" + ", fname2=" + fname2 + ", fcontent=" + fcontent + ", ftime=" + ftime + ", fstate=" + fstate
				+ ", fname3=" + fname3 + ", fnumber=" + fnumber + "]";
	}
	
}

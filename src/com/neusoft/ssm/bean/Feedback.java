/**
 * 
 */
package com.neusoft.ssm.bean;

import java.util.Date;

/**
 * @author 1.jar
 * 2018��1��20��
 */
public class Feedback {
	private int fid; //���������
	private String fname; //����������
	private String ftype; //���������������������
	private String[] temp_fname2; // ��Ͷ�߶���(�������͵��м������������ݿ��е�ʵ�壩
	
	public String[] getTemp_fname2() {
		return temp_fname2;
	}
	public void setTemp_fname2(String[] temp_fname2) {
		this.temp_fname2 = temp_fname2;
	}
	private String fname2; //�����������Ĳ���
	private String fcontent;//��������
	private Date ftime;//��������
	private String fstate;//����״̬���Ѵ���δ����
	private String fname3;//����Ŀͷ�����
	private String fnumber;//��������ϵ��ʽ
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

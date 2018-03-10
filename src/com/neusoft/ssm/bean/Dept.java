package com.neusoft.ssm.bean;

import java.util.ArrayList;

public class Dept {
	private int deptno;
	private String dname;
	private String loc;
	private ArrayList<Emp> emplist;
	public ArrayList<Emp> getEmplist() {
		return emplist;
	}
	public void setEmplist(ArrayList<Emp> emplist) {
		this.emplist = emplist;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + ", emplist=" + emplist + "]";
	}
}

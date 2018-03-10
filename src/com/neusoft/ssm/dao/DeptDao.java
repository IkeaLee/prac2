package com.neusoft.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.neusoft.ssm.bean.Dept;
import com.neusoft.ssm.bean.Emp;

@Repository
public interface DeptDao {

	public List<Dept> findAll();
	public void dadd(Dept d);
	public Dept findByDno(Integer id);
	public void dupdate(Dept d);
	public void ddelete(Integer id);
	public Dept findById(Integer id);
	//public Dept findByDept(Integer deptno);
}

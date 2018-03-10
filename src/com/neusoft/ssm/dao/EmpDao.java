package com.neusoft.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.neusoft.ssm.bean.Dept;
import com.neusoft.ssm.bean.Emp;

@Repository
public interface EmpDao {
	public void add(Emp e);
	public void update(Emp e);
	public void deleteById(Integer id);
	public List<Emp> findAll();
	public List<Emp> findAllEmp();
	public Dept findByDept(Integer deptno);
	public List<Dept> findAllDept();
	public Emp findById(Integer id);
	public List<String> findAllJob();
}

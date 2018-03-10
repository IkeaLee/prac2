package com.neusoft.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.ssm.bean.Dept;
import com.neusoft.ssm.bean.Emp;
import com.neusoft.ssm.dao.EmpDao;

@Service
public class EmpService {
	@Autowired
	private EmpDao dao;
	
	public void add(Emp e) {
		dao.add(e);
	}
	public void update(Emp e) {
		dao.update(e);
	}
	public void deleteById(Integer id) {
		dao.deleteById(id);
	}
	public List<Emp> findAll(){
		return dao.findAll();
	}
	public List<Emp> findAllEmp(){
		return dao.findAllEmp();
	}
	public Emp findById(Integer id) {
		return dao.findById(id);
	}
	public List<String> findAllJob(){
		return dao.findAllJob();
	}
	public Dept findByDept(Integer id) {
		// TODO Auto-generated method stub
		return dao.findByDept(id);
	}
}

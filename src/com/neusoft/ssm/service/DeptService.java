package com.neusoft.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.ssm.bean.Dept;
import com.neusoft.ssm.dao.DeptDao;

@Service
public class DeptService {
	@Autowired
	private DeptDao dao;
	
	public List<Dept> findAll(){
		return dao.findAll();
	}
	public void dadd(Dept d) {
		dao.dadd(d);
	};
	public Dept findByDno(Integer id)
	{return dao.findByDno(id);};
	public void dupdate(Dept d)
	{dao.dupdate(d);};
	public void ddelete(Integer id) {
		dao.ddelete(id);
	}
	public List<Dept> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	};
	//public Dept findByDept(Integer deptno) {
		//return dao.findByDept(deptno);
	//}
}

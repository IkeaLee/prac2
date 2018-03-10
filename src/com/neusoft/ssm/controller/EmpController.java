package com.neusoft.ssm.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.ssm.bean.Dept;
import com.neusoft.ssm.bean.Emp;
import com.neusoft.ssm.service.DeptService;
import com.neusoft.ssm.service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmpService service;
	
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("/list")
	public String m1(Model model) {
		List<Emp> list = service.findAllEmp();
		model.addAttribute("list", list);
		return "emp/list";
	}
	@RequestMapping("/add")
	public String m2(Model model) {
		List<Emp> list = service.findAll();
		List<Dept> dlist = deptService.findAll();
		List<String> jlist = service.findAllJob();
		model.addAttribute("list", list);
		model.addAttribute("dlist", dlist);
		model.addAttribute("jlist", jlist);
		return "emp/add";
	}
	@RequestMapping("/update/{id}")
	public String m3(Model model, @PathVariable Integer id) {
		Emp e = service.findById(id);
		model.addAttribute("emp", e);
		List<Emp> list = service.findAll();
		List<Dept> dlist = deptService.findAll();
		List<String> jlist = service.findAllJob();
		model.addAttribute("list", list);
		model.addAttribute("dlist", dlist);
		model.addAttribute("jlist", jlist);
		return "emp/update";
	}
	@RequestMapping("/execadd")
	public void m4(HttpServletResponse response, Emp e) throws IOException {
		service.add(e);
		response.sendRedirect("list");
	}
	@RequestMapping("/execupdate")
	public void m5(HttpServletResponse response, Emp e) throws IOException {
		service.update(e);
		response.sendRedirect("list");
	}
	@RequestMapping("/execdelete/{id}")
	public void m6(HttpServletResponse response, @PathVariable Integer id) throws IOException {
		service.deleteById(id);
		response.sendRedirect("../list");
	}
}

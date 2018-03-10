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
@RequestMapping("/dept")
public class DeptController {
	@Autowired
	private EmpService service;
	
	@Autowired
	private DeptService dService;
	
	@RequestMapping("/list")
	public String m1(Model model) {
		List <Dept> list = dService.findAll();
		model.addAttribute("list", list);
		return "emp/list1";
	}
	@RequestMapping("/select/{id}")
	public String m3(Model model, @PathVariable Integer id) {
		Dept e = service.findByDept(id);
		model.addAttribute("list", e);
		System.out.println(e.toString());
		return "emp/select";
	}
	@RequestMapping("/add")
	public String m2(Model model) {
		
		return "emp/dadd";
	}
	@RequestMapping("/execadd")
	public void m4(HttpServletResponse response, Dept e) throws IOException {
		dService.dadd(e);
		response.sendRedirect("list");
	}
	@RequestMapping("/update/{id}")
	public String m5(Model model, @PathVariable Integer id) {
		Dept e = dService.findByDno(id);
		model.addAttribute("dept", e);
		
		return "emp/dupdate";
	}
	@RequestMapping("/execupdate")
	public void m5(HttpServletResponse response, Dept d) throws IOException {
		dService.dupdate(d);
		response.sendRedirect("list");
	}
	@RequestMapping("/execdelete/{id}")
	public void m6(HttpServletResponse response, @PathVariable Integer id) throws IOException {
		dService.ddelete(id);
		response.sendRedirect("../list");
	}
	@RequestMapping("/insideadd/{id}")
	public String m10(Model model, @PathVariable Integer id) {
		List<Emp> list = service.findAll();
		Dept dlist = dService.findByDno(id);
		List<String> jlist = service.findAllJob();
		model.addAttribute("list", list);
		model.addAttribute("dlist", dlist);
		model.addAttribute("jlist", jlist);
		return "emp/add";
	}
}

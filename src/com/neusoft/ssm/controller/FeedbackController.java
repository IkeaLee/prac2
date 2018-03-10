/**
 * 
 */
package com.neusoft.ssm.controller;


import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neusoft.ssm.bean.Feedback;
import com.neusoft.ssm.service.FeedbackService;




/**
 * @author 1.jar
 * 2018年1月20日
 */
@Controller
@RequestMapping("/feedback")
public class FeedbackController {
	@Autowired
	private FeedbackService feedbackservice;
	
	/*
	 * 反馈处理
	 */
	@RequestMapping("/list")//表示所有反馈的列表
	public String m1(Model model) {
		List<Feedback> list = feedbackservice.findAllFeedback();
		model.addAttribute("list", list);
		return "feedback/indexCs";
	}
	@RequestMapping("/line/{fid}")//表示反馈表的一行
	public String m2(Model model, @PathVariable int fid) {
		List<Feedback> line = feedbackservice.findFeedbackById(fid);
		model.addAttribute("line", line);
		return "feedback/detail";//该反馈的详情页面
	}
	@RequestMapping("/update/{fid}")
	public void m8(HttpServletResponse response, @PathVariable int fid)throws IOException {
		System.out.println(fid);
		feedbackservice.updateFeedback(fid);
		System.out.println("函数执行完了");
		response.sendRedirect("list");	
		
	}
	/*
	 * 添加意见
	 */
	@RequestMapping("/addViews")		//添加意见s
	public String m3(Model model) {
		return "feedback/addView";		//添加一个意见的页面
	}
	@RequestMapping("/addView")			//添加一个意见并点击提交后的跳转
	public void m4(HttpServletResponse response, Feedback f) throws IOException {
		Date day=new Date();
		Calendar rightNow=Calendar.getInstance();
		rightNow.setTime(day);
		Date ftime=rightNow.getTime();
		f.setFtime(ftime);		//获取系统时间
		//System.out.println(ftime);
		feedbackservice.addView(f);		//将时间和页面的表单数据存入数据库
		response.sendRedirect("list");		//重定位回到反馈列表
	}
	
	/*
	 * 添加表扬
	 */
	@RequestMapping("/addPraises")		
	public String m5(Model model) {
		return "feedback/addPraise";		
	}
	@RequestMapping("/addPraise")		
	public void m6(HttpServletResponse response, Feedback f) throws IOException {
		Date day=new Date();
		Calendar rightNow=Calendar.getInstance();
		rightNow.setTime(day);
		Date ftime=rightNow.getTime();
		f.setFtime(ftime);
		feedbackservice.addPraise(f);
		response.sendRedirect("list");
	}
	/*
	 * 新增批评
	 */
	@RequestMapping("/addCriticisms")		
	public String m7(Model model) {
		return "feedback/addCriticism";		
	}
	@RequestMapping("/addCriticism")		
	public void m8(HttpServletResponse response, Feedback f) throws IOException {
		Date day=new Date();
		Calendar rightNow=Calendar.getInstance();
		rightNow.setTime(day);
		Date ftime=rightNow.getTime();
		f.setFtime(ftime);
		//System.out.println(ftime);
		StringBuffer sb = new StringBuffer();
		for(String s : f.getTemp_fname2()) {
			sb.append(s + " ");
		}
		f.setFname2(sb.toString());
		System.out.println(sb.toString());
//		String fname21 = "";
//		String fname22 = "";
//		String fname23 = "";
//		String fname24 = "";
//		fname2=fname21+fname22+fname23+fname24;
		feedbackservice.addCriticism(f);
		response.sendRedirect("list");
	}
}

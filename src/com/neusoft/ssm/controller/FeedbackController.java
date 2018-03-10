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
 * 2018��1��20��
 */
@Controller
@RequestMapping("/feedback")
public class FeedbackController {
	@Autowired
	private FeedbackService feedbackservice;
	
	/*
	 * ��������
	 */
	@RequestMapping("/list")//��ʾ���з������б�
	public String m1(Model model) {
		List<Feedback> list = feedbackservice.findAllFeedback();
		model.addAttribute("list", list);
		return "feedback/indexCs";
	}
	@RequestMapping("/line/{fid}")//��ʾ�������һ��
	public String m2(Model model, @PathVariable int fid) {
		List<Feedback> line = feedbackservice.findFeedbackById(fid);
		model.addAttribute("line", line);
		return "feedback/detail";//�÷���������ҳ��
	}
	@RequestMapping("/update/{fid}")
	public void m8(HttpServletResponse response, @PathVariable int fid)throws IOException {
		System.out.println(fid);
		feedbackservice.updateFeedback(fid);
		System.out.println("����ִ������");
		response.sendRedirect("list");	
		
	}
	/*
	 * ������
	 */
	@RequestMapping("/addViews")		//������s
	public String m3(Model model) {
		return "feedback/addView";		//���һ�������ҳ��
	}
	@RequestMapping("/addView")			//���һ�����������ύ�����ת
	public void m4(HttpServletResponse response, Feedback f) throws IOException {
		Date day=new Date();
		Calendar rightNow=Calendar.getInstance();
		rightNow.setTime(day);
		Date ftime=rightNow.getTime();
		f.setFtime(ftime);		//��ȡϵͳʱ��
		//System.out.println(ftime);
		feedbackservice.addView(f);		//��ʱ���ҳ��ı����ݴ������ݿ�
		response.sendRedirect("list");		//�ض�λ�ص������б�
	}
	
	/*
	 * ��ӱ���
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
	 * ��������
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

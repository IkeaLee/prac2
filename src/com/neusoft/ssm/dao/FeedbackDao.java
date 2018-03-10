
/**
 * 
 */
package com.neusoft.ssm.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.neusoft.ssm.bean.Feedback;




/**
 * @author 1.jar
 * 2018年1月20日
 */
@Repository
public interface FeedbackDao {
	//public int viewCounter();			//计算总的意见数
	//public int criticismCounter();		//计算总的批评数
	//public int praiseCounter();		//计算总的表扬数
	public List<Feedback> findAllFeedback();		//查找所有反馈并按id减序（即新反馈在前，旧反馈在后）排列
	public List<Feedback> findFeedbackById(int fid);		//按id查询反馈
	public void updateFeedback(int fid);		//修改订单信息
	//public void addFeedback(Feedback f);
	public void addView(Feedback f);		//新增意见
	public void addPraise(Feedback f);		//新增表扬
	public void addCriticism(Feedback f);		//新增批评
	
}


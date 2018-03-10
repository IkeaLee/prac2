/**
 * 
 */
package com.neusoft.ssm.service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.ssm.bean.Feedback;
import com.neusoft.ssm.dao.FeedbackDao;
/**
 * @author 1.jar
 * 2018Äê1ÔÂ20ÈÕ
 */
@Service
public class FeedbackService {

	@Autowired
	private FeedbackDao dao;
	public List<Feedback> findAllFeedback() {
		//System.out.println("find");
		return dao.findAllFeedback();
	}
	public List<Feedback> findFeedbackById(int fid){
		return dao.findFeedbackById( fid);
	}
	public void updateFeedback(int fid) {
		dao.updateFeedback( fid);
	}
//	public void addFeedback(Feedback f) {
//		dao.addFeedback(f);
//	}
	public void addView(Feedback f) {
		dao.addView(f);
	}
	public void addPraise(Feedback f) {
		dao.addPraise(f);
	}
	public void addCriticism(Feedback f) {
		dao.addCriticism(f);
	}
}

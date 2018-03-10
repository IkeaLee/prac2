
/**
 * 
 */
package com.neusoft.ssm.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.neusoft.ssm.bean.Feedback;




/**
 * @author 1.jar
 * 2018��1��20��
 */
@Repository
public interface FeedbackDao {
	//public int viewCounter();			//�����ܵ������
	//public int criticismCounter();		//�����ܵ�������
	//public int praiseCounter();		//�����ܵı�����
	public List<Feedback> findAllFeedback();		//�������з�������id���򣨼��·�����ǰ���ɷ����ں�����
	public List<Feedback> findFeedbackById(int fid);		//��id��ѯ����
	public void updateFeedback(int fid);		//�޸Ķ�����Ϣ
	//public void addFeedback(Feedback f);
	public void addView(Feedback f);		//�������
	public void addPraise(Feedback f);		//��������
	public void addCriticism(Feedback f);		//��������
	
}


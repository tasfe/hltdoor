package com.hltdoor.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hltdoor.mapper.HFeedbackMapper;
import com.hltdoor.model.HFeedback;
import com.hltdoor.model.HFeedbackExample;
import com.hltdoor.rpc.FeedbackServiceInterface;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by linwei on 2016/12/24.
 * 评论
 */
@Service("feedbackService")
public class FeedbackService implements FeedbackServiceInterface {
    @Resource
    private HFeedbackMapper hFeedbackMapper;

    public void create(HFeedback hFeedback) {
        hFeedbackMapper.insert(hFeedback);
    }

    public void destroy(Integer integer) {
        HFeedbackExample example = new HFeedbackExample();
        HFeedbackExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(integer);
        hFeedbackMapper.deleteByExample(example);
    }

    public void update(HFeedback hFeedback) {
        HFeedbackExample example = new HFeedbackExample();
        HFeedbackExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(hFeedback.getId());
        hFeedbackMapper.updateByExample(hFeedback,example);
    }

    public HFeedback find(Integer integer) {
        HFeedbackExample example = new HFeedbackExample();
        HFeedbackExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(integer);
        try{
            return hFeedbackMapper.selectByExample(example).get(0);
        }catch (Exception e){
            return null;
        }
    }

    public PageInfo<HFeedback> get(Integer integer, String s,Integer page) {
        HFeedbackExample example = new HFeedbackExample();
        HFeedbackExample.Criteria criteria = example.createCriteria();
        if (page==null) page = 1;
        if (integer!=null)
            criteria.andHForEqualTo(integer);
        if (s!=null&&!"".equals(s))
            criteria.andHTypeEqualTo(s);
        example.setOrderByClause("id desc");
        PageHelper.startPage(page,5);
        List<HFeedback> list = hFeedbackMapper.selectByExample(example);
        return new PageInfo<HFeedback>(list);
    }
}

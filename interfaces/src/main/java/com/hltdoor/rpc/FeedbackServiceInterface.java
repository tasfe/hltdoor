package com.hltdoor.rpc;

import com.github.pagehelper.PageInfo;
import com.hltdoor.model.HFeedback;

/**
 * Created by linwei on 2016/12/24.
 * 留言
 */
public interface FeedbackServiceInterface {
    void create(HFeedback hFeedback);
    void destroy(Integer id);
    void update(HFeedback hFeedback);
    HFeedback find(Integer id);
    PageInfo<HFeedback> get(Integer hFor,String hType,Integer page);

}

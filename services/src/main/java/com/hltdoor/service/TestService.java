package com.hltdoor.service;


import com.hltdoor.mapper.HUsersMapper;
import com.hltdoor.model.HUsersExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by linwei on 2016/11/14.
 * test service
 */
@Service
public class TestService {
    @Resource
    private HUsersMapper hUsersMapper;
    public String test(){
        HUsersExample usersExample = new HUsersExample();
        HUsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andIdEqualTo(1);
        try{
            return hUsersMapper.selectByExample(usersExample).get(0).getEmail();
        }catch (Exception e)
        {
            return null;
        }

    }
}

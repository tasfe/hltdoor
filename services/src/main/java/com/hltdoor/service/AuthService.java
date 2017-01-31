package com.hltdoor.service;

import com.hltdoor.JwtUtil;
import com.hltdoor.mapper.HUsersMapper;
import com.hltdoor.model.HUsers;
import com.hltdoor.model.HUsersExample;
import org.apache.http.auth.AUTH;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;

/**
 * Created by linwei on 2016/11/15.
 * auth service
 */
@Service
@Transactional
public class AuthService {
    private final Logger logger = LogManager.getLogger(AuthService.class);
    @Resource
    private HUsersMapper hUsersMapper;
    public HUsers getUserByOpenId(String openId)
    {
        logger.debug(openId);
        if (openId == null ||openId.equals(""))
            return null;
        HUsersExample hUsersExample = new HUsersExample();
        HUsersExample.Criteria criteria = hUsersExample.createCriteria();
        criteria.andWechatOpenIdEqualTo(openId);
        try {
            return hUsersMapper.selectByExample(hUsersExample).get(0);
        }catch (Exception e)
        {
            logger.error(e.getMessage());
            return null;
        }
    }



}

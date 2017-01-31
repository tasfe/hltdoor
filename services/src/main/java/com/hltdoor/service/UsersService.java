package com.hltdoor.service;

import com.hltdoor.JwtUtil;
import com.hltdoor.mapper.HUserRolesMapper;
import com.hltdoor.mapper.HUsersMapper;
import com.hltdoor.model.HUserRoles;
import com.hltdoor.model.HUserRolesExample;
import com.hltdoor.model.HUsers;
import com.hltdoor.model.HUsersExample;
import com.hltdoor.rpc.auth.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by linwei on 2016/12/26.
 * auth
 */
@Transactional
@Service("usersService")
public class UsersService implements UserService {
    private static Logger logger = LogManager.getLogger(UsersService.class);
    @Resource
    private HUsersMapper hUsersMapper;
    @Resource
    private HUserRolesMapper hUserRolesMapper;

    public HUsers getUserByToken(String token) {
        HUsersExample example = new HUsersExample();
        HUsersExample.Criteria criteria = example.createCriteria();
        String openId = JwtUtil.getOpenId(token);
        criteria.andWechatOpenIdEqualTo(openId);

        try{
            return hUsersMapper.selectByExample(example).get(0);
        }catch (Exception e)
        {

            return null;
        }

    }

    public String getTokenByOpenId(String openId) {
        return JwtUtil.getToken(openId);

    }

    public void createNewUser(String openId)
    {
        HUsers hUsers = new HUsers();
        hUsers.setWechatOpenId(openId);
        hUsers.setId(null);
        hUsersMapper.insert(hUsers);
    }

    public List<HUserRoles> getRoles(Integer userId)
    {
        HUserRolesExample example = new HUserRolesExample();
        HUserRolesExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        return hUserRolesMapper.selectByExample(example);
    }
}

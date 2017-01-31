package com.hltdoor.rpc.auth;

import com.hltdoor.model.HUserRoles;
import com.hltdoor.model.HUsers;

import java.util.List;

/**
 * Created by linwei on 2016/11/14.
 * user service interface
 */
public interface UserService {
    HUsers getUserByToken(String token);
    String getTokenByOpenId(String openId);
    void createNewUser(String openId);
    List<HUserRoles> getRoles(Integer userId);

}

package com.hltdoor.controller;

import com.hltdoor.model.HUserRoles;
import com.hltdoor.model.HUsers;
import com.hltdoor.rpc.auth.UserService;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by linwei on 2016/12/28.
 * 管理员权限
 */
public class AdminInterceptor implements HandlerInterceptor {
    @Resource
    private UserService userService;

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        HttpSession session = httpServletRequest.getSession();
        HUsers users = (HUsers) session.getAttribute("user");
        if (users != null) {
            List<HUserRoles> roles = userService.getRoles(users.getId());
            for (HUserRoles tmp : roles) {
                if (tmp.getRoleId().equals(1)) {
                    session.setAttribute("CKFinder_UserRole","admin");
                    return true;
                }
            }
        }
        httpServletResponse.sendRedirect("/auth/login2");
        return false;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}

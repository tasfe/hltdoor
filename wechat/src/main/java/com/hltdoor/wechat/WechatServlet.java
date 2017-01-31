package com.hltdoor.wechat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ResourceBundle;

/**
 * Created by linwei on 2016/11/11.
 *
 */
public class WechatServlet extends HttpServlet{
    private static ResourceBundle lStrings = ResourceBundle.getBundle("javax.servlet.http.LocalStrings");
    private final Logger logger = LogManager.getLogger(WechatServlet.class);
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {

    }
}

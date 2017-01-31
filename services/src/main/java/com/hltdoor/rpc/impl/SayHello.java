package com.hltdoor.rpc.impl;

import com.hltdoor.rpc.test.SayHelloInterface;

/**
 * Created by linwei on 2016/11/15.
 *
 */
public class SayHello implements SayHelloInterface {
    public String speak() {
        return "hello";
    }
}
